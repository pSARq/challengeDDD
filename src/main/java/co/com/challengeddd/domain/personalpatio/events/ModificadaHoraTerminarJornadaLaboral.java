package co.com.challengeddd.domain.personalpatio.events;

import co.com.challengeddd.domain.personalpatio.values.HoraTerminarJornadaLaboral;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadaHoraTerminarJornadaLaboral extends DomainEvent {

    private final HoraTerminarJornadaLaboral horaTerminarJornadaLaboral;

    public ModificadaHoraTerminarJornadaLaboral(HoraTerminarJornadaLaboral horaTerminarJornadaLaboral) {
        super("challengeddd.domain.personalpatio.modificadahoraterminarjornadalaboral");
        this.horaTerminarJornadaLaboral = horaTerminarJornadaLaboral;
    }

    public HoraTerminarJornadaLaboral getHoraTerminarJornadaLaboral() {
        return horaTerminarJornadaLaboral;
    }
}
