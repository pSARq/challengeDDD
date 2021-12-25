package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreEmbalador extends Command {

    private IdJefe idJefe;
    private final Nombre nombre;

    public ModificarNombreEmbalador(IdJefe idJefe, Nombre nombre){
        this.idJefe = idJefe;
        this.nombre = nombre;
    }

    public IdJefe getIdJefe() {
        return idJefe;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
