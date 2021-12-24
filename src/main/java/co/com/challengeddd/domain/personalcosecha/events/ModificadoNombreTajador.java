package co.com.challengeddd.domain.personalcosecha.events;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoNombreTajador extends DomainEvent {

    private final IdTajador idTajador;
    private final Nombre nombre;

    public ModificadoNombreTajador(IdTajador idTajador, Nombre nombre) {
        super("challengeddd.domain.personalcosecha.modificadonombretajador");
        this.idTajador = idTajador;
        this.nombre = nombre;
    }

    public IdTajador getIdTajador() {
        return idTajador;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
