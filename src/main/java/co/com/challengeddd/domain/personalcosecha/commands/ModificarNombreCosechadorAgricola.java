package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreCosechadorAgricola extends Command {

    private IdPersonalCosecha idPersonalCosecha;
    private final IdCosechadorAgricola idCosechadorAgricola;
    private final Nombre nombre;

    public ModificarNombreCosechadorAgricola(IdPersonalCosecha idPersonalCosecha, IdCosechadorAgricola idCosechadorAgricola, Nombre nombre){
        this.idPersonalCosecha = idPersonalCosecha;
        this.idCosechadorAgricola = idCosechadorAgricola;
        this.nombre = nombre;
    }

    public IdPersonalCosecha getIdPersonalCosecha() {
        return idPersonalCosecha;
    }

    public IdCosechadorAgricola getIdCosechadorAgricola() {
        return idCosechadorAgricola;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
