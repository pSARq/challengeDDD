package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreTajador extends Command {

    private final IdTajador idTajador;
    private final Nombre nombre;

    public ModificarNombreTajador(IdTajador idTajador, Nombre nombre){
        this.idTajador = idTajador;
        this.nombre = nombre;
    }

    public IdTajador getIdTajador() {
        return idTajador;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
