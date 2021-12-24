package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.general.values.Sala;
import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.sofka.domain.generic.Command;

public class ModificarSalaCosechadorAgricola extends Command {

    private final IdCosechadorAgricola idCosechadorAgricola;
    private final Sala sala;

    public ModificarSalaCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, Sala sala){
        this.idCosechadorAgricola = idCosechadorAgricola;
        this.sala = sala;
    }

    public IdCosechadorAgricola getIdCosechadorAgricola() {
        return idCosechadorAgricola;
    }

    public Sala getSala() {
        return sala;
    }
}
