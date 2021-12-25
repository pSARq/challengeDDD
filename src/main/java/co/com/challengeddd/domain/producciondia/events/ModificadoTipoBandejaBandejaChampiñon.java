package co.com.challengeddd.domain.producciondia.events;

import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoTipoBandejaBandejaChampiñon extends DomainEvent {

    private final IdBandejaChampiñon idBandejaChampiñon;
    private final TipoBandeja tipoBandeja;

    public ModificadoTipoBandejaBandejaChampiñon(IdBandejaChampiñon idBandejaChampiñon, TipoBandeja tipoBandeja) {
        super("challengeddd.domain.producciondia.modificadotipobandejabandejachampiñon");
        this.idBandejaChampiñon = idBandejaChampiñon;
        this.tipoBandeja = tipoBandeja;
    }

    public IdBandejaChampiñon getIdBandejaChampiñon() {
        return idBandejaChampiñon;
    }

    public TipoBandeja getTipoBandeja() {
        return tipoBandeja;
    }
}
