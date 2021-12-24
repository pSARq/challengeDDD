package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreCosechadorAgricola extends Command {

    private final IdCosechadorAgricola idCosechadorAgricola;
    private final Nombre nombre;

    public ModificarNombreCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, Nombre nombre){
        this.idCosechadorAgricola = idCosechadorAgricola;
        this.nombre = nombre;
    }

    public IdCosechadorAgricola getIdCosechadorAgricola() {
        return idCosechadorAgricola;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
