package co.com.challengeddd.domain.transporte.events;

import co.com.challengeddd.domain.transporte.values.CapacidadCarga;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadaCapacidadCargaVehiculo extends DomainEvent {

    private final CapacidadCarga capacidadCarga;

    public ModificadaCapacidadCargaVehiculo(CapacidadCarga capacidadCarga) {
        super("challengeddd.domain.transporte.modificadacapacidadcargavehiculo");
        this.capacidadCarga = capacidadCarga;
    }

    public CapacidadCarga getCapacidadCarga() {
        return capacidadCarga;
    }
}
