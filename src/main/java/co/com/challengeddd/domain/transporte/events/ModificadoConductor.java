package co.com.challengeddd.domain.transporte.events;

import co.com.challengeddd.domain.transporte.Conductor;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoConductor extends DomainEvent {

    private final Conductor conductor;

    public ModificadoConductor(Conductor conductor) {
        super("challengeddd.domain.transporte.modificadoconductor");
        this.conductor = conductor;
    }

    public Conductor getConductor() {
        return conductor;
    }
}
