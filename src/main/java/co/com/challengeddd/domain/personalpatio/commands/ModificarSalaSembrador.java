package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.general.values.Sala;
import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.Command;

public class ModificarSalaSembrador extends Command {

    private final IdSembrador idSembrador;
    private final Sala sala;

    public ModificarSalaSembrador(IdSembrador idSembrador, Sala sala){
        this.idSembrador = idSembrador;
        this.sala = sala;
    }

    public IdSembrador getIdSembrador() {
        return idSembrador;
    }

    public Sala getSala() {
        return sala;
    }
}
