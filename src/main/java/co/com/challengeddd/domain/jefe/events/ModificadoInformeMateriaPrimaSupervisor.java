package co.com.challengeddd.domain.jefe.events;

import co.com.challengeddd.domain.jefe.values.InformeMateriaPrima;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoInformeMateriaPrimaSupervisor extends DomainEvent {
    private final InformeMateriaPrima informeMateriaPrima;

    public ModificadoInformeMateriaPrimaSupervisor(InformeMateriaPrima informeMateriaPrima) {
        super("challengeddd.domain.jefe.modificadoinformemateriaprimasupervisor");
        this.informeMateriaPrima = informeMateriaPrima;
    }

    public InformeMateriaPrima getInformeMateriaPrima() {
        return informeMateriaPrima;
    }
}
