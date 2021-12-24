package co.com.challengeddd.domain.personalcosecha.events;

import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.sofka.domain.generic.DomainEvent;

public class QuitadoTajador extends DomainEvent {

    private final IdTajador idTajador;

    public QuitadoTajador(IdTajador idTajador) {
        super("challengeddd.domain.personalcosecha.quitadotajador");
        this.idTajador = idTajador;
    }

    public IdTajador getIdTajador() {
        return idTajador;
    }
}
