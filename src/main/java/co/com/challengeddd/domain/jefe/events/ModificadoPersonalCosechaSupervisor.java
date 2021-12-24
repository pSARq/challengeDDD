package co.com.challengeddd.domain.jefe.events;

import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoPersonalCosechaSupervisor extends DomainEvent {
    private final IdPersonalCosecha idPersonalCosecha;

    public ModificadoPersonalCosechaSupervisor(IdPersonalCosecha idPersonalCosecha) {
        super("challengeddd.domain.jefe.modificadopersonalcosechasupervisor");
        this.idPersonalCosecha = idPersonalCosecha;
    }

    public IdPersonalCosecha getIdPersonalCosecha() {
        return idPersonalCosecha;
    }
}
