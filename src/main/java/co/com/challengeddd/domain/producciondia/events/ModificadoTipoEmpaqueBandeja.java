package co.com.challengeddd.domain.producciondia.events;

import co.com.challengeddd.domain.producciondia.values.TipoEmpaqueBandeja;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoTipoEmpaqueBandeja extends DomainEvent {

    private final TipoEmpaqueBandeja tipoEmpaqueBandeja;

    public ModificadoTipoEmpaqueBandeja(TipoEmpaqueBandeja tipoEmpaqueBandeja) {
        super("challengeddd.domain.producciondia.modificadotipoempaquebandeja");
        this.tipoEmpaqueBandeja = tipoEmpaqueBandeja;
    }

    public TipoEmpaqueBandeja getTipoEmpaqueBandeja() {
        return tipoEmpaqueBandeja;
    }
}
