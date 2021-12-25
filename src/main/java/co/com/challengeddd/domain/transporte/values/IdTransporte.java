package co.com.challengeddd.domain.transporte.values;

import co.com.sofka.domain.generic.Identity;

public class IdTransporte extends Identity {

    public IdTransporte(){

    }

    private IdTransporte(String id){
        super(id);
    }

    public static IdTransporte of(String id){
        return new IdTransporte(id);
    }
}
