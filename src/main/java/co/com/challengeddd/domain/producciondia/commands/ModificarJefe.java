package co.com.challengeddd.domain.producciondia.commands;

import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.sofka.domain.generic.Command;

public class ModificarJefe extends Command {

    private IdProduccionDia idProduccionDia;
    private final IdJefe idJefe;

    public ModificarJefe(IdProduccionDia idProduccionDia, IdJefe idJefe){
        this.idProduccionDia = idProduccionDia;
        this.idJefe = idJefe;
    }

    public IdProduccionDia getIdProduccionDia() {
        return idProduccionDia;
    }

    public IdJefe getIdJefe() {
        return idJefe;
    }
}
