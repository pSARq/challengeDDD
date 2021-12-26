package co.com.challengeddd.domain.producciondia.commands;

import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.domain.producciondia.values.TipoEmpaqueBandeja;
import co.com.sofka.domain.generic.Command;

public class CrearProduccionDia extends Command {

    private final IdProduccionDia idProduccionDia;
    private final IdJefe idJefe;
    private final TipoEmpaqueBandeja tipoEmpaqueBandeja;

    public CrearProduccionDia(IdProduccionDia idProduccionDia, IdJefe idJefe, TipoEmpaqueBandeja tipoEmpaqueBandeja){
        this.idProduccionDia = idProduccionDia;
        this.idJefe = idJefe;
        this.tipoEmpaqueBandeja = tipoEmpaqueBandeja;
    }

    public IdJefe getIdJefe() {
        return idJefe;
    }

    public IdProduccionDia getIdProduccionDia() {
        return idProduccionDia;
    }

    public TipoEmpaqueBandeja getTipoEmpaqueBandeja() {
        return tipoEmpaqueBandeja;
    }
}
