package co.com.challengeddd.domain.jefe.events;

import co.com.challengeddd.domain.jefe.values.InformeMateriaPrima;
import co.com.sofka.domain.generic.DomainEvent;

public class AgregadoInformeMateriaPrimaSupervisor extends DomainEvent {
    private final InformeMateriaPrima informeMateriaPrima;

    public AgregadoInformeMateriaPrimaSupervisor(InformeMateriaPrima informeMateriaPrima) {
        super("challengeddd.domain.jefe.agregadoinformemateriaprimasupervisor");
        this.informeMateriaPrima = informeMateriaPrima;
    }

    public InformeMateriaPrima getInformeMateriaPrima() {
        return informeMateriaPrima;
    }
}
