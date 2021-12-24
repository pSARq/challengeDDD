package co.com.challengeddd.domain.jefe.events;

import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoPersonalPatioSupervisor extends DomainEvent {
    private final IdPersonalPatio idPersonalPatio;

    public ModificadoPersonalPatioSupervisor(IdPersonalPatio idPersonalPatio) {
        super("challengeddd.domain.jefe.modificadopersonalpatiosupervisor");
        this.idPersonalPatio = idPersonalPatio;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }
}
