package co.com.challengeddd.domain.personalcosecha.events;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.general.values.Sala;
import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.challengeddd.domain.personalcosecha.values.TipoCuchillo;
import co.com.challengeddd.domain.producciondia.values.TamañoChampiñon;
import co.com.sofka.domain.generic.DomainEvent;

public class AgregadoCosechadorAgricola extends DomainEvent {

    private final IdCosechadorAgricola id;
    private final Nombre nombre;
    private final NumeroCelular numeroCelular;
    private final TipoCuchillo tipoCuchillo;
    private final Sala sala;
    private final TamañoChampiñon tamañoChampiñon;
    private final TipoBandeja tipoBandeja;

    public AgregadoCosechadorAgricola(IdCosechadorAgricola id, Nombre nombre, NumeroCelular numeroCelular, TipoCuchillo tipoCuchillo, Sala sala, TamañoChampiñon tamañoChampiñon, TipoBandeja tipoBandeja) {
        super("challengeddd.domain.personalcosecha.agregadocosechadoragricola");
        this.id = id;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.tipoCuchillo = tipoCuchillo;
        this.sala = sala;
        this.tamañoChampiñon = tamañoChampiñon;
        this.tipoBandeja = tipoBandeja;
    }

    public IdCosechadorAgricola getId() {
        return id;
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
