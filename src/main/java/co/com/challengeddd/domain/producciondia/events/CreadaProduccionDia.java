package co.com.challengeddd.domain.producciondia.events;

import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.producciondia.values.TipoEmpaqueBandeja;
import co.com.sofka.domain.generic.DomainEvent;

public class CreadaProduccionDia extends DomainEvent {

    private final IdJefe idJefe;
    private final TipoEmpaqueBandeja tipoEmpaqueBandeja;

    public CreadaProduccionDia(IdJefe idJefe, TipoEmpaqueBandeja tipoEmpaqueBandeja) {
        super("challengeddd.domain.producciondia.creadaproducciondia");
        this.idJefe = idJefe;
        this.tipoEmpaqueBandeja = tipoEmpaqueBandeja;
    }

    public IdJefe getIdJefe() {
        return idJefe;
    }

    public TipoEmpaqueBandeja getTipoEmpaqueBandeja() {
        return tipoEmpaqueBandeja;
    }
}
