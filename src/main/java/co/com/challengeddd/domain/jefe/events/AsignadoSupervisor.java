package co.com.challengeddd.domain.jefe.events;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.jefe.values.IdSupervisor;
import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.sofka.domain.generic.DomainEvent;

public class AsignadoSupervisor extends DomainEvent {

    private final IdSupervisor id;
    private final IdPersonalPatio idPersonalPatio;
    private final IdPersonalCosecha idPersonalCosecha;
    private final Nombre nombre;
    private final NumeroCelular numeroCelular;

    public AsignadoSupervisor(IdSupervisor id, IdPersonalPatio idPersonalPatio, IdPersonalCosecha idPersonalCosecha, Nombre nombre, NumeroCelular numeroCelular) {
        super("challengeddd.domain.jefe.asignadosupervisor");
        this.id = id;
        this.idPersonalPatio = idPersonalPatio;
        this.idPersonalCosecha = idPersonalCosecha;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
    }

    public IdSupervisor getId() {
        return id;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }

    public IdPersonalCosecha getIdPersonalCosecha() {
        return idPersonalCosecha;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
