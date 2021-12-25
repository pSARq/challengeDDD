package co.com.challengeddd.domain.personalpatio;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.general.values.Sala;
import co.com.challengeddd.domain.personalpatio.values.HerramientaTrabajo;
import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Sembrador extends Entity<IdSembrador> {

    private Nombre nombre;
    private NumeroCelular numeroCelular;
    private Sala sala;
    private HerramientaTrabajo herramientaTrabajo;

    public Sembrador(IdSembrador idSembrador, Nombre nombre, NumeroCelular numeroCelular, Sala sala, HerramientaTrabajo herramientaTrabajo){
        super(idSembrador);
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.sala = sala;
        this.herramientaTrabajo = herramientaTrabajo;
    }

    public void modificarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void modificarNumeroCelular(NumeroCelular numeroCelular){
        this.numeroCelular = Objects.requireNonNull(numeroCelular);
    }

    public void modificarSala(Sala sala){
        this.sala = Objects.requireNonNull(sala);
    }

    public void modificarHerramientaTrabajo(HerramientaTrabajo herramientaTrabajo){
        this.herramientaTrabajo = Objects.requireNonNull(herramientaTrabajo);
    }

    public Nombre nombre() {
        return nombre;
    }

    public NumeroCelular numeroCelular() {
        return numeroCelular;
    }

    public Sala sala() {
        return sala;
    }

    public HerramientaTrabajo herramientaTrabajo() {
        return herramientaTrabajo;
    }
}
