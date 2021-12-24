package co.com.challengeddd.domain.jefe.events;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoNombreSupervisor extends DomainEvent {
    private final Nombre nombre;

    public ModificadoNombreSupervisor(Nombre nombre) {
        super("challengeddd.domain.jefe.modificadonombresupervisor");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
