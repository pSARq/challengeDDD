package co.com.challengeddd.domain.personalpatio.events;

import co.com.challengeddd.domain.personalpatio.values.HerramientaTrabajo;
import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadaHerramientaTrabajoSembrador extends DomainEvent {

    private final IdSembrador idSembrador;
    private final HerramientaTrabajo herramientaTrabajo;

    public ModificadaHerramientaTrabajoSembrador(IdSembrador idSembrador, HerramientaTrabajo herramientaTrabajo) {
        super("challengeddd.domain.personalpatio.modificadaherramientatrabajosembrador");
        this.idSembrador = idSembrador;
        this.herramientaTrabajo = herramientaTrabajo;
    }

    public IdSembrador getIdSembrador() {
        return idSembrador;
    }

    public HerramientaTrabajo getHerramientaTrabajo() {
        return herramientaTrabajo;
    }
}
