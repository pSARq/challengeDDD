package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.transporte.Vehiculo;
import co.com.sofka.domain.generic.Command;

public class ModificarVehiculo extends Command {

    private final Vehiculo vehiculo;

    public ModificarVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
