package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.transporte.values.Licencia;
import co.com.sofka.domain.generic.Command;

public class ModificarLicenciaConductor extends Command {

    private final Licencia licencia;

    public ModificarLicenciaConductor(Licencia licencia){
        this.licencia = licencia;
    }

    public Licencia getLicencia() {
        return licencia;
    }
}
