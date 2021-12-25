package co.com.challengeddd.domain.transporte.events;

import co.com.challengeddd.domain.transporte.values.Licencia;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadaLicenciaConductor extends DomainEvent {

    private final Licencia licencia;

    public ModificadaLicenciaConductor(Licencia licencia) {
        super("challengeddd.domain.transporte.modificadalicenciaconductor");
        this.licencia = licencia;
    }

    public Licencia getLicencia() {
        return licencia;
    }
}
