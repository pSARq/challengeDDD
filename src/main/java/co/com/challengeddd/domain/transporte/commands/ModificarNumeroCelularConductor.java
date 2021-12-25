package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.sofka.domain.generic.Command;

public class ModificarNumeroCelularConductor extends Command {

    private final NumeroCelular numeroCelular;

    public ModificarNumeroCelularConductor(NumeroCelular numeroCelular){
        this.numeroCelular = numeroCelular;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
