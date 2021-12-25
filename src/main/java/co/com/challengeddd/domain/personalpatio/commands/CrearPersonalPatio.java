package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.general.values.HoraEmpezarJornadaLaboral;
import co.com.challengeddd.domain.personalpatio.values.HoraTerminarJornadaLaboral;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.sofka.domain.generic.Command;

public class CrearPersonalPatio extends Command {

    private final IdPersonalPatio idPersonalPatio;
    private final HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral;
    private final HoraTerminarJornadaLaboral horaTerminarJornadaLaboral;

    public CrearPersonalPatio(IdPersonalPatio idPersonalPatio, HoraEmpezarJornadaLaboral horaEmpezarJornadaLaboral, HoraTerminarJornadaLaboral horaTerminarJornadaLaboral){
        this.idPersonalPatio = idPersonalPatio;
        this.horaEmpezarJornadaLaboral = horaEmpezarJornadaLaboral;
        this.horaTerminarJornadaLaboral = horaTerminarJornadaLaboral;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }

    public HoraEmpezarJornadaLaboral getHoraEmpezarJornadaLaboral() {
        return horaEmpezarJornadaLaboral;
    }

    public HoraTerminarJornadaLaboral getHoraTerminarJornadaLaboral() {
        return horaTerminarJornadaLaboral;
    }
}
