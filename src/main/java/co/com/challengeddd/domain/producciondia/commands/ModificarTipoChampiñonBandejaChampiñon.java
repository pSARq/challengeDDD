package co.com.challengeddd.domain.producciondia.commands;

import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.domain.producciondia.values.TipoChampiñon;
import co.com.sofka.domain.generic.Command;

public class ModificarTipoChampiñonBandejaChampiñon extends Command {

    private IdProduccionDia idProduccionDia;
    private final IdBandejaChampiñon idBandejaChampiñon;
    private final TipoChampiñon tipoChampiñon;

    public ModificarTipoChampiñonBandejaChampiñon(IdProduccionDia idProduccionDia, IdBandejaChampiñon idBandejaChampiñon, TipoChampiñon tipoChampiñon){
        this.idProduccionDia = idProduccionDia;
        this.idBandejaChampiñon = idBandejaChampiñon;
        this.tipoChampiñon = tipoChampiñon;
    }

    public IdProduccionDia getIdProduccionDia() {
        return idProduccionDia;
    }

    public IdBandejaChampiñon getIdBandejaChampiñon() {
        return idBandejaChampiñon;
    }

    public TipoChampiñon getTipoChampiñon() {
        return tipoChampiñon;
    }
}
