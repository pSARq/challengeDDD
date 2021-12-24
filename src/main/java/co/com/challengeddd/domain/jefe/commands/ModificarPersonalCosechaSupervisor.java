package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.sofka.domain.generic.Command;

public class ModificarPersonalCosechaSupervisor extends Command {

    private final IdPersonalCosecha idPersonalCosecha;

    public ModificarPersonalCosechaSupervisor(IdPersonalCosecha idPersonalCosecha){
        this.idPersonalCosecha = idPersonalCosecha;
    }

    public IdPersonalCosecha getIdPersonalCosecha() {
        return idPersonalCosecha;
    }
}
