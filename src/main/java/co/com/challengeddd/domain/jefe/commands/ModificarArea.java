package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.jefe.values.Area;
import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.sofka.domain.generic.Command;

public class ModificarArea extends Command {

    private IdJefe idJefe;
    private final Area area;

    public ModificarArea(IdJefe idJefe, Area area){
        this.idJefe = idJefe;
        this.area = area;
    }

    public IdJefe getIdJefe() {
        return idJefe;
    }

    public Area getArea() {
        return area;
    }
}
