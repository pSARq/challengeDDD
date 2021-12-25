package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.jefe.Supervisor;
import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.sofka.domain.generic.Command;

public class ModificarSupervisor extends Command {

    private IdJefe idJefe;
    private final Supervisor supervisor;

    public ModificarSupervisor(IdJefe idJefe, Supervisor supervisor){
        this.idJefe = idJefe;
        this.supervisor = supervisor;
    }

    public IdJefe getIdJefe() {
        return idJefe;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }
}
