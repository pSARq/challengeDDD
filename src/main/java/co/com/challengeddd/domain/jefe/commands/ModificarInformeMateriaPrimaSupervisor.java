package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.jefe.values.InformeMateriaPrima;
import co.com.sofka.domain.generic.Command;

public class ModificarInformeMateriaPrimaSupervisor extends Command {

    private final InformeMateriaPrima informeMateriaPrima;

    public ModificarInformeMateriaPrimaSupervisor(InformeMateriaPrima informeMateriaPrima){
        this.informeMateriaPrima = informeMateriaPrima;
    }

    public InformeMateriaPrima getInformeMateriaPrima() {
        return informeMateriaPrima;
    }
}
