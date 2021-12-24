package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.jefe.values.InformeMateriaPrima;
import co.com.sofka.domain.generic.Command;

public class AgregarInformeMateriaPrimaSupervisor extends Command {

    private final InformeMateriaPrima informeMateriaPrima;

    public AgregarInformeMateriaPrimaSupervisor(InformeMateriaPrima informeMateriaPrima){
        this.informeMateriaPrima = informeMateriaPrima;
    }

    public InformeMateriaPrima getInformeMateriaPrima() {
        return informeMateriaPrima;
    }
}
