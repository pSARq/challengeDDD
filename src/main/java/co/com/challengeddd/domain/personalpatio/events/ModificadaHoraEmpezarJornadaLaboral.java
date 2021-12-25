package co.com.challengeddd.domain.personalpatio.events;

import co.com.challengeddd.domain.general.values.HoraEmpezarJornadaLaboral;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadaHoraEmpezarJornadaLaboral extends DomainEvent {

    private final HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral;

    public ModificadaHoraEmpezarJornadaLaboral(HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral) {
        super("challengeddd.domain.personalpatio.modificadahoraempezarjornadalaboral");
        this.horaEmpezarJornadaLaboral = horaEmpezarJornadaLaboral;
    }

    public HoraEmpezarJornadaLaboral getHoraEmpezarJornadaLaboral() {
        return horaEmpezarJornadaLaboral;
    }
}
