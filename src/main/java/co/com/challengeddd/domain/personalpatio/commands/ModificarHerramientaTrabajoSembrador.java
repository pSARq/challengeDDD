package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.personalpatio.values.HerramientaTrabajo;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.Command;

public class ModificarHerramientaTrabajoSembrador extends Command {

    private IdPersonalPatio idPersonalPatio;
    private final IdSembrador idSembrador;
    private final HerramientaTrabajo herramientaTrabajo;

    public ModificarHerramientaTrabajoSembrador(IdPersonalPatio idPersonalPatio, IdSembrador idSembrador, HerramientaTrabajo herramientaTrabajo){
        this.idPersonalPatio = idPersonalPatio;
        this.idSembrador = idSembrador;
        this.herramientaTrabajo = herramientaTrabajo;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }

    public IdSembrador getIdSembrador() {
        return idSembrador;
    }

    public HerramientaTrabajo getHerramientaTrabajo() {
        return herramientaTrabajo;
    }
}
