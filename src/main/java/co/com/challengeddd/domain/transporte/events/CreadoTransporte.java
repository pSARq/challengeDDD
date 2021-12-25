package co.com.challengeddd.domain.transporte.events;

import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.sofka.domain.generic.DomainEvent;

public class CreadoTransporte extends DomainEvent {

    private final IdProduccionDia idProduccionDia;

    public CreadoTransporte(IdProduccionDia idProduccionDia) {
        super("challengeddd.domain.transporte.creadotransporte");
        this.idProduccionDia = idProduccionDia;
    }

    public IdProduccionDia getIdProduccionDia() {
        return idProduccionDia;
    }
}
