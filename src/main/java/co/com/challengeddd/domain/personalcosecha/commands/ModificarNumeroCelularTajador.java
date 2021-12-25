package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.sofka.domain.generic.Command;

public class ModificarNumeroCelularTajador extends Command {

    private IdPersonalCosecha idPersonalCosecha;
    private final IdTajador idTajador;
    private final NumeroCelular numeroCelular;

    public ModificarNumeroCelularTajador(IdPersonalCosecha idPersonalCosecha, IdTajador idTajador, NumeroCelular numeroCelular){
        this.idPersonalCosecha = idPersonalCosecha;
        this.idTajador = idTajador;
        this.numeroCelular = numeroCelular;
    }

    public IdPersonalCosecha getIdPersonalCosecha() {
        return idPersonalCosecha;
    }

    public IdTajador getIdTajador() {
        return idTajador;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
