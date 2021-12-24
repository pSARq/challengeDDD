package co.com.challengeddd.domain.personalcosecha.events;

import co.com.challengeddd.domain.general.values.HoraEmpezarJornadaLaboral;
import co.com.sofka.domain.generic.DomainEvent;

public class CreadoPersonalCosecha extends DomainEvent {

    private final HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral;

    public CreadoPersonalCosecha(HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral) {
        super("challengeddd.domain.personalcosecha.creadopersonalcosecha");
        this.horaEmpezarJornadaLaboral = horaEmpezarJornadaLaboral;
    }

    public HoraEmpezarJornadaLaboral getHoraEmpezarJornadaLaboral() {
        return horaEmpezarJornadaLaboral;
    }
}
