package co.com.challengeddd.domain.jefe;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.jefe.events.*;
import co.com.challengeddd.domain.jefe.values.*;
import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class Jefe extends AggregateEvent<IdJefe> {

    protected Area area;
    protected Embalador embalador;
    protected Supervisor supervisor;

    public Jefe(IdJefe idJefe, Area area){
        super(idJefe);
        appendChange(new CreadoJefe(area)).apply();
    }

    private Jefe(IdJefe idJefe){
        super(idJefe);
        subscribe(new JefeChange(this));
    }

    public static Jefe from(IdJefe idJefe, List<DomainEvent> events){
        Jefe jefe = new Jefe(idJefe);
        events.forEach(jefe::applyEvent);
        return jefe;
    }

    public void asignarEmbalador(Nombre nombre, NumeroCelular numeroCelular, TipoEmbaladora tipoEmbaladora){
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(numeroCelular);
        Objects.requireNonNull(tipoEmbaladora);
        IdEmbalador id = new IdEmbalador();
        appendChange(new AsignadoEmbalador(id, nombre, numeroCelular, tipoEmbaladora)).apply();
    }

    public void asigarSupervisor(IdPersonalPatio idPersonalPatio, IdPersonalCosecha idPersonalCosecha, Nombre nombre, NumeroCelular numeroCelular){
        Objects.requireNonNull(idPersonalPatio);
        Objects.requireNonNull(idPersonalCosecha);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(numeroCelular);
        IdSupervisor id = new IdSupervisor();
        appendChange(new AsignadoSupervisor(id, idPersonalPatio, idPersonalCosecha, nombre, numeroCelular)).apply();
    }

    public void modificarEmbalador(Embalador embalador){
        Objects.requireNonNull(embalador);
        appendChange(new ModificadoEmbalador(embalador)).apply();
    }

    public void modificarSupervisor(Supervisor supervisor){
        Objects.requireNonNull(supervisor);
        appendChange(new ModificadoSupervisor(supervisor)).apply();
    }

    public void modificarArea(Area area){
        Objects.requireNonNull(area);
        appendChange(new ModificadaArea(area)).apply();
    }

    public void modificarNombreEmbalador(Nombre nombre){
        Objects.requireNonNull(nombre);
        appendChange(new ModificadoNombreEmbalador(nombre)).apply();
    }

    public void modificarNumeroCelularEmbalador(NumeroCelular numeroCelular){
        Objects.requireNonNull(numeroCelular);
        appendChange(new ModificadoNumeroCelularEmbalador(numeroCelular)).apply();
    }

    public void modificarTipoEmbaladoraEmbalador(TipoEmbaladora tipoEmbaladora){
        Objects.requireNonNull(tipoEmbaladora);
        appendChange(new ModificadaTipoEmbaladoraEmbalador(tipoEmbaladora)).apply();
    }

    public void modificarNombreSupervisor(Nombre nombre){
        Objects.requireNonNull(nombre);
        appendChange(new ModificadoNombreSupervisor(nombre)).apply();
    }

    public void modificarNumeroCelularSupervisor(NumeroCelular numeroCelular){
        Objects.requireNonNull(numeroCelular);
        appendChange(new ModificadoNumeroCelularSupervisor(numeroCelular)).apply();
    }

    public void modificarPersonalPatioSupervisor(IdPersonalPatio idPersonalPatio){
        Objects.requireNonNull(idPersonalPatio);
        appendChange(new ModificadoPersonalPatioSupervisor(idPersonalPatio)).apply();
    }

    public void modificarPersonalCosechaSupervisor(IdPersonalCosecha idPersonalCosecha){
        Objects.requireNonNull(idPersonalCosecha);
        appendChange(new ModificadoPersonalCosechaSupervisor(idPersonalCosecha)).apply();
    }

    public void AgregarInformeMateriaPrimaSupervisor(InformeMateriaPrima informeMateriaPrima){
        Objects.requireNonNull(informeMateriaPrima);
        appendChange(new AgregadoInformeMateriaPrimaSupervisor(informeMateriaPrima)).apply();
    }

    public void modificarInformeMateriaPrimaSupervisor(InformeMateriaPrima informeMateriaPrima){
        Objects.requireNonNull(informeMateriaPrima);
        appendChange(new ModificadoInformeMateriaPrimaSupervisor(informeMateriaPrima)).apply();
    }

    public Area area() {
        return area;
    }

    public Embalador embalador() {
        return embalador;
    }

    public Supervisor supervisor() {
        return supervisor;
    }
}
