package co.com.challengeddd.domain.personalcosecha.events;

import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.challengeddd.domain.personalcosecha.values.TecnicaTajado;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadaTecnicaTajadoTajador extends DomainEvent {

    private final IdTajador idTajador;
    private final TecnicaTajado tecnicaTajado;

    public ModificadaTecnicaTajadoTajador(IdTajador idTajador, TecnicaTajado tecnicaTajado) {
        super("challengeddd.domain.personalcosecha.modificadatecnicatajadotajador");
        this.idTajador = idTajador;
        this.tecnicaTajado = tecnicaTajado;
    }

    public IdTajador getIdTajador() {
        return idTajador;
    }

    public TecnicaTajado getTecnicaTajado() {
        return tecnicaTajado;
    }
}
