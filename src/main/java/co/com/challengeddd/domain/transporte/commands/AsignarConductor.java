package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.transporte.values.IdTransporte;
import co.com.challengeddd.domain.transporte.values.Licencia;
import co.com.sofka.domain.generic.Command;

public class AsignarConductor extends Command {

    private IdTransporte idTransporte;
    private final Nombre nombre;
    private final NumeroCelular numeroCelular;
    private final Licencia licencia;

    public AsignarConductor(IdTransporte idTransporte, Nombre nombre, NumeroCelular numeroCelular, Licencia licencia){
        this.idTransporte = idTransporte;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.licencia = licencia;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }

    public Licencia getLicencia() {
        return licencia;
    }
}
