package co.com.challengeddd.domain.producciondia.commands;

import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.sofka.domain.generic.Command;

public class ModificarTipoBandejaBandejaChampiñon extends Command {

    private IdProduccionDia idProduccionDia;
    private final IdBandejaChampiñon idBandejaChampiñon;
    private final TipoBandeja tipoBandeja;

    public ModificarTipoBandejaBandejaChampiñon(IdProduccionDia idProduccionDia, IdBandejaChampiñon idBandejaChampiñon, TipoBandeja tipoBandeja){
        this.idProduccionDia = idProduccionDia;
        this.idBandejaChampiñon = idBandejaChampiñon;
        this.tipoBandeja = tipoBandeja;
    }

    public IdProduccionDia getIdProduccionDia() {
        return idProduccionDia;
    }

    public IdBandejaChampiñon getIdBandejaChampiñon() {
        return idBandejaChampiñon;
    }

    public TipoBandeja getTipoBandeja() {
        return tipoBandeja;
    }
}
