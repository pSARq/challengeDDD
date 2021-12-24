package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.challengeddd.domain.personalcosecha.values.TipoCuchillo;
import co.com.sofka.domain.generic.Command;

public class ModificarTipoCuchilloCosechadorAgricola extends Command {

    private final IdCosechadorAgricola idCosechadorAgricola;
    private final TipoCuchillo tipoCuchillo;

    public ModificarTipoCuchilloCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, TipoCuchillo tipoCuchillo){
        this.idCosechadorAgricola = idCosechadorAgricola;
        this.tipoCuchillo = tipoCuchillo;
    }

    public IdCosechadorAgricola getIdCosechadorAgricola() {
        return idCosechadorAgricola;
    }

    public TipoCuchillo getTipoCuchillo() {
        return tipoCuchillo;
    }
}
