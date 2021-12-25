package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.transporte.values.CapacidadCarga;
import co.com.sofka.domain.generic.Command;

public class ModificarCapacidadCargaVehiculo extends Command {

    private final CapacidadCarga capacidadCarga;

    public ModificarCapacidadCargaVehiculo(CapacidadCarga capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }

    public CapacidadCarga getCapacidadCarga() {
        return capacidadCarga;
    }
}
