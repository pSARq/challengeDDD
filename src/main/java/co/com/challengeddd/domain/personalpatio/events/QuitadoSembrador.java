package co.com.challengeddd.domain.personalpatio.events;

import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.DomainEvent;

public class QuitadoSembrador extends DomainEvent {

    private final IdSembrador idSembrador;

    public QuitadoSembrador(IdSembrador idSembrador) {
        super("challengeddd.domain.personalpatio.quitadosembrador");
        this.idSembrador = idSembrador;
    }

    public IdSembrador getIdSembrador() {
        return idSembrador;
    }
}
