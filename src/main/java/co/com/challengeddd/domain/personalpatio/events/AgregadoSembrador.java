package co.com.challengeddd.domain.personalpatio.events;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.general.values.Sala;
import co.com.challengeddd.domain.personalpatio.values.HerramientaTrabajo;
import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.DomainEvent;

public class AgregadoSembrador extends DomainEvent {

    private final IdSembrador id;
    private final Nombre nombre;
    private final NumeroCelular numeroCelular;
    private final Sala sala;
    private final HerramientaTrabajo herramientaTrabajo;

    public AgregadoSembrador(IdSembrador id, Nombre nombre, NumeroCelular numeroCelular, Sala sala, HerramientaTrabajo herramientaTrabajo) {
        super("challengeddd.domain.personalpatio.agregadosembrador");
        this.id = id;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.sala = sala;
        this.herramientaTrabajo = herramientaTrabajo;
    }

    public IdSembrador getId() {
        return id;
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
