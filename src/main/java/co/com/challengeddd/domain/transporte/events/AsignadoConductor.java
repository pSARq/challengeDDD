package co.com.challengeddd.domain.transporte.events;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.transporte.values.IdConductor;
import co.com.challengeddd.domain.transporte.values.Licencia;
import co.com.sofka.domain.generic.DomainEvent;

public class AsignadoConductor extends DomainEvent {

    private final IdConductor id;
    private final Nombre nombre;
    private final NumeroCelular numeroCelular;
    private final Licencia licencia;

    public AsignadoConductor(IdConductor id, Nombre nombre, NumeroCelular numeroCelular, Licencia licencia) {
        super("challengeddd.domain.transporte.asignadoconductor");
        this.id = id;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.licencia = licencia;
    }

    public IdConductor getId() {
        return id;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }

    public Licencia getLicencia() {
        return licencia;
    }
}
