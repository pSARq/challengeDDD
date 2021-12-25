package co.com.challengeddd.domain.producciondia.events;

import co.com.challengeddd.domain.producciondia.values.TipoEmpaqueBandeja;
import co.com.sofka.domain.generic.DomainEvent;

public class CreadaProduccionDia extends DomainEvent {

    private TipoEmpaqueBandeja tipoEmpaqueBandeja;

    public CreadaProduccionDia(TipoEmpaqueBandeja tipoEmpaqueBandeja) {
        super("challengeddd.domain.producciondia.creadaproducciondia");
        this.tipoEmpaqueBandeja = tipoEmpaqueBandeja;
    }

    public TipoEmpaqueBandeja getTipoEmpaqueBandeja() {
        return tipoEmpaqueBandeja;
    }
}
