package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.general.values.HoraEmpezarJornadaLaboral;
import co.com.sofka.domain.generic.Command;

public class ModificarHoraEmpezarJornadaLaboral extends Command {

    private final HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral;

    public ModificarHoraEmpezarJornadaLaboral(HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral){
        this.horaEmpezarJornadaLaboral = horaEmpezarJornadaLaboral;
    }

    public HoraEmpezarJornadaLaboral getHoraEmpezarJornadaLaboral() {
        return horaEmpezarJornadaLaboral;
    }
}
