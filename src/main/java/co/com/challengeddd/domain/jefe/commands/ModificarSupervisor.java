package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.jefe.Supervisor;
import co.com.sofka.domain.generic.Command;

public class ModificarSupervisor extends Command {

    private final Supervisor supervisor;

    public ModificarSupervisor(Supervisor supervisor){
        this.supervisor = supervisor;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }
}
