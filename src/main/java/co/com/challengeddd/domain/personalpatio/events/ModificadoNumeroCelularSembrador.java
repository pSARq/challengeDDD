package co.com.challengeddd.domain.personalpatio.events;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoNumeroCelularSembrador extends DomainEvent {

    private final IdSembrador idSembrador;
    private final NumeroCelular numeroCelular;

    public ModificadoNumeroCelularSembrador(IdSembrador idSembrador, NumeroCelular numeroCelular) {
        super("challengeddd.domain.personalpatio.modificadonumerocelularsembrador");
        this.idSembrador = idSembrador;
        this.numeroCelular = numeroCelular;
    }

    public IdSembrador getIdSembrador() {
        return idSembrador;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
