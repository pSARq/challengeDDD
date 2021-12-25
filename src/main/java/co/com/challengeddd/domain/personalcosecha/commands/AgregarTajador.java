package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.challengeddd.domain.personalcosecha.values.TecnicaTajado;
import co.com.challengeddd.domain.personalcosecha.values.TipoCuchillo;
import co.com.sofka.domain.generic.Command;

public class AgregarTajador extends Command {

    private IdPersonalCosecha idPersonalCosecha;
    private final Nombre nombre;
    private final NumeroCelular numeroCelular;
    private final TipoCuchillo tipoCuchillo;
    private final TecnicaTajado tecnicaTajado;

    public AgregarTajador(IdPersonalCosecha idPersonalCosecha, Nombre nombre, NumeroCelular numeroCelular, TipoCuchillo tipoCuchillo, TecnicaTajado tecnicaTajado){
        this.idPersonalCosecha = idPersonalCosecha;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.tipoCuchillo = tipoCuchillo;
        this.tecnicaTajado = tecnicaTajado;
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

    public TipoCuchillo getTipoCuchillo() {
        return tipoCuchillo;
    }

    public TecnicaTajado getTecnicaTajado() {
        return tecnicaTajado;
    }
}
