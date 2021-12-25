package co.com.challengeddd.domain.producciondia.commands;

import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.sofka.domain.generic.Command;

public class ModificarJefe extends Command {

    private final IdJefe idJefe;

    public ModificarJefe(IdJefe idJefe){
        this.idJefe = idJefe;
    }

    public IdJefe getIdJefe() {
        return idJefe;
    }
}
