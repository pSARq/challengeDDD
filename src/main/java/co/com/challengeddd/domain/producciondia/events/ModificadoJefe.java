package co.com.challengeddd.domain.producciondia.events;

import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoJefe extends DomainEvent {

    private final IdJefe idJefe;

    public ModificadoJefe(IdJefe idJefe) {
        super("challengeddd.domain.producciondia.modificadojefe");
        this.idJefe = idJefe;
    }

    public IdJefe getIdJefe() {
        return idJefe;
    }
}
