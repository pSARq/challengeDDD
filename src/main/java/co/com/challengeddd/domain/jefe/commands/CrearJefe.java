package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.jefe.values.Area;
import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.sofka.domain.generic.Command;

public class CrearJefe extends Command {

    private final IdJefe idJefe;
    private final Area area;

    public CrearJefe(IdJefe idJefe, Area area){
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
