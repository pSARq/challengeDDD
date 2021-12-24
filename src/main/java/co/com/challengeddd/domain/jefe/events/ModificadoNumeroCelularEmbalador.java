package co.com.challengeddd.domain.jefe.events;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoNumeroCelularEmbalador extends DomainEvent {
    private final NumeroCelular numeroCelular;

    public ModificadoNumeroCelularEmbalador(NumeroCelular numeroCelular) {
        super("challengeddd.domain.jefe.modificadonumerocelularembalador");
        this.numeroCelular = numeroCelular;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
