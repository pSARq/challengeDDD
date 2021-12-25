package co.com.challengeddd.domain.producciondia.events;

import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoTamañoChampiñonBandejaChampiñon extends DomainEvent {

    private final IdBandejaChampiñon idBandejaChampiñon;
    private final TamañoChampiñon tamañoChampiñon;

    public ModificadoTamañoChampiñonBandejaChampiñon(IdBandejaChampiñon idBandejaChampiñon, TamañoChampiñon tamañoChampiñon) {
        super("challengeddd.domain.producciondia.modificadotamañochampiñonbandejachampiñon");
        this.idBandejaChampiñon = idBandejaChampiñon;
        this.tamañoChampiñon = tamañoChampiñon;
    }

    public IdBandejaChampiñon getIdBandejaChampiñon() {
        return idBandejaChampiñon;
    }

    public TamañoChampiñon getTamañoChampiñon() {
        return tamañoChampiñon;
    }
}
