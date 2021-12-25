package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.transporte.Vehiculo;
import co.com.challengeddd.domain.transporte.values.IdTransporte;
import co.com.sofka.domain.generic.Command;

public class ModificarVehiculo extends Command {

    private IdTransporte idTransporte;
    private final Vehiculo vehiculo;

    public ModificarVehiculo(IdTransporte idTransporte, Vehiculo vehiculo){
        this.idTransporte = idTransporte;
        this.vehiculo = vehiculo;
    }

    public IdTransporte getIdTransporte() {
        return idTransporte;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
