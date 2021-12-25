package co.com.challengeddd.domain.transporte.events;

import co.com.challengeddd.domain.transporte.values.CapacidadCarga;
import co.com.challengeddd.domain.transporte.values.Estado;
import co.com.challengeddd.domain.transporte.values.IdVehiculo;
import co.com.sofka.domain.generic.DomainEvent;

public class AsignadoVehiculo extends DomainEvent {

    private final IdVehiculo id;
    private final Estado estado;
    private final CapacidadCarga capacidadCarga;

    public AsignadoVehiculo(IdVehiculo id, Estado estado, CapacidadCarga capacidadCarga) {
        super("challengeddd.domain.transporte.asignadovehiculo");
        this.id = id;
        this.estado = estado;
        this.capacidadCarga = capacidadCarga;
    }

    public IdVehiculo getId() {
        return id;
    }

    public Estado getEstado() {
        return estado;
    }

    public CapacidadCarga getCapacidadCarga() {
        return capacidadCarga;
    }
}
