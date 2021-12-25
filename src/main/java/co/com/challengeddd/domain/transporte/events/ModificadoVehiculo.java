package co.com.challengeddd.domain.transporte.events;

import co.com.challengeddd.domain.transporte.Vehiculo;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoVehiculo extends DomainEvent {

    private final Vehiculo vehiculo;

    public ModificadoVehiculo(Vehiculo vehiculo) {
        super("challengeddd.domain.transporte.modificadovehiculo");
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
