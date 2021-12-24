package co.com.challengeddd.domain.personalcosecha.values;

import co.com.sofka.domain.generic.Identity;

public class IdCosechadorAgricola extends Identity {

    public IdCosechadorAgricola(){

    }

    private IdCosechadorAgricola(String id){
        super(id);
    }

    public static IdCosechadorAgricola of(String id){
        return new IdCosechadorAgricola(id);
    }

}
