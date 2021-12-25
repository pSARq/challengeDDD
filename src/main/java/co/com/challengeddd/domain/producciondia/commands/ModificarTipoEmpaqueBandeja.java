package co.com.challengeddd.domain.producciondia.commands;

import co.com.challengeddd.domain.producciondia.values.TipoEmpaqueBandeja;
import co.com.sofka.domain.generic.Command;

public class ModificarTipoEmpaqueBandeja extends Command {

    private final TipoEmpaqueBandeja tipoEmpaqueBandeja;

    public ModificarTipoEmpaqueBandeja(TipoEmpaqueBandeja tipoEmpaqueBandeja){
        this.tipoEmpaqueBandeja = tipoEmpaqueBandeja;
    }

    public TipoEmpaqueBandeja getTipoEmpaqueBandeja() {
        return tipoEmpaqueBandeja;
    }
}
