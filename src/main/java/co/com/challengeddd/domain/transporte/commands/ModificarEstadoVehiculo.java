package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.transporte.values.Estado;
import co.com.challengeddd.domain.transporte.values.IdTransporte;
import co.com.sofka.domain.generic.Command;

public class ModificarEstadoVehiculo extends Command {

    private IdTransporte idTransporte;
    private final Estado estado;

    public ModificarEstadoVehiculo(IdTransporte idTransporte, Estado estado){
        this.idTransporte = idTransporte;
        this.estado = estado;
    }

    public IdTransporte getIdTransporte() {
        return idTransporte;
    }

    public Estado getEstado() {
        return estado;
    }
}
