package co.com.challengeddd.domain.producciondia.commands;

import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.domain.producciondia.values.TipoEmpaqueBandeja;
import co.com.sofka.domain.generic.Command;

public class CrearProduccionDia extends Command {

    private final IdProduccionDia idProduccionDia;
    private final TipoEmpaqueBandeja tipoEmpaqueBandeja;

    public CrearProduccionDia(IdProduccionDia idProduccionDia, TipoEmpaqueBandeja tipoEmpaqueBandeja){
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
