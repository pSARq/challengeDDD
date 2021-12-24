package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.sofka.domain.generic.Command;

public class QuitarCosechadorAgricola extends Command {

    private final IdCosechadorAgricola idCosechadorAgricola;

    public QuitarCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola){
        this.idCosechadorAgricola = idCosechadorAgricola;
    }

    public IdCosechadorAgricola getIdCosechadorAgricola() {
        return idCosechadorAgricola;
    }
}
