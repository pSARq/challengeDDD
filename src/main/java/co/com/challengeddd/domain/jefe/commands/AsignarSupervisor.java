package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.sofka.domain.generic.Command;

public class AsignarSupervisor extends Command {

    private final IdPersonalPatio idPersonalPatio;
    private final IdPersonalCosecha idPersonalCosecha;
    private final Nombre nombre;
    private final NumeroCelular numeroCelular;

    public AsignarSupervisor(IdPersonalPatio idPersonalPatio, IdPersonalCosecha idPersonalCosecha, Nombre nombre, NumeroCelular numeroCelular){
        this.idPersonalPatio = idPersonalPatio;
        this.idPersonalCosecha = idPersonalCosecha;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }

    public IdPersonalCosecha getIdPersonalCosecha() {
        return idPersonalCosecha;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
