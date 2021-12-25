package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.sofka.domain.generic.Command;

public class QuitarCosechadorAgricola extends Command {

    private IdPersonalCosecha idPersonalCosecha;
    private final IdCosechadorAgricola idCosechadorAgricola;

    public QuitarCosechadorAgricola(IdPersonalCosecha idPersonalCosecha, IdCosechadorAgricola idCosechadorAgricola){
        this.idPersonalCosecha = idPersonalCosecha;
        this.idCosechadorAgricola = idCosechadorAgricola;
    }

    public IdPersonalCosecha getIdPersonalCosecha() {
        return idPersonalCosecha;
    }

    public IdCosechadorAgricola getIdCosechadorAgricola() {
        return idCosechadorAgricola;
    }
}
