package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.transporte.values.IdTransporte;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreConductor extends Command {

    private IdTransporte idTransporte;
    private final Nombre nombre;

    public ModificarNombreConductor(IdTransporte idTransporte, Nombre nombre){
        this.idTransporte = idTransporte;
        this.nombre = nombre;
    }

    public IdTransporte getIdTransporte() {
        return idTransporte;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
