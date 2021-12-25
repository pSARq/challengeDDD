package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.jefe.values.InformeMateriaPrima;
import co.com.sofka.domain.generic.Command;

public class ModificarInformeMateriaPrimaSupervisor extends Command {

    private IdJefe idJefe;
    private final InformeMateriaPrima informeMateriaPrima;

    public ModificarInformeMateriaPrimaSupervisor(IdJefe idJefe, InformeMateriaPrima informeMateriaPrima){
        this.idJefe = idJefe;
        this.informeMateriaPrima = informeMateriaPrima;
    }

    public IdJefe getIdJefe() {
        return idJefe;
    }

    public InformeMateriaPrima getInformeMateriaPrima() {
        return informeMateriaPrima;
    }
}
