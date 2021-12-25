package co.com.challengeddd.domain.transporte;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.domain.transporte.events.*;
import co.com.challengeddd.domain.transporte.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class Transporte extends AggregateEvent<IdTransporte> {

    protected IdProduccionDia idProduccionDia;
    protected Conductor conductor;
    protected Vehiculo vehiculo;

    public Transporte(IdTransporte idTransporte, IdProduccionDia idProduccionDia){
        super(idTransporte);
        appendChange(new CreadoTransporte(idProduccionDia)).apply();
    }

    private Transporte(IdTransporte idTransporte){
        super(idTransporte);
        subscribe(new TransporteChange(this));
    }

    public static Transporte from(IdTransporte idTransporte, List<DomainEvent> events){
        Transporte transporte = new Transporte(idTransporte);
        events.forEach(transporte::applyEvent);
        return transporte;
    }

    public void AsignarConductor(Nombre nombre, NumeroCelular numeroCelular, Licencia licencia){
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(numeroCelular);
        Objects.requireNonNull(licencia);
        IdConductor id = new IdConductor();
        appendChange(new AsignadoConductor(id, nombre, numeroCelular, licencia)).apply();
    }

    public void AsignarVehiculo(Estado estado, CapacidadCarga capacidadCarga){
        Objects.requireNonNull(estado);
        Objects.requireNonNull(capacidadCarga);
        IdVehiculo id = new IdVehiculo();
        appendChange(new AsignadoVehiculo(id, estado, capacidadCarga)).apply();
    }

    public void modificarConductor(Conductor conductor){
        Objects.requireNonNull(conductor);
        appendChange(new ModificadoConductor(conductor));
    }

    public void modificarVehiculo(Vehiculo vehiculo){
        Objects.requireNonNull(vehiculo);
        appendChange(new ModificadoVehiculo(vehiculo)).apply();
    }

    public void modificarProduccionDia(IdProduccionDia idProduccionDia){
        Objects.requireNonNull(idProduccionDia);
        appendChange(new ModificadaProduccionDia(idProduccionDia)).apply();
    }

    public void modificarNombreConductor(Nombre nombre){
        Objects.requireNonNull(nombre);
        appendChange(new ModificadoNombreConductor(nombre));
    }

    public void modificarNumeroCelularConductor(NumeroCelular numeroCelular){
        Objects.requireNonNull(numeroCelular);
        appendChange(new ModificadoNumeroCelularConductor(numeroCelular) ).apply();
    }

    public void modificarLicenciaConductor(Licencia licencia){
        Objects.requireNonNull(licencia);
        appendChange(new ModificadaLicenciaConductor(licencia)).apply();
    }

    public void modificarEstadoVehiculo(Estado estado){
        Objects.requireNonNull(estado);
        appendChange(new ModificadoEstadoVehiculo(estado)).apply();
    }

    public void modificarCapacidadCargaVehiculo(CapacidadCarga capacidadCarga){
        Objects.requireNonNull(capacidadCarga);
        appendChange(new ModificadaCapacidadCargaVehiculo(capacidadCarga)).apply();
    }

    public IdProduccionDia idProduccionDia() {
        return idProduccionDia;
    }

    public Conductor conductor() {
        return conductor;
    }

    public Vehiculo vehiculo() {
        return vehiculo;
    }
}
