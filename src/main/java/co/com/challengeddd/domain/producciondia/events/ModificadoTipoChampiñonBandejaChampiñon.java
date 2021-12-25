package co.com.challengeddd.domain.producciondia.events;

import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.TipoChampiñon;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoTipoChampiñonBandejaChampiñon extends DomainEvent {

    private final IdBandejaChampiñon idBandejaChampiñon;
    private final TipoChampiñon tipoChampiñon;

    public ModificadoTipoChampiñonBandejaChampiñon(IdBandejaChampiñon idBandejaChampiñon, TipoChampiñon tipoChampiñon) {
        super("challengeddd.domain.producciondia.modificadotipochampiñonbandejachampiñon");
        this.idBandejaChampiñon = idBandejaChampiñon;
        this.tipoChampiñon = tipoChampiñon;
    }

    public IdBandejaChampiñon getIdBandejaChampiñon() {
        return idBandejaChampiñon;
    }

    public TipoChampiñon getTipoChampiñon() {
        return tipoChampiñon;
    }
}
