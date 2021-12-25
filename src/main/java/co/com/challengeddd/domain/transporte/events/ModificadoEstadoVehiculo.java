package co.com.challengeddd.domain.transporte.events;

import co.com.challengeddd.domain.transporte.values.Estado;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoEstadoVehiculo extends DomainEvent {

    private final Estado estado;

    public ModificadoEstadoVehiculo(Estado estado) {
        super("challengeddd.domain.transporte.modificadoestadovehiculo");
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
