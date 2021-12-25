package co.com.challengeddd.domain.personalpatio;

import co.com.challengeddd.domain.personalpatio.events.*;
import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class PersonalPatioChange extends EventChange {

    private Fumigador obtenerFumigador(PersonalPatio personalPatio, IdFumigador idFumigador){
        return personalPatio.obtenerFumigadorPorId(idFumigador)
                .orElseThrow(() -> new IllegalArgumentException("No se encontró al fumigador"));
    }

    private Sembrador obtenerSembrador(PersonalPatio personalPatio, IdSembrador idSembrador){
        return personalPatio.obtenerSembradorPorId(idSembrador)
                .orElseThrow(() -> new IllegalArgumentException("No se encontró al sembrador"));

    }

    public PersonalPatioChange(PersonalPatio personalPatio) {

        apply((CreadoPersonalPatio event) ->{
            personalPatio.horaEmpezarJornadaLaboral = event.getHoraEmpezarJornadaLaboral();
            personalPatio.horaTerminarJornadaLaboral = event.getHoraTerminarJornadaLaboral();
            personalPatio.fumigadores = new HashSet<>();
            personalPatio.sembradores = new HashSet<>();
        });

        apply((AgregadoFumigador event) ->{
            personalPatio.fumigadores.add(new Fumigador(
                    event.getId(),
                    event.getNombre(),
                    event.getNumeroCelular(),
                    event.getAreaAFumigar(),
                    event.getVeneno()
            ));
        });

        apply((AgregadoSembrador event) ->{
            personalPatio.sembradores.add(new Sembrador(
                    event.getId(),
                    event.getNombre(),
                    event.getNumeroCelular(),
                    event.getSala(),
                    event.getHerramientaTrabajo()
            ));
        });

        apply((QuitadoFumigador event) ->{
            IdFumigador idFumigador = event.getIdFumigador();
            personalPatio.fumigadores.removeIf(fumigador -> fumigador.identity().equals(idFumigador));
        });

        apply((QuitadoSembrador event) ->{
            IdSembrador idSembrador = event.getIdSembrador();
            personalPatio.sembradores.removeIf(sembrador -> sembrador.identity().equals(idSembrador));
        });

        apply((ModificadaHoraEmpezarJornadaLaboral event) ->{
            personalPatio.horaEmpezarJornadaLaboral = event.getHoraEmpezarJornadaLaboral();
        });

        apply((ModificadaHoraTerminarJornadaLaboral event) ->{
            personalPatio.horaTerminarJornadaLaboral = event.getHoraTerminarJornadaLaboral();
        });

        apply((ModificadoNombreFumigador event) ->{
            Fumigador fumigador = obtenerFumigador(personalPatio, event.getIdFumigador());
            fumigador.modificarNombre(event.getNombre());
        });

        apply((ModificadoNumeroCelularFumigador event) ->{
            Fumigador fumigador = obtenerFumigador(personalPatio, event.getIdFumigador());
            fumigador.modificarNumeroCelular(event.getNumeroCelular());
        });

        apply((ModificadaAreaAFumigarFumigador event) ->{
            Fumigador fumigador = obtenerFumigador(personalPatio, event.getIdFumigador());
            fumigador.modificarAreaAFumigar(event.getAreaAFumigar());
        });

        apply((ModificadoVenenoFumigador event) ->{
            Fumigador fumigador = obtenerFumigador(personalPatio, event.getIdFumigador());
            fumigador.modificarVeneno(event.getVeneno());
        });

        apply((ModificadoNombreSembrador event) ->{
            Sembrador sembrador = obtenerSembrador(personalPatio, event.getIdSembrador());
            sembrador.modificarNombre(event.getNombre());
        });

        apply((ModificadoNumeroCelularSembrador event) ->{
            Sembrador sembrador = obtenerSembrador(personalPatio, event.getIdSembrador());
            sembrador.modificarNumeroCelular(event.getNumeroCelular());
        });

        apply((ModificadaSalaSembrador event) ->{
            Sembrador sembrador = obtenerSembrador(personalPatio, event.getIdSembrador());
            sembrador.modificarSala(event.getSala());
        });

        apply((ModificadaHerramientaTrabajoSembrador event) ->{
            Sembrador sembrador = obtenerSembrador(personalPatio, event.getIdSembrador());
            sembrador.modificarHerramientaTrabajo(event.getHerramientaTrabajo());
        });
    }
}
