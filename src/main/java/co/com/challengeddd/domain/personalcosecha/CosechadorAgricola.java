package co.com.challengeddd.domain.personalcosecha;

import co.com.challengeddd.domain.general.values.*;
import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.challengeddd.domain.personalcosecha.values.TipoCuchillo;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class CosechadorAgricola extends Entity<IdCosechadorAgricola> {

    private Nombre nombre;
    private NumeroCelular numeroCelular;
    private TipoCuchillo tipoCuchillo;
    private Sala sala;
    private TamañoChampiñon tamañoChampiñon;
    private TipoBandeja tipoBandeja;

    public CosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, Nombre nombre, NumeroCelular numeroCelular, TipoCuchillo tipoCuchillo, Sala sala, TamañoChampiñon tamañoChampiñon, TipoBandeja tipoBandeja){
        super(idCosechadorAgricola);
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.tipoCuchillo = tipoCuchillo;
        this.sala = sala;
        this.tamañoChampiñon = tamañoChampiñon;
        this.tipoBandeja = tipoBandeja;
    }

    public void modificarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void modificarNumeroCelular(NumeroCelular numeroCelular){
        this.numeroCelular = Objects.requireNonNull(numeroCelular);
    }

    public void modificarTipoCuchillo(TipoCuchillo tipoCuchillo){
        this.tipoCuchillo = Objects.requireNonNull(tipoCuchillo);
    }

    public void modificarSala(Sala sala){
        this.sala = Objects.requireNonNull(sala);
    }

    public void modificarTamañoChampiñon(TamañoChampiñon tamañoChampiñon){
        this.tamañoChampiñon = Objects.requireNonNull(tamañoChampiñon);
    }

    public void modificarTipoBandeja(TipoBandeja tipoBandeja){
        this.tipoBandeja = Objects.requireNonNull(tipoBandeja);
    }

    public Nombre nombre() {
        return nombre;
    }

    public NumeroCelular numeroCelular() {
        return numeroCelular;
    }

    public TipoCuchillo tipoCuchillo() {
        return tipoCuchillo;
    }

    public Sala sala() {
        return sala;
    }

    public TamañoChampiñon tamañoChampiñon() {
        return tamañoChampiñon;
    }

    public TipoBandeja tipoBandeja() {
        return tipoBandeja;
    }
}
