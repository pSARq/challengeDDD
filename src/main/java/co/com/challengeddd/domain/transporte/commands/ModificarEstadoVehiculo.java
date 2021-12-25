package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.transporte.values.Estado;
import co.com.sofka.domain.generic.Command;

public class ModificarEstadoVehiculo extends Command {

    private final Estado estado;

    public ModificarEstadoVehiculo(Estado estado){
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
