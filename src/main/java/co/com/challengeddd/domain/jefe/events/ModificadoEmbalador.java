package co.com.challengeddd.domain.jefe.events;

import co.com.challengeddd.domain.jefe.Embalador;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoEmbalador extends DomainEvent {

    private final Embalador embalador;

    public ModificadoEmbalador(Embalador embalador){
        super("challengeddd.domain.jefe.modificadoembalador");
        this.embalador = embalador;
    }

    public Embalador getEmbalador() {
        return embalador;
    }
}
