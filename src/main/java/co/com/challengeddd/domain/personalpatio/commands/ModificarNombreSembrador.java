package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreSembrador extends Command {

    private final IdSembrador idSembrador;
    private final Nombre nombre;

    public ModificarNombreSembrador(IdSembrador idSembrador, Nombre nombre){
        this.idSembrador = idSembrador;
        this.nombre = nombre;
    }

    public IdSembrador getIdSembrador() {
        return idSembrador;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
