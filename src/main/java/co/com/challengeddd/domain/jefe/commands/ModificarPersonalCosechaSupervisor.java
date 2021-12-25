package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.sofka.domain.generic.Command;

public class ModificarPersonalCosechaSupervisor extends Command {

    private IdJefe idJefe;
    private final IdPersonalCosecha idPersonalCosecha;

    public ModificarPersonalCosechaSupervisor(IdJefe idJefe, IdPersonalCosecha idPersonalCosecha){
        this.idJefe = idJefe;
        this.idPersonalCosecha = idPersonalCosecha;
    }

    public IdJefe getIdJefe() {
        return idJefe;
    }

    public IdPersonalCosecha getIdPersonalCosecha() {
        return idPersonalCosecha;
    }
}
