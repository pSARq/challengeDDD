package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.sofka.domain.generic.Command;

public class ModificarPersonalPatioSupervisor extends Command {

    private final IdPersonalPatio idPersonalPatio;

    public ModificarPersonalPatioSupervisor(IdPersonalPatio idPersonalPatio){
        this.idPersonalPatio = idPersonalPatio;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }
}
