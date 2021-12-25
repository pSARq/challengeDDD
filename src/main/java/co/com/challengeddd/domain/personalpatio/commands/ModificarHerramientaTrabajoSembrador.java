package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.personalpatio.values.HerramientaTrabajo;
import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.Command;

public class ModificarHerramientaTrabajoSembrador extends Command {

    private final IdSembrador idSembrador;
    private final HerramientaTrabajo herramientaTrabajo;

    public ModificarHerramientaTrabajoSembrador(IdSembrador idSembrador, HerramientaTrabajo herramientaTrabajo){
        this.idSembrador = idSembrador;
        this.herramientaTrabajo = herramientaTrabajo;
    }

    public IdSembrador getIdSembrador() {
        return idSembrador;
    }

    public HerramientaTrabajo getHerramientaTrabajo() {
        return herramientaTrabajo;
    }
}
