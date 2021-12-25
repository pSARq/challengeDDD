package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.Command;

public class ModificarNumeroCelularSembrador extends Command {

    private final IdSembrador idSembrador;
    private final NumeroCelular numeroCelular;

    public ModificarNumeroCelularSembrador(IdSembrador idSembrador, NumeroCelular numeroCelular){
        this.idSembrador = idSembrador;
        this.numeroCelular = numeroCelular;
    }

    public IdSembrador getIdSembrador() {
        return idSembrador;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
