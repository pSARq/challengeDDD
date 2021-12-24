package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreEmbalador extends Command {

    private final Nombre nombre;

    public ModificarNombreEmbalador(Nombre nombre){
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
