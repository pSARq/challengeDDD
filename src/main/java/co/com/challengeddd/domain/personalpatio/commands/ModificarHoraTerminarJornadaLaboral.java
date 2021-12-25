package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.personalpatio.values.HoraTerminarJornadaLaboral;
import co.com.sofka.domain.generic.Command;

public class ModificarHoraTerminarJornadaLaboral extends Command {

    private final HoraTerminarJornadaLaboral horaTerminarJornadaLaboral;

    public ModificarHoraTerminarJornadaLaboral(HoraTerminarJornadaLaboral horaTerminarJornadaLaboral){
        this.horaTerminarJornadaLaboral = horaTerminarJornadaLaboral;
    }

    public HoraTerminarJornadaLaboral getHoraTerminarJornadaLaboral() {
        return horaTerminarJornadaLaboral;
    }
}
