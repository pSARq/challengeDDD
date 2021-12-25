package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.sofka.domain.generic.Command;

public class QuitarTajador extends Command {

    private IdPersonalCosecha idPersonalCosecha;
    private final IdTajador idTajador;

    public QuitarTajador(IdPersonalCosecha idPersonalCosecha, IdTajador idTajador){
        this.idPersonalCosecha = idPersonalCosecha;
        this.idTajador = idTajador;
    }

    public IdPersonalCosecha getIdPersonalCosecha() {
        return idPersonalCosecha;
    }

    public IdTajador getIdTajador() {
        return idTajador;
    }
}
