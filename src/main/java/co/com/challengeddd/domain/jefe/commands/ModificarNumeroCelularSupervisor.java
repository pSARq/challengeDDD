package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.sofka.domain.generic.Command;

public class ModificarNumeroCelularSupervisor extends Command {

    private IdJefe idJefe;
    private final NumeroCelular numeroCelular;

    public ModificarNumeroCelularSupervisor(IdJefe idJefe, NumeroCelular numeroCelular){
        this.idJefe = idJefe;
        this.numeroCelular = numeroCelular;
    }

    public IdJefe getIdJefe() {
        return idJefe;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
