package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.challengeddd.domain.personalcosecha.values.TipoCuchillo;
import co.com.sofka.domain.generic.Command;

public class ModificarTipoCuchilloCosechadorAgricola extends Command {

    private IdPersonalCosecha idPersonalCosecha;
    private final IdCosechadorAgricola idCosechadorAgricola;
    private final TipoCuchillo tipoCuchillo;

    public ModificarTipoCuchilloCosechadorAgricola(IdPersonalCosecha idPersonalCosecha, IdCosechadorAgricola idCosechadorAgricola, TipoCuchillo tipoCuchillo){
        this.idPersonalCosecha = idPersonalCosecha;
        this.idCosechadorAgricola = idCosechadorAgricola;
        this.tipoCuchillo = tipoCuchillo;
    }

    public IdPersonalCosecha getIdPersonalCosecha() {
        return idPersonalCosecha;
    }

    public IdCosechadorAgricola getIdCosechadorAgricola() {
        return idCosechadorAgricola;
    }

    public TipoCuchillo getTipoCuchillo() {
        return tipoCuchillo;
    }
}
