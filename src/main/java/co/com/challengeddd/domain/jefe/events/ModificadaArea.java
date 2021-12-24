package co.com.challengeddd.domain.jefe.events;

import co.com.challengeddd.domain.jefe.values.Area;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadaArea extends DomainEvent {
    private final Area area;

    public ModificadaArea(Area area) {
        super("challengeddd.domain.jefe.modificadaarea");
        this.area = area;
    }

    public Area getArea() {
        return area;
    }
}
