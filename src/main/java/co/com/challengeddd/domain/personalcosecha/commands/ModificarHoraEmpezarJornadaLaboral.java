package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.general.values.HoraEmpezarJornadaLaboral;
import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.sofka.domain.generic.Command;

public class ModificarHoraEmpezarJornadaLaboral extends Command {

    private IdPersonalCosecha idPersonalCosecha;
    private final HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral;

    public ModificarHoraEmpezarJornadaLaboral(IdPersonalCosecha idPersonalCosecha, HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral){
        this.idPersonalCosecha = idPersonalCosecha;
        this.horaEmpezarJornadaLaboral = horaEmpezarJornadaLaboral;
    }

    public IdPersonalCosecha getIdPersonalCosecha() {
        return idPersonalCosecha;
    }

    public HoraEmpezarJornadaLaboral getHoraEmpezarJornadaLaboral() {
        return horaEmpezarJornadaLaboral;
    }
}
