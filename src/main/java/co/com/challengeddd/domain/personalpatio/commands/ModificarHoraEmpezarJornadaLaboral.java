package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.general.values.HoraEmpezarJornadaLaboral;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.sofka.domain.generic.Command;

public class ModificarHoraEmpezarJornadaLaboral extends Command {

    private IdPersonalPatio idPersonalPatio;
    private final HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral;

    public ModificarHoraEmpezarJornadaLaboral(IdPersonalPatio idPersonalPatio, HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral){
        this.idPersonalPatio = idPersonalPatio;
        this.horaEmpezarJornadaLaboral = horaEmpezarJornadaLaboral;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }

    public HoraEmpezarJornadaLaboral getHoraEmpezarJornadaLaboral() {
        return horaEmpezarJornadaLaboral;
    }
}
