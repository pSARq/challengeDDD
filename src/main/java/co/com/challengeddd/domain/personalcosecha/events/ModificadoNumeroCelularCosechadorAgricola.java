package co.com.challengeddd.domain.personalcosecha.events;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoNumeroCelularCosechadorAgricola extends DomainEvent {

    private final IdCosechadorAgricola idCosechadorAgricola;
    private final NumeroCelular numeroCelular;

    public ModificadoNumeroCelularCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, NumeroCelular numeroCelular) {
        super("challengeddd.domain.personalcosecha.modificadonumerocelularcosechadoragricola");
        this.idCosechadorAgricola = idCosechadorAgricola;
        this.numeroCelular = numeroCelular;
    }

    public IdCosechadorAgricola getIdCosechadorAgricola() {
        return idCosechadorAgricola;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
