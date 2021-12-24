package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.sofka.domain.generic.Command;

public class ModificarNumeroCelularCosechadorAgricola extends Command {

    private final IdCosechadorAgricola idCosechadorAgricola;
    private final NumeroCelular numeroCelular;

    public ModificarNumeroCelularCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, NumeroCelular numeroCelular){
        this.idCosechadorAgricola = idCosechadorAgricola;
        this.numeroCelular = numeroCelular;
    }

    public IdCosechadorAgricola getIdCosechadorAgricola() {
        return idCosechadorAgricola;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
