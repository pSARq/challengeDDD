package co.com.challengeddd.domain.producciondia;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.TipoChampiñon;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class BandejaChampiñon extends Entity<IdBandejaChampiñon> {

    private Nombre nombreComprador;
    private TipoBandeja tipoBandeja;
    private TipoChampiñon tipoChampiñon;
    private TamañoChampiñon tamañoChampiñon;

    public BandejaChampiñon(IdBandejaChampiñon idBandejaChampiñon, TipoBandeja tipoBandeja, TipoChampiñon tipoChampiñon, TamañoChampiñon tamañoChampiñon){
        super(idBandejaChampiñon);
        this.tipoBandeja = tipoBandeja;
        this.tipoChampiñon = tipoChampiñon;
        this.tamañoChampiñon = tamañoChampiñon;
    }

    public void agregarNombreComprador(Nombre nombreComprador){
        this.nombreComprador = Objects.requireNonNull(nombreComprador);
    }

    public void modificarNombreComprador(Nombre nombreComprador){
        this.nombreComprador = Objects.requireNonNull(nombreComprador);
    }

    public void modificarTipoBandeja(TipoBandeja tipoBandeja){
        this.tipoBandeja = Objects.requireNonNull(tipoBandeja);
    }

    public void modificarTipoChampiñon(TipoChampiñon tipoChampiñon){
        this.tipoChampiñon = Objects.requireNonNull(tipoChampiñon);
    }

    public void modificarTamañoChampiñon(TamañoChampiñon tamañoChampiñon){
        this.tamañoChampiñon = Objects.requireNonNull(tamañoChampiñon);
    }

    public Nombre nombreComprador() {
        return nombreComprador;
    }

    public TipoBandeja tipoBandeja() {
        return tipoBandeja;
    }

    public TipoChampiñon tipoChampiñon() {
        return tipoChampiñon;
    }

    public TamañoChampiñon tamañoChampiñon() {
        return tamañoChampiñon;
    }
}
