package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.Command;

public class QuitarSembrador extends Command {

    private IdPersonalPatio idPersonalPatio;
    private final IdSembrador idSembrador;

    public QuitarSembrador(IdPersonalPatio idPersonalPatio, IdSembrador idSembrador){
        this.idPersonalPatio = idPersonalPatio;
        this.idSembrador = idSembrador;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }

    public IdSembrador getIdSembrador() {
        return idSembrador;
    }
}
