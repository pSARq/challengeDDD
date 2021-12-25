package co.com.challengeddd.domain.transporte.events;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoNumeroCelularConductor extends DomainEvent {

    private final NumeroCelular numeroCelular;

    public ModificadoNumeroCelularConductor(NumeroCelular numeroCelular) {
        super("challengeddd.domain.transporte.modificadonumerocelularconductor");
        this.numeroCelular = numeroCelular;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
