package co.com.challengeddd.domain.personalpatio.events;

import co.com.challengeddd.domain.general.values.Sala;
import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadaSalaSembrador extends DomainEvent {

    private final IdSembrador idSembrador;
    private final Sala sala;

    public ModificadaSalaSembrador(IdSembrador idSembrador, Sala sala) {
        super("challengeddd.domain.personalpatio.modificadasalasembrador");
        this.idSembrador = idSembrador;
        this.sala = sala;
    }

    public IdSembrador getIdSembrador() {
        return idSembrador;
    }

    public Sala getSala() {
        return sala;
    }
}
