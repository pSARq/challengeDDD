package co.com.challengeddd.domain.personalcosecha.events;

import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.sofka.domain.generic.DomainEvent;

public class QuitadoCosechadorAgricola extends DomainEvent {

    private final IdCosechadorAgricola idCosechadorAgricola;

    public QuitadoCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola) {
        super("challengeddd.domain.personalcosecha.quitadocosechadoragricola");
        this.idCosechadorAgricola = idCosechadorAgricola;
    }

    public IdCosechadorAgricola getIdCosechadorAgricola() {
        return idCosechadorAgricola;
    }
}
