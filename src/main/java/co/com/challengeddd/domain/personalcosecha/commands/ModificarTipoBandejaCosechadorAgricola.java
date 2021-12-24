package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.sofka.domain.generic.Command;

public class ModificarTipoBandejaCosechadorAgricola extends Command {

    private final IdCosechadorAgricola idCosechadorAgricola;
    private final TipoBandeja tipoBandeja;

    public ModificarTipoBandejaCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, TipoBandeja tipoBandeja){
        this.idCosechadorAgricola = idCosechadorAgricola;
        this.tipoBandeja = tipoBandeja;
    }

    public IdCosechadorAgricola getIdCosechadorAgricola() {
        return idCosechadorAgricola;
    }

    public TipoBandeja getTipoBandeja() {
        return tipoBandeja;
    }
}
