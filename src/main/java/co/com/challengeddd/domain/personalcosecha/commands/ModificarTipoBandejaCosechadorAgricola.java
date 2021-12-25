package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.sofka.domain.generic.Command;

public class ModificarTipoBandejaCosechadorAgricola extends Command {

    private IdPersonalCosecha idPersonalCosecha;
    private final IdCosechadorAgricola idCosechadorAgricola;
    private final TipoBandeja tipoBandeja;

    public ModificarTipoBandejaCosechadorAgricola(IdPersonalCosecha idPersonalCosecha, IdCosechadorAgricola idCosechadorAgricola, TipoBandeja tipoBandeja){
        this.idPersonalCosecha = idPersonalCosecha;
        this.idCosechadorAgricola = idCosechadorAgricola;
        this.tipoBandeja = tipoBandeja;
    }

    public IdPersonalCosecha getIdPersonalCosecha() {
        return idPersonalCosecha;
    }

    public IdCosechadorAgricola getIdCosechadorAgricola() {
        return idCosechadorAgricola;
    }

    public TipoBandeja getTipoBandeja() {
        return tipoBandeja;
    }
}
