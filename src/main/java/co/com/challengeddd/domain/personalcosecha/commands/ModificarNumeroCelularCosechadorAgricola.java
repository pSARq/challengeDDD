package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.sofka.domain.generic.Command;

public class ModificarNumeroCelularCosechadorAgricola extends Command {

    private IdPersonalCosecha idPersonalCosecha;
    private final IdCosechadorAgricola idCosechadorAgricola;
    private final NumeroCelular numeroCelular;

    public ModificarNumeroCelularCosechadorAgricola(IdPersonalCosecha idPersonalCosecha, IdCosechadorAgricola idCosechadorAgricola, NumeroCelular numeroCelular){
        this.idPersonalCosecha = idPersonalCosecha;
        this.idCosechadorAgricola = idCosechadorAgricola;
        this.numeroCelular = numeroCelular;
    }

    public IdPersonalCosecha getIdPersonalCosecha() {
        return idPersonalCosecha;
    }

    public IdCosechadorAgricola getIdCosechadorAgricola() {
        return idCosechadorAgricola;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
