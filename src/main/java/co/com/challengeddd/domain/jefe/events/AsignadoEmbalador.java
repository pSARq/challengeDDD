package co.com.challengeddd.domain.jefe.events;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.jefe.values.IdEmbalador;
import co.com.challengeddd.domain.jefe.values.TipoEmbaladora;
import co.com.sofka.domain.generic.DomainEvent;

public class AsignadoEmbalador extends DomainEvent {
    private final IdEmbalador id;
    private final Nombre nombre;
    private final NumeroCelular numeroCelular;
    private final TipoEmbaladora tipoEmbaladora;

    public AsignadoEmbalador(IdEmbalador id, Nombre nombre, NumeroCelular numeroCelular, TipoEmbaladora tipoEmbaladora) {
        super("challengeddd.domain.jefe.asignadoembalador");
        this.id = id;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.tipoEmbaladora = tipoEmbaladora;
    }

    public IdEmbalador getId() {
        return id;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }

    public TipoEmbaladora getTipoEmbaladora() {
        return tipoEmbaladora;
    }
}
