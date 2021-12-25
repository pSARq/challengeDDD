package co.com.challengeddd.domain.personalpatio.events;

import co.com.challengeddd.domain.general.values.HoraEmpezarJornadaLaboral;
import co.com.challengeddd.domain.personalpatio.values.HoraTerminarJornadaLaboral;
import co.com.sofka.domain.generic.DomainEvent;

public class CreadoPersonalPatio extends DomainEvent {

    private final HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral;
    private final HoraTerminarJornadaLaboral horaTerminarJornadaLaboral;

    public CreadoPersonalPatio(HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral, HoraTerminarJornadaLaboral horaTerminarJornadaLaboral) {
        super("challengeddd.domain.personalpatio.creadopersonalpatio");
        this.horaEmpezarJornadaLaboral = horaEmpezarJornadaLaboral;
        this.horaTerminarJornadaLaboral = horaTerminarJornadaLaboral;
    }

    public HoraEmpezarJornadaLaboral getHoraEmpezarJornadaLaboral() {
        return horaEmpezarJornadaLaboral;
    }

    public HoraTerminarJornadaLaboral getHoraTerminarJornadaLaboral() {
        return horaTerminarJornadaLaboral;
    }
}
