package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.sofka.domain.generic.Command;

public class QuitarTajador extends Command {

    private final IdTajador idTajador;

    public QuitarTajador(IdTajador idTajador){
        this.idTajador = idTajador;
    }

    public IdTajador getIdTajador() {
        return idTajador;
    }
}
