package co.com.challengeddd.domain.producciondia.events;

import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.TipoChampiñon;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;

public class AgregadaBandejaChampiñon extends DomainEvent {

    private final IdBandejaChampiñon id;
    private final TipoBandeja tipoBandeja;
    private final TipoChampiñon tipoChampiñon;
    private final TamañoChampiñon tamañoChampiñon;

    public AgregadaBandejaChampiñon(IdBandejaChampiñon id, TipoBandeja tipoBandeja, TipoChampiñon tipoChampiñon, TamañoChampiñon tamañoChampiñon) {
        super("challengeddd.domain.transporte.agregadabandejachampiñon");
        this.id = id;
        this.tipoBandeja = tipoBandeja;
        this.tipoChampiñon = tipoChampiñon;
        this.tamañoChampiñon = tamañoChampiñon;
    }

    public IdBandejaChampiñon getId() {
        return id;
    }

    public TipoBandeja getTipoBandeja() {
        return tipoBandeja;
    }

    public TipoChampiñon getTipoChampiñon() {
        return tipoChampiñon;
    }

    public TamañoChampiñon getTamañoChampiñon() {
        return tamañoChampiñon;
    }
}
