package co.com.challengeddd.domain.jefe.events;

import co.com.challengeddd.domain.jefe.Supervisor;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoSupervisor extends DomainEvent {
    private final Supervisor supervisor;

    public ModificadoSupervisor(Supervisor supervisor) {
        super("challengeddd.domain.jefe.modificadosupervisor");
        this.supervisor = supervisor;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }
}
