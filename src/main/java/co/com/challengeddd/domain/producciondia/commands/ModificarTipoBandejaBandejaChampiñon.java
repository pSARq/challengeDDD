package co.com.challengeddd.domain.producciondia.commands;

import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.sofka.domain.generic.Command;

public class ModificarTipoBandejaBandejaChampiñon extends Command {

    private final IdBandejaChampiñon idBandejaChampiñon;
    private final TipoBandeja tipoBandeja;

    public ModificarTipoBandejaBandejaChampiñon(IdBandejaChampiñon idBandejaChampiñon, TipoBandeja tipoBandeja){
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
