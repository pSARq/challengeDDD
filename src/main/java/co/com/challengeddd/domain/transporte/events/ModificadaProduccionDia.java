package co.com.challengeddd.domain.transporte.events;

import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadaProduccionDia extends DomainEvent {

    private final IdProduccionDia idProduccionDia;

    public ModificadaProduccionDia(IdProduccionDia idProduccionDia) {
        super("challengeddd.domain.transporte.modificadaproducciondia");
        this.idProduccionDia = idProduccionDia;
    }

    public IdProduccionDia getIdProduccionDia() {
        return idProduccionDia;
    }
}
