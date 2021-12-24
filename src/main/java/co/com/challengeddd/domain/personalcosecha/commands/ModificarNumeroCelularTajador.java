package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.sofka.domain.generic.Command;

public class ModificarNumeroCelularTajador extends Command {

    private final IdTajador idTajador;
    private final NumeroCelular numeroCelular;

    public ModificarNumeroCelularTajador(IdTajador idTajador, NumeroCelular numeroCelular){
        this.idTajador = idTajador;
        this.numeroCelular = numeroCelular;
    }

    public IdTajador getIdTajador() {
        return idTajador;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
