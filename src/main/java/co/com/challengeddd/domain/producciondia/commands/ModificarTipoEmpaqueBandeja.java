package co.com.challengeddd.domain.producciondia.commands;

import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.domain.producciondia.values.TipoEmpaqueBandeja;
import co.com.sofka.domain.generic.Command;

public class ModificarTipoEmpaqueBandeja extends Command {

    private IdProduccionDia idProduccionDia;
    private final TipoEmpaqueBandeja tipoEmpaqueBandeja;

    public ModificarTipoEmpaqueBandeja(IdProduccionDia idProduccionDia, TipoEmpaqueBandeja tipoEmpaqueBandeja){
        this.idProduccionDia = idProduccionDia;
        this.tipoEmpaqueBandeja = tipoEmpaqueBandeja;
    }

    public IdProduccionDia getIdProduccionDia() {
        return idProduccionDia;
    }

    public TipoEmpaqueBandeja getTipoEmpaqueBandeja() {
        return tipoEmpaqueBandeja;
    }
}
