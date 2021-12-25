package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.personalpatio.values.HoraTerminarJornadaLaboral;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.sofka.domain.generic.Command;

public class ModificarHoraTerminarJornadaLaboral extends Command {

    private IdPersonalPatio idPersonalPatio;
    private final HoraTerminarJornadaLaboral horaTerminarJornadaLaboral;

    public ModificarHoraTerminarJornadaLaboral(IdPersonalPatio idPersonalPatio, HoraTerminarJornadaLaboral horaTerminarJornadaLaboral){
        this.idPersonalPatio = idPersonalPatio;
        this.horaTerminarJornadaLaboral = horaTerminarJornadaLaboral;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }

    public HoraTerminarJornadaLaboral getHoraTerminarJornadaLaboral() {
        return horaTerminarJornadaLaboral;
    }
}
