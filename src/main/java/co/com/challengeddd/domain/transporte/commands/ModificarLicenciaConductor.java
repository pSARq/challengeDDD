package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.transporte.values.IdTransporte;
import co.com.challengeddd.domain.transporte.values.Licencia;
import co.com.sofka.domain.generic.Command;

public class ModificarLicenciaConductor extends Command {

    private IdTransporte idTransporte;
    private final Licencia licencia;

    public ModificarLicenciaConductor(IdTransporte idTransporte, Licencia licencia){
        this.idTransporte = idTransporte;
        this.licencia = licencia;
    }

    public IdTransporte getIdTransporte() {
        return idTransporte;
    }

    public Licencia getLicencia() {
        return licencia;
    }
}
