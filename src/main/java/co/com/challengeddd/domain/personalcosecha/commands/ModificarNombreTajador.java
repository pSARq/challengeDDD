package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreTajador extends Command {

    private IdPersonalCosecha idPersonalCosecha;
    private final IdTajador idTajador;
    private final Nombre nombre;

    public ModificarNombreTajador(IdPersonalCosecha idPersonalCosecha, IdTajador idTajador, Nombre nombre){
        this.idPersonalCosecha = idPersonalCosecha;
        this.idTajador = idTajador;
        this.nombre = nombre;
    }

    public IdPersonalCosecha getIdPersonalCosecha() {
        return idPersonalCosecha;
    }

    public IdTajador getIdTajador() {
        return idTajador;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
