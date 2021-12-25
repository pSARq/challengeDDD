package co.com.challengeddd.domain.personalpatio.events;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoNombreSembrador extends DomainEvent {

    private final IdSembrador idSembrador;
    private final Nombre nombre;

    public ModificadoNombreSembrador(IdSembrador idSembrador, Nombre nombre) {
        super("challengeddd.domain.personalpatio.modificadonombresembrador");
        this.idSembrador = idSembrador;
        this.nombre = nombre;
    }

    public IdSembrador getIdSembrador() {
        return idSembrador;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
