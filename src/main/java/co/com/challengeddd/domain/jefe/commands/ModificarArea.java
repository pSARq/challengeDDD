package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.jefe.values.Area;
import co.com.sofka.domain.generic.Command;

public class ModificarArea extends Command {

    private final Area area;

    public ModificarArea(Area area){
        this.area = area;
    }

    public Area getArea() {
        return area;
    }
}
