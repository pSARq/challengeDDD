package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.general.values.Sala;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.Command;

public class ModificarSalaSembrador extends Command {

    private IdPersonalPatio idPersonalPatio;
    private final IdSembrador idSembrador;
    private final Sala sala;

    public ModificarSalaSembrador(IdPersonalPatio idPersonalPatio, IdSembrador idSembrador, Sala sala){
        this.idPersonalPatio = idPersonalPatio;
        this.idSembrador = idSembrador;
        this.sala = sala;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }

    public IdSembrador getIdSembrador() {
        return idSembrador;
    }

    public Sala getSala() {
        return sala;
    }
}
