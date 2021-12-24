package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.sofka.domain.generic.Command;

public class ModificarNumeroCelularSupervisor extends Command {

    private final NumeroCelular numeroCelular;

    public ModificarNumeroCelularSupervisor(NumeroCelular numeroCelular){
        this.numeroCelular = numeroCelular;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
