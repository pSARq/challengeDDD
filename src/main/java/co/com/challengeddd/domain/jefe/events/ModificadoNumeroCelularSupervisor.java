package co.com.challengeddd.domain.jefe.events;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoNumeroCelularSupervisor extends DomainEvent {
    private final NumeroCelular numeroCelular;

    public ModificadoNumeroCelularSupervisor(NumeroCelular numeroCelular) {
        super("challengeddd.domain.jefe.modificadonumerocelularsupervisor");
        this.numeroCelular = numeroCelular;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
