package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.general.values.Sala;
import co.com.challengeddd.domain.personalpatio.values.HerramientaTrabajo;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.sofka.domain.generic.Command;

public class AgregarSembrador extends Command {

    private IdPersonalPatio idPersonalPatio;
    private final Nombre nombre;
    private final NumeroCelular numeroCelular;
    private final Sala sala;
    private final HerramientaTrabajo herramientaTrabajo;

    public AgregarSembrador(IdPersonalPatio idPersonalPatio, Nombre nombre, NumeroCelular numeroCelular, Sala sala, HerramientaTrabajo herramientaTrabajo){
        this.idPersonalPatio = idPersonalPatio;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.sala = sala;
        this.herramientaTrabajo = herramientaTrabajo;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }

    public Sala getSala() {
        return sala;
    }

    public HerramientaTrabajo getHerramientaTrabajo() {
        return herramientaTrabajo;
    }
}
