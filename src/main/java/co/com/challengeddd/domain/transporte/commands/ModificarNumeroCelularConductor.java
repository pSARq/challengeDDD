package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.transporte.values.IdTransporte;
import co.com.sofka.domain.generic.Command;

public class ModificarNumeroCelularConductor extends Command {

    private IdTransporte idTransporte;
    private final NumeroCelular numeroCelular;

    public ModificarNumeroCelularConductor(IdTransporte idTransporte, NumeroCelular numeroCelular){
        this.idTransporte = idTransporte;
        this.numeroCelular = numeroCelular;
    }

    public IdTransporte getIdTransporte() {
        return idTransporte;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
