package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.sofka.domain.generic.Command;

public class ModificarPersonalPatioSupervisor extends Command {

    private IdJefe idJefe;
    private final IdPersonalPatio idPersonalPatio;

    public ModificarPersonalPatioSupervisor(IdJefe idJefe, IdPersonalPatio idPersonalPatio){
        this.idJefe = idJefe;
        this.idPersonalPatio = idPersonalPatio;
    }

    public IdJefe getIdJefe() {
        return idJefe;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }
}
