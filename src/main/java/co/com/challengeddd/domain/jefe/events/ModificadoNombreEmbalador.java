package co.com.challengeddd.domain.jefe.events;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoNombreEmbalador extends DomainEvent {
    private final Nombre nombre;

    public ModificadoNombreEmbalador(Nombre nombre) {
        super("challengeddd.domain.jefe.modificadonombreembalador");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
