package co.com.challengeddd.domain.personalcosecha.events;

import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.challengeddd.domain.personalcosecha.values.TipoCuchillo;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoTipoCuchilloCosechadorAgricola extends DomainEvent {

    private final IdCosechadorAgricola idCosechadorAgricola;
    private final TipoCuchillo tipoCuchillo;

    public ModificadoTipoCuchilloCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, TipoCuchillo tipoCuchillo) {
        super("challengeddd.domain.personalcosecha.modificadotipocuchillocosechadoragricola");
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
