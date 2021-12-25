package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.transporte.Conductor;
import co.com.challengeddd.domain.transporte.values.IdTransporte;
import co.com.sofka.domain.generic.Command;

public class ModificarConductor extends Command {

    private IdTransporte idTransporte;
    private final Conductor conductor;

    public ModificarConductor(IdTransporte idTransporte, Conductor conductor){
        this.idTransporte = idTransporte;
        this.conductor = conductor;
    }

    public IdTransporte getIdTransporte() {
        return idTransporte;
    }

    public Conductor getConductor() {
        return conductor;
    }
}
