package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.transporte.values.CapacidadCarga;
import co.com.challengeddd.domain.transporte.values.IdTransporte;
import co.com.sofka.domain.generic.Command;

public class ModificarCapacidadCargaVehiculo extends Command {

    private IdTransporte idTransporte;
    private final CapacidadCarga capacidadCarga;

    public ModificarCapacidadCargaVehiculo(IdTransporte idTransporte, CapacidadCarga capacidadCarga){
        this.idTransporte = idTransporte;
        this.capacidadCarga = capacidadCarga;
    }

    public IdTransporte getIdTransporte() {
        return idTransporte;
    }

    public CapacidadCarga getCapacidadCarga() {
        return capacidadCarga;
    }
}
