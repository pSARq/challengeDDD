package co.com.challengeddd.domain.personalcosecha.events;

import co.com.challengeddd.domain.general.values.Sala;
import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadaSalaCosechadorAgricola extends DomainEvent {

    private final IdCosechadorAgricola idCosechadorAgricola;
    private final Sala sala;

    public ModificadaSalaCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, Sala sala) {
        super("challengeddd.domain.personalcosecha.modificadasalacosechadoragricola");
        this.idCosechadorAgricola = idCosechadorAgricola;
        this.sala = sala;
    }

    public IdCosechadorAgricola getIdCosechadorAgricola() {
        return idCosechadorAgricola;
    }

    public Sala getSala() {
        return sala;
    }
}
