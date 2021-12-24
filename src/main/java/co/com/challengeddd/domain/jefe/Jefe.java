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
        appendChange(new CreadoJefe(area));
    }

    private Jefe(IdJefe idJefe){
        super(idJefe);
        subscribe(new jefeChange(this));
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
        appendChange(new AsignadoEmbalador(id, nombre, numeroCelular, tipoEmbaladora));
    }

    public void asigarSupervisor(IdPersonalPatio idPersonalPatio, IdPersonalCosecha idPersonalCosecha, Nombre nombre, NumeroCelular numeroCelular){
        Objects.requireNonNull(idPersonalPatio);
        Objects.requireNonNull(idPersonalCosecha);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(numeroCelular);
        IdSupervisor id = new IdSupervisor();
        appendChange(new AsignadoSupervisor(id, idPersonalPatio, idPersonalCosecha, nombre, numeroCelular));
    }

    public void modificarEmbalador(Embalador embalador){
        Objects.requireNonNull(embalador);
        appendChange(new ModificadoEmbalador(embalador));
    }

    public void modificarSupervisor(Supervisor supervisor){
        Objects.requireNonNull(supervisor);
        appendChange(new ModificadoSupervisor(supervisor));
    }

    public void modificarArea(Area area){
        Objects.requireNonNull(Area);
        appendChange(new ModificadaArea(area));
    }

    public void modificarNombreEmbalador(IdEmbalador idEmbalador, Nombre nombre){
        Objects.requireNonNull(idEmbalador);
        Objects.requireNonNull(nombre);
        appendChange(new ModificadoNombreEmbalador(idEmbalador, nombre));
    }

    public void modificarNumeroCelularEmbalador(IdEmbalador idEmbalador, NumeroCelular numeroCelular){
        Objects.requireNonNull(idEmbalador);
        Objects.requireNonNull(numeroCelular);
        appendChange(new ModificadoNumeroCelularEmbalador(idEmbalador, numeroCelular));
    }

    public void modificarTipoEmbaladoraEmbalador(IdEmbalador idEmbalador, NumeroCelular numeroCelular){
        Objects.requireNonNull(idEmbalador);
        Objects.requireNonNull(numeroCelular);
        appendChange(new ModificadaTipoEmbaladoraEmbalador(idEmbalador, numeroCelular));
    }

    public void modificarNombreSupervisor(IdSupervisor idSupervisor, Nombre nombre){
        Objects.requireNonNull(idSupervisor);
        Objects.requireNonNull(nombre);
        appendChange(new ModificadoNombreSupervisor(idSupervisor, nombre));
    }

    public void modificarNumeroCelularSupervisor(IdSupervisor idSupervisor, NumeroCelular numeroCelular){
        Objects.requireNonNull(idSupervisor);
        Objects.requireNonNull(numeroCelular);
        appendChange(new ModificadoNumeroCelularSupervisor(idSupervisor, numeroCelular));
    }

    public void modificarPersonalPatioSupervisor(IdSupervisor idSupervisor, IdPersonalPatio idPersonalPatio){
        Objects.requireNonNull(idSupervisor);
        Objects.requireNonNull(idPersonalPatio);
        appendChange(new ModificadoPersonalPatioSupervisor(idSupervisor, idPersonalPatio));
    }

    public void modificarPersonalCosechaSupervisor(IdSupervisor idSupervisor, IdPersonalCosecha idPersonalCosecha){
        Objects.requireNonNull(idSupervisor);
        Objects.requireNonNull(idPersonalCosecha);
        appendChange(new ModificadoPersonalCosechaSupervisor(idSupervisor, idPersonalCosecha));
    }

    public void AgregarInformeMateriaPrimaSupervisor(InformeMateriaPrima informeMateriaPrima){
        Objects.requireNonNull(informeMateriaPrima);
        appendChange(new AgregadoInformeMateriaPrimaSupervisor(informeMateriaPrima));
    }

    public void modificarInformeMateriaPrimaSupervisor(InformeMateriaPrima informeMateriaPrima){
        Objects.requireNonNull(informeMateriaPrima);
        appendChange(new ModificadoInformeMateriaPrimaSupervisor(informeMateriaPrima));
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
