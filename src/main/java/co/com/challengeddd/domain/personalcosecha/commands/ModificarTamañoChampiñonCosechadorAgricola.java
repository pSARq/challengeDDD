package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.sofka.domain.generic.Command;

public class ModificarTamañoChampiñonCosechadorAgricola extends Command {

    private final IdCosechadorAgricola idCosechadorAgricola;
    private final TamañoChampiñon tamañoChampiñon;

    public ModificarTamañoChampiñonCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, TamañoChampiñon tamañoChampiñon){
        this.idCosechadorAgricola = idCosechadorAgricola;
        this.tamañoChampiñon = tamañoChampiñon;
    }

    public IdCosechadorAgricola getIdCosechadorAgricola() {
        return idCosechadorAgricola;
    }

    public TamañoChampiñon getTamañoChampiñon() {
        return tamañoChampiñon;
    }
}
