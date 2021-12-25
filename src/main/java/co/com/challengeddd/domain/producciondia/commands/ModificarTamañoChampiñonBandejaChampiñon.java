package co.com.challengeddd.domain.producciondia.commands;

import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.sofka.domain.generic.Command;

public class ModificarTamañoChampiñonBandejaChampiñon extends Command {

    private final IdBandejaChampiñon idBandejaChampiñon;
    private final TamañoChampiñon tamañoChampiñon;

    public ModificarTamañoChampiñonBandejaChampiñon(IdBandejaChampiñon idBandejaChampiñon, TamañoChampiñon tamañoChampiñon){
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
