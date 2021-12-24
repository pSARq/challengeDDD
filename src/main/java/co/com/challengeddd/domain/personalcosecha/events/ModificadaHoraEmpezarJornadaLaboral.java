package co.com.challengeddd.domain.personalcosecha.events;

import co.com.challengeddd.domain.general.values.HoraEmpezarJornadaLaboral;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadaHoraEmpezarJornadaLaboral extends DomainEvent {

    private final HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral;

    public ModificadaHoraEmpezarJornadaLaboral(HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral) {
        super("challengeddd.domain.personalcosecha.modificadahoraempezarjornadalaboral");
        this.horaEmpezarJornadaLaboral = horaEmpezarJornadaLaboral;
    }

    public HoraEmpezarJornadaLaboral getHoraEmpezarJornadaLaboral() {
        return horaEmpezarJornadaLaboral;
    }
}
