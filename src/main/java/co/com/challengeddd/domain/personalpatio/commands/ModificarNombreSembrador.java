package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.challengeddd.domain.personalpatio.values.IdSembrador;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreSembrador extends Command {

    private IdPersonalPatio idPersonalPatio;
    private final IdSembrador idSembrador;
    private final Nombre nombre;

    public ModificarNombreSembrador(IdPersonalPatio idPersonalPatio, IdSembrador idSembrador, Nombre nombre){
        this.idPersonalPatio = idPersonalPatio;
        this.idSembrador = idSembrador;
        this.nombre = nombre;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }

    public IdSembrador getIdSembrador() {
        return idSembrador;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
