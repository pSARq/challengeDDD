package co.com.challengeddd.domain.personalcosecha;

import co.com.challengeddd.domain.general.values.*;
import co.com.challengeddd.domain.personalcosecha.events.*;
import co.com.challengeddd.domain.personalcosecha.values.*;
import co.com.challengeddd.domain.personalcosecha.events.ModificadaHoraEmpezarJornadaLaboral;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;


import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class PersonalCosecha extends AggregateEvent<IdPersonalCosecha> {

    protected HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral;
    protected Set<Tajador> tajadores;
    protected Set<CosechadorAgricola> cosechadoresAgricolas;

    public PersonalCosecha(IdPersonalCosecha idPersonalCosecha, HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral){
        super(idPersonalCosecha);
        appendChange(new CreadoPersonalCosecha(horaEmpezarJornadaLaboral)).apply();
    }

    private PersonalCosecha(IdPersonalCosecha idPersonalCosecha){
        super(idPersonalCosecha);
        subscribe(new PersonalCosechaChange(this));
    }

    public static PersonalCosecha from(IdPersonalCosecha idPersonalCosecha, List<DomainEvent> events){
        PersonalCosecha personalCosecha = new PersonalCosecha(idPersonalCosecha);
        events.forEach(personalCosecha::applyEvent);
        return personalCosecha;
    }

    public void agregarTajador(Nombre nombre, NumeroCelular numeroCelular, TipoCuchillo tipoCuchillo, TecnicaTajado tecnicaTajado){
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(numeroCelular);
        Objects.requireNonNull(tipoCuchillo);
        Objects.requireNonNull(tecnicaTajado);
        IdTajador id = new IdTajador();
        appendChange(new AgregadoTajador(id, nombre, numeroCelular, tipoCuchillo, tecnicaTajado)).apply();

    }

    public void agregarCosechadorAgricola(Nombre nombre, NumeroCelular numeroCelular, TipoCuchillo tipoCuchillo, Sala sala, TamañoChampiñon tamañoChampiñon, TipoBandeja tipoBandeja){
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(numeroCelular);
        Objects.requireNonNull(tipoCuchillo);
        Objects.requireNonNull(sala);
        Objects.requireNonNull(tamañoChampiñon);
        Objects.requireNonNull(tipoBandeja);
        IdCosechadorAgricola id = new IdCosechadorAgricola();
        appendChange(new AgregadoCosechadorAgricola(id, nombre, numeroCelular, tipoCuchillo, sala, tamañoChampiñon, tipoBandeja)).apply();
    }

    public void quitarTajador(IdTajador idTajador){
        Objects.requireNonNull(idTajador);
        appendChange(new QuitadoTajador(idTajador)).apply();
    }

    public void quitarCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola){
        Objects.requireNonNull(idCosechadorAgricola);
        appendChange(new QuitadoCosechadorAgricola(idCosechadorAgricola)).apply();
    }

    public void modificarHoraEmpezarJornadaLaboral(HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral){
        Objects.requireNonNull(horaEmpezarJornadaLaboral);
        appendChange(new ModificadaHoraEmpezarJornadaLaboral(horaEmpezarJornadaLaboral));
    }

    public void modificarNombreTajador(IdTajador idTajador, Nombre nombre){
        Objects.requireNonNull(idTajador);
        Objects.requireNonNull(nombre);
        appendChange(new ModificadoNombreTajador(idTajador, nombre)).apply();
    }

    public void modificarNumeroCelularTajador(IdTajador idTajador, NumeroCelular numeroCelular){
        Objects.requireNonNull(idTajador);
        Objects.requireNonNull(numeroCelular);
        appendChange(new ModificadoNumeroCelularTajador(idTajador, numeroCelular)).apply();
    }

    public void modificarTipoCuchilloTajador(IdTajador idTajador, TipoCuchillo tipoCuchillo){
        Objects.requireNonNull(idTajador);
        Objects.requireNonNull(tipoCuchillo);
        appendChange(new ModificadoTipoCuchilloTajador(idTajador, tipoCuchillo)).apply();
    }

    public void modificarTecnicaTajadoTajador(IdTajador idTajador, TecnicaTajado tecnicaTajado){
        Objects.requireNonNull(idTajador);
        Objects.requireNonNull(tecnicaTajado);
        appendChange(new ModificadaTecnicaTajadoTajador(idTajador, tecnicaTajado)).apply();
    }

    public void modificarNombreCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, Nombre nombre){
        Objects.requireNonNull(idCosechadorAgricola);
        Objects.requireNonNull(nombre);
        appendChange(new ModificadoNombreCosechadorAgricola(idCosechadorAgricola, nombre)).apply();
    }

    public void modificarNumeroCelularCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, NumeroCelular numeroCelular){
        Objects.requireNonNull(idCosechadorAgricola);
        Objects.requireNonNull(numeroCelular);
        appendChange(new ModificadoNumeroCelularCosechadorAgricola(idCosechadorAgricola, numeroCelular)).apply();
    }

    public void modificarTipoCuchilloCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, TipoCuchillo tipoCuchillo){
        Objects.requireNonNull(idCosechadorAgricola);
        Objects.requireNonNull(tipoCuchillo);
        appendChange(new ModificadoTipoCuchilloCosechadorAgricola(idCosechadorAgricola, tipoCuchillo)).apply();
    }

    public void modificarSalaCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, Sala sala){
        Objects.requireNonNull(idCosechadorAgricola);
        Objects.requireNonNull(sala);
        appendChange(new ModificadaSalaCosechadorAgricola(idCosechadorAgricola, sala)).apply();
    }

    public void modificarTamañoChampiñonCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, TamañoChampiñon tamañoChampiñon) {
        Objects.requireNonNull(idCosechadorAgricola);
        Objects.requireNonNull(tamañoChampiñon);
        appendChange(new ModificadoTamañoChampiñonCosechadorAgricola(idCosechadorAgricola, tamañoChampiñon)).apply();
    }

    public void modificarTipoBandejaCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, TipoBandeja tipoBandeja){
        Objects.requireNonNull(idCosechadorAgricola);
        Objects.requireNonNull(tipoBandeja);
        appendChange(new ModificadoTipoBandejaCosechadorAgricola(idCosechadorAgricola, tipoBandeja)).apply();
    }

    protected Optional<Tajador> obtenerTajadorPorId(IdTajador idTajador){
        return tajadores().stream()
                .filter(tajador -> tajador.identity().equals(idTajador)).findFirst();
    }

    protected Optional<CosechadorAgricola> obtenerCosechadorAgricolaPorId(IdCosechadorAgricola idCosechadorAgricola){
        return cosechadoresAgricolas().stream()
                .filter(cosechadorAgricola -> cosechadorAgricola.identity().equals(idCosechadorAgricola)).findFirst();
    }

    public HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral() {
        return horaEmpezarJornadaLaboral;
    }

    public Set<Tajador> tajadores() {
        return tajadores;
    }

    public Set<CosechadorAgricola> cosechadoresAgricolas() {
        return cosechadoresAgricolas;
    }
}
