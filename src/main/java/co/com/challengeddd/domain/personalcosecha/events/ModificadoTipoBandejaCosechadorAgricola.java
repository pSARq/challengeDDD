package co.com.challengeddd.domain.personalcosecha.events;

import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoTipoBandejaCosechadorAgricola extends DomainEvent {

    private final IdCosechadorAgricola idCosechadorAgricola;
    private final TipoBandeja tipoBandeja;

    public ModificadoTipoBandejaCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, TipoBandeja tipoBandeja) {
        super("challengeddd.domain.personalcosecha.modificadotipobandejacosechadoragricola");
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
