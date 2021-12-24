package co.com.challengeddd.domain.personalcosecha.events;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoNumeroCelularTajador extends DomainEvent {

    private final IdTajador idTajador;
    private final NumeroCelular numeroCelular;

    public ModificadoNumeroCelularTajador(IdTajador idTajador, NumeroCelular numeroCelular) {
        super("challengeddd.domain.personalcosecha.modificadonumerocelulartajador");
        this.idTajador = idTajador;
        this.numeroCelular = numeroCelular;
    }

    public IdTajador getIdTajador() {
        return idTajador;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
