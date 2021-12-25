package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.Command;

public class QuitarSembrador extends Command {

    private final IdSembrador idSembrador;

    public QuitarSembrador(IdSembrador idSembrador){
        this.idSembrador = idSembrador;
    }

    public IdSembrador getIdSembrador() {
        return idSembrador;
    }
}
