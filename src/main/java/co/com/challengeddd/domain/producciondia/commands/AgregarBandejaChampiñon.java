package co.com.challengeddd.domain.producciondia.commands;

import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.domain.producciondia.values.TipoChampiñon;
import co.com.sofka.domain.generic.Command;

public class AgregarBandejaChampiñon extends Command {

    private IdProduccionDia idProduccionDia;
    private final TipoBandeja tipoBandeja;
    private final TipoChampiñon tipoChampiñon;
    private final TamañoChampiñon tamañoChampiñon;

    public AgregarBandejaChampiñon(IdProduccionDia idProduccionDia, TipoBandeja tipoBandeja, TipoChampiñon tipoChampiñon, TamañoChampiñon tamañoChampiñon){
        this.idProduccionDia = idProduccionDia;
        this.tipoBandeja = tipoBandeja;
        this.tipoChampiñon = tipoChampiñon;
        this.tamañoChampiñon = tamañoChampiñon;
    }

    public IdProduccionDia getIdProduccionDia() {
        return idProduccionDia;
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
