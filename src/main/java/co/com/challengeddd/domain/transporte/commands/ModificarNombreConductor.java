package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreConductor extends Command {

    private final Nombre nombre;

    public ModificarNombreConductor(Nombre nombre){
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
