package co.com.challengeddd.domain.producciondia.commands;

import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.TipoChampiñon;
import co.com.sofka.domain.generic.Command;

public class ModificarTipoChampiñonBandejaChampiñon extends Command {

    private final IdBandejaChampiñon idBandejaChampiñon;
    private final TipoChampiñon tipoChampiñon;

    public ModificarTipoChampiñonBandejaChampiñon(IdBandejaChampiñon idBandejaChampiñon, TipoChampiñon tipoChampiñon){
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
