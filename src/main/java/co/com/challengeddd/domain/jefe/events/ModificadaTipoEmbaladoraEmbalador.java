package co.com.challengeddd.domain.jefe.events;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadaTipoEmbaladoraEmbalador extends DomainEvent {
    private final NumeroCelular numeroCelular;

    public ModificadaTipoEmbaladoraEmbalador(NumeroCelular numeroCelular) {
        super("challengeddd.domain.jefe.modificadatipoembaladoraembalador");
        this.numeroCelular = numeroCelular;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
