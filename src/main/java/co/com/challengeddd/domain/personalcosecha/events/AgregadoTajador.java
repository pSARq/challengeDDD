package co.com.challengeddd.domain.personalcosecha.events;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.challengeddd.domain.personalcosecha.values.TecnicaTajado;
import co.com.challengeddd.domain.personalcosecha.values.TipoCuchillo;
import co.com.sofka.domain.generic.DomainEvent;

public class AgregadoTajador extends DomainEvent {

    private final IdTajador id;
    private final Nombre nombre;
    private final NumeroCelular numeroCelular;
    private final TipoCuchillo tipoCuchillo;
    private final TecnicaTajado tecnicaTajado;

    public AgregadoTajador(IdTajador id, Nombre nombre, NumeroCelular numeroCelular, TipoCuchillo tipoCuchillo, TecnicaTajado tecnicaTajado) {
        super("challengeddd.domain.personalcosecha.agregadotajador");
        this.id = id;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.tipoCuchillo = tipoCuchillo;
        this.tecnicaTajado = tecnicaTajado;
    }

    public IdTajador getId() {
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

    public TecnicaTajado getTecnicaTajado() {
        return tecnicaTajado;
    }
}
