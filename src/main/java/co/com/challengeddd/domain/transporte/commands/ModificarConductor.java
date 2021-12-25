package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.transporte.Conductor;
import co.com.sofka.domain.generic.Command;

public class ModificarConductor extends Command {

    private final Conductor conductor;

    public ModificarConductor(Conductor conductor){
        this.conductor = conductor;
    }

    public Conductor getConductor() {
        return conductor;
    }
}
