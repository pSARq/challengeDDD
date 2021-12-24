package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.sofka.domain.generic.Command;

public class ModificarNumeroCelularEmbalador extends Command {

    private final NumeroCelular numeroCelular;

    public ModificarNumeroCelularEmbalador(NumeroCelular numeroCelular){
        this.numeroCelular = numeroCelular;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
