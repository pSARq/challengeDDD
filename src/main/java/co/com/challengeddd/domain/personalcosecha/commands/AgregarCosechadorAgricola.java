package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.general.values.*;
import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.challengeddd.domain.personalcosecha.values.TipoCuchillo;
import co.com.sofka.domain.generic.Command;

public class AgregarCosechadorAgricola extends Command {

    private IdPersonalCosecha idPersonalCosecha;
    private final Nombre nombre;
    private final NumeroCelular numeroCelular;
    private final TipoCuchillo tipoCuchillo;
    private final Sala sala;
    private final TamañoChampiñon tamañoChampiñon;
    private final TipoBandeja tipoBandeja;

    public AgregarCosechadorAgricola(IdPersonalCosecha idPersonalCosecha, Nombre nombre, NumeroCelular numeroCelular, TipoCuchillo tipoCuchillo, Sala sala, TamañoChampiñon tamañoChampiñon, TipoBandeja tipoBandeja){
        this.idPersonalCosecha = idPersonalCosecha;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.tipoCuchillo = tipoCuchillo;
        this.sala = sala;
        this.tamañoChampiñon = tamañoChampiñon;
        this.tipoBandeja = tipoBandeja;
    }

    public IdPersonalCosecha getIdPersonalCosecha() {
        return idPersonalCosecha;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }

    public TipoCuchillo getTipoCuchillo() {
        return tipoCuchillo;
    }

    public Sala getSala() {
        return sala;
    }

    public TamañoChampiñon getTamañoChampiñon() {
        return tamañoChampiñon;
    }

    public TipoBandeja getTipoBandeja() {
        return tipoBandeja;
    }
}
