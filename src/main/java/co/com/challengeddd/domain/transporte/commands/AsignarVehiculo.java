package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.transporte.values.CapacidadCarga;
import co.com.challengeddd.domain.transporte.values.Estado;
import co.com.challengeddd.domain.transporte.values.IdTransporte;
import co.com.sofka.domain.generic.Command;

public class AsignarVehiculo extends Command {

    private IdTransporte idTransporte;
    private final Estado estado;
    private final CapacidadCarga capacidadCarga;

    public AsignarVehiculo(IdTransporte idTransporte, Estado estado, CapacidadCarga capacidadCarga){
        this.idTransporte = idTransporte;
        this.estado = estado;
        this.capacidadCarga = capacidadCarga;
    }

    public IdTransporte getIdTransporte() {
        return idTransporte;
    }

    public Estado getEstado() {
        return estado;
    }

    public CapacidadCarga getCapacidadCarga() {
        return capacidadCarga;
    }
}
