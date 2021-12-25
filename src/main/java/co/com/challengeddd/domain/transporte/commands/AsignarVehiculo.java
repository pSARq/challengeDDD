package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.transporte.values.CapacidadCarga;
import co.com.challengeddd.domain.transporte.values.Estado;
import co.com.sofka.domain.generic.Command;

public class AsignarVehiculo extends Command {

    private final Estado estado;
    private final CapacidadCarga capacidadCarga;

    public AsignarVehiculo(Estado estado, CapacidadCarga capacidadCarga){
        this.estado = estado;
        this.capacidadCarga = capacidadCarga;
    }

    public Estado getEstado() {
        return estado;
    }

    public CapacidadCarga getCapacidadCarga() {
        return capacidadCarga;
    }
}
