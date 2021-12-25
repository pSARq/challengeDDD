package co.com.challengeddd.domain.personalpatio;

import co.com.challengeddd.domain.general.values.HoraEmpezarJornadaLaboral;
import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.general.values.Sala;
import co.com.challengeddd.domain.personalpatio.events.*;
import co.com.challengeddd.domain.personalpatio.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.*;

public class PersonalPatio extends AggregateEvent<IdPersonalPatio> {

    protected HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral;
    protected HoraTerminarJornadaLaboral horaTerminarJornadaLaboral;
    protected Set<Fumigador> fumigadores;
    protected Set<Sembrador> sembradores;

    public PersonalPatio(IdPersonalPatio idPersonalPatio, HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral, HoraTerminarJornadaLaboral horaTerminarJornadaLaboral){
        super(idPersonalPatio);
        this.horaEmpezarJornadaLaboral = horaEmpezarJornadaLaboral;
        this.horaTerminarJornadaLaboral = horaTerminarJornadaLaboral;
        appendChange(new CreadoPersonalPatio(horaEmpezarJornadaLaboral, horaTerminarJornadaLaboral)).apply();
    }

    private PersonalPatio(IdPersonalPatio idPersonalPatio){
        super(idPersonalPatio);
        subscribe(new PersonalPatioChange(this));
    }

    public static PersonalPatio from(IdPersonalPatio idPersonalPatio, List<DomainEvent> events){
        PersonalPatio personalPatio = new PersonalPatio(idPersonalPatio);
        events.forEach(personalPatio::applyEvent);
        return personalPatio;
    }

    public void agregarFumigador(Nombre nombre, NumeroCelular numeroCelular, AreaAFumigar areaAFumigar, Veneno veneno){
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(numeroCelular);
        Objects.requireNonNull(areaAFumigar);
        Objects.requireNonNull(veneno);
        IdFumigador id = new IdFumigador();
        appendChange(new AgregadoFumigador(id, nombre, numeroCelular, areaAFumigar, veneno)).apply();
    }

    public void agregarSembrador(Nombre nombre, NumeroCelular numeroCelular, Sala sala, HerramientaTrabajo herramientaTrabajo){
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(numeroCelular);
        Objects.requireNonNull(sala);
        Objects.requireNonNull(herramientaTrabajo);
        IdSembrador id = new IdSembrador();
        appendChange(new AgregadoSembrador(id, nombre, numeroCelular, sala, herramientaTrabajo)).apply();
    }

    public void quitarFumigador(IdFumigador idFumigador){
        Objects.requireNonNull(idFumigador);
        appendChange(new QuitadoFumigador(idFumigador)).apply();

    }

    public void quitarSembrador(IdSembrador idSembrador){
        Objects.requireNonNull(idSembrador);
        appendChange(new QuitadoSembrador(idSembrador)).apply();
    }

    public void modificarHoraEmpezarJornadaLaboral(HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral){
        Objects.requireNonNull(horaEmpezarJornadaLaboral);
        appendChange(new ModificadaHoraEmpezarJornadaLaboral(horaEmpezarJornadaLaboral)).apply();
    }

    public void modificarHoraTerminarJornadaLaboral(HoraTerminarJornadaLaboral horaTerminarJornadaLaboral){
        Objects.requireNonNull(horaTerminarJornadaLaboral);
        appendChange(new ModificadaHoraTerminarJornadaLaboral(horaTerminarJornadaLaboral)).apply();
    }

    public void modificarNombreFumigador(IdFumigador idFumigador, Nombre nombre){
        Objects.requireNonNull(idFumigador);
        Objects.requireNonNull(nombre);
        appendChange(new ModificadoNombreFumigador(idFumigador, nombre)).apply();
    }

    public void modificarNumeroCelularFumigador(IdFumigador idFumigador, NumeroCelular numeroCelular){
        Objects.requireNonNull(idFumigador);
        Objects.requireNonNull(numeroCelular);
        appendChange(new ModificadoNumeroCelularFumigador(idFumigador, numeroCelular));
    }

    public void modificarAreaAFumigarFumigador(IdFumigador idFumigador, AreaAFumigar areaAFumigar){
        Objects.requireNonNull(idFumigador);
        Objects.requireNonNull(areaAFumigar);
        appendChange(new ModificadaAreaAFumigarFumigador(idFumigador, areaAFumigar)).apply();
    }

    public void modificarVenenoFumigador(IdFumigador idFumigador, Veneno veneno){
        Objects.requireNonNull(idFumigador);
        Objects.requireNonNull(veneno);
        appendChange(new ModificadoVenenoFumigador(idFumigador, veneno)).apply();
    }

    public void modificarNombreSembrador(IdSembrador idSembrador, Nombre nombre){
        Objects.requireNonNull(idSembrador);
        Objects.requireNonNull(nombre);
        appendChange(new ModificadoNombreSembrador(idSembrador, nombre)).apply();
    }

    public void modificarNumeroCelularSembrador(IdSembrador idSembrador, NumeroCelular numeroCelular){
        Objects.requireNonNull(idSembrador);
        Objects.requireNonNull(numeroCelular);
        appendChange(new ModificadoNumeroCelularSembrador(idSembrador, numeroCelular)).apply();
    }

    public void modificarSalaSembrador(IdSembrador idSembrador, Sala sala){
        Objects.requireNonNull(idSembrador);
        Objects.requireNonNull(sala);
        appendChange(new ModificadaSalaSembrador(idSembrador, sala)).apply();
    }

    public void modificarHerramientaTrabajoSembrador(IdSembrador idSembrador, HerramientaTrabajo herramientaTrabajo){
        Objects.requireNonNull(idSembrador);
        Objects.requireNonNull(herramientaTrabajo);
        appendChange(new ModificadaHerramientaTrabajoSembrador(idSembrador, herramientaTrabajo));
    }


    protected Optional<Fumigador> obtenerFumigadorPorId(IdFumigador idFumigador){
        return fumigadores().stream()
                .filter(fumigador -> fumigador.identity().equals(idFumigador)).findFirst();
    }

    protected Optional<Sembrador> obtenerSembradorPorId(IdSembrador idSembrador){
        return sembradores().stream()
                .filter(sembrador -> sembrador.identity().equals(idSembrador)).findFirst();
    }

    public HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral() {
        return horaEmpezarJornadaLaboral;
    }

    public HoraTerminarJornadaLaboral horaTerminarJornadaLaboral() {
        return horaTerminarJornadaLaboral;
    }

    public Set<Fumigador> fumigadores() {
        return fumigadores;
    }

    public Set<Sembrador> sembradores() {
        return sembradores;
    }
}
