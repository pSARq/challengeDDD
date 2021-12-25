package co.com.challengeddd.domain.personalcosecha.events;

import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoTamañoChampiñonCosechadorAgricola extends DomainEvent {

    private final IdCosechadorAgricola idCosechadorAgricola;
    private final TamañoChampiñon tamañoChampiñon;

    public ModificadoTamañoChampiñonCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, TamañoChampiñon tamañoChampiñon) {
        super("challengeddd.domain.personalcosecha.modificadotamañochampiñoncosechadoragricola");
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
