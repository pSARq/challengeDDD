package co.com.challengeddd.domain.personalcosecha;

import co.com.challengeddd.domain.personalcosecha.events.*;
import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class PersonalCosechaChange extends EventChange {

    private Tajador obtenerTajador(PersonalCosecha personalCosecha, IdTajador idTajador){
        return personalCosecha.obtenerTajadorPorId(idTajador)
                .orElseThrow(() -> new IllegalArgumentException("No se encontró al tajador"));
    }

    private CosechadorAgricola obtenerCosechadorAgricola(PersonalCosecha personalCosecha, IdCosechadorAgricola idCosechadorAgricola){
        return personalCosecha
                .obtenerCosechadorAgricolaPorId(idCosechadorAgricola)
                .orElseThrow(() -> new IllegalArgumentException("No se encontró al cosechador agricola"));
    }


    public PersonalCosechaChange(PersonalCosecha personalCosecha) {

        apply((CreadoPersonalCosecha event) ->{
            personalCosecha.horaEmpezarJornadaLaboral = event.getHoraEmpezarJornadaLaboral();
            personalCosecha.cosechadoresAgricolas = new HashSet<>();
            personalCosecha.tajadores = new HashSet<>();
        });

        apply((AgregadoTajador event) ->{
            personalCosecha.tajadores.add(new Tajador(
                    event.getId(),
                    event.getNombre(),
                    event.getNumeroCelular(),
                    event.getTipoCuchillo(),
                    event.getTecnicaTajado()
            ));
        });

        apply((AgregadoCosechadorAgricola event) ->{
            personalCosecha.cosechadoresAgricolas.add(new CosechadorAgricola(
                    event.getId(),
                    event.getNombre(),
                    event.getNumeroCelular(),
                    event.getTipoCuchillo(),
                    event.getSala(),
                    event.getTamañoChampiñon(),
                    event.getTipoBandeja()
            ));
        });

        apply((QuitadoTajador event) ->{
            IdTajador idTajador = event.getIdTajador();
            personalCosecha.tajadores.removeIf(tajador -> tajador.identity().equals(idTajador));
        });

        apply((QuitadoCosechadorAgricola event) ->{
            IdCosechadorAgricola idCosechadorAgricola = event.getIdCosechadorAgricola();
            personalCosecha.cosechadoresAgricolas
                    .removeIf(cosechadorAgricola ->  cosechadorAgricola.identity().equals(idCosechadorAgricola));
        });

        apply((ModificadaHoraEmpezarJornadaLaboral event) ->{
            personalCosecha.horaEmpezarJornadaLaboral = event.getHoraEmpezarJornadaLaboral();
        });

        apply((ModificadoNombreTajador event) ->{
            Tajador tajador = obtenerTajador(personalCosecha, event.getIdTajador());
            tajador.modificarNombre(event.getNombre());
        });

        apply((ModificadoNumeroCelularTajador event) ->{
            Tajador tajador = obtenerTajador(personalCosecha, event.getIdTajador());
            tajador.modificarNumeroCelular(event.getNumeroCelular());
        });

        apply((ModificadoTipoCuchilloTajador event) ->{
            Tajador tajador = obtenerTajador(personalCosecha, event.getIdTajador());
            tajador.modificarTipoCuchillo(event.getTipoCuchillo());
        });

        apply((ModificadaTecnicaTajadoTajador event) ->{
            Tajador tajador = obtenerTajador(personalCosecha, event.getIdTajador());
            tajador.modificarTecnicaTajado(event.getTecnicaTajado());
        });

        apply((ModificadoNombreCosechadorAgricola event) ->{
            CosechadorAgricola cosechadorAgricola = obtenerCosechadorAgricola(personalCosecha, event.getIdCosechadorAgricola());
            cosechadorAgricola.modificarNombre(event.getNombre());
        });

        apply((ModificadoNumeroCelularCosechadorAgricola event) ->{
            CosechadorAgricola cosechadorAgricola = obtenerCosechadorAgricola(personalCosecha, event.getIdCosechadorAgricola());
            cosechadorAgricola.modificarNumeroCelular(event.getNumeroCelular());
        });

        apply((ModificadoTipoCuchilloCosechadorAgricola event) ->{
            CosechadorAgricola cosechadorAgricola = obtenerCosechadorAgricola(personalCosecha, event.getIdCosechadorAgricola());
            cosechadorAgricola.modificarTipoCuchillo(event.getTipoCuchillo());
        });

        apply((ModificadaSalaCosechadorAgricola event) ->{
            CosechadorAgricola cosechadorAgricola = obtenerCosechadorAgricola(personalCosecha, event.getIdCosechadorAgricola());
            cosechadorAgricola.modificarSala(event.getSala());
        });

        apply((ModificadoTamañoChampiñonCosechadorAgricola event) ->{
            CosechadorAgricola cosechadorAgricola = obtenerCosechadorAgricola(personalCosecha, event.getIdCosechadorAgricola());
            cosechadorAgricola.modificarTamañoChampiñon(event.getTamañoChampiñon());
        });

        apply((ModificadoTipoBandejaCosechadorAgricola event) ->{
            CosechadorAgricola cosechadorAgricola = obtenerCosechadorAgricola(personalCosecha, event.getIdCosechadorAgricola());
            cosechadorAgricola.modificarTipoBandeja(event.getTipoBandeja());
        });
    }
}
