package co.com.challengeddd.domain.producciondia.commands;

import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.sofka.domain.generic.Command;

public class ModificarTamañoChampiñonBandejaChampiñon extends Command {

    private IdProduccionDia idProduccionDia;
    private final IdBandejaChampiñon idBandejaChampiñon;
    private final TamañoChampiñon tamañoChampiñon;

    public ModificarTamañoChampiñonBandejaChampiñon(IdProduccionDia idProduccionDia, IdBandejaChampiñon idBandejaChampiñon, TamañoChampiñon tamañoChampiñon){
        this.idProduccionDia = idProduccionDia;
        this.idBandejaChampiñon = idBandejaChampiñon;
        this.tamañoChampiñon = tamañoChampiñon;
    }

    public IdProduccionDia getIdProduccionDia() {
        return idProduccionDia;
    }

    public IdBandejaChampiñon getIdBandejaChampiñon() {
        return idBandejaChampiñon;
    }

    public TamañoChampiñon getTamañoChampiñon() {
        return tamañoChampiñon;
    }
}
