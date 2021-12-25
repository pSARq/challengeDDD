package co.com.challengeddd.domain.transporte.events;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoNombreConductor extends DomainEvent {

    private final Nombre nombre;

    public ModificadoNombreConductor(Nombre nombre) {
        super("challengeddd.domain.transporte.modificadonombreconductor");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
