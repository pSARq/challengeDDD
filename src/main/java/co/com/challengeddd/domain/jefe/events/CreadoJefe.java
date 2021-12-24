package co.com.challengeddd.domain.jefe.events;

import co.com.challengeddd.domain.jefe.values.Area;
import co.com.sofka.domain.generic.DomainEvent;

public class CreadoJefe extends DomainEvent {
    private final Area area;

    public CreadoJefe(Area area) {
        super("challengeddd.domain.jefe.creadojefe");
        this.area = area;
    }

    public Area getArea() {
        return area;
    }
}
