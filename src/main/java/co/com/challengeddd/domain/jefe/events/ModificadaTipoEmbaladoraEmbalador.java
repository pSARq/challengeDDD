package co.com.challengeddd.domain.jefe.events;

import co.com.challengeddd.domain.jefe.values.TipoEmbaladora;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadaTipoEmbaladoraEmbalador extends DomainEvent {

    private final TipoEmbaladora tipoEmbaladora;

    public ModificadaTipoEmbaladoraEmbalador(TipoEmbaladora tipoEmbaladora) {
        super("challengeddd.domain.jefe.modificadatipoembaladoraembalador");
        this.tipoEmbaladora = tipoEmbaladora;
    }

    public TipoEmbaladora getTipoEmbaladora() {
        return tipoEmbaladora;
    }
}
