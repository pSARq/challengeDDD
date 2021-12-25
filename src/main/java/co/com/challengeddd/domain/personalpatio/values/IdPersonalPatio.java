package co.com.challengeddd.domain.personalpatio.values;

import co.com.sofka.domain.generic.Identity;

public class IdPersonalPatio extends Identity {

    public IdPersonalPatio(){

    }

    private IdPersonalPatio(String id){
        super(id);
    }

    public static IdPersonalPatio of(String id){
        return new IdPersonalPatio(id);
    }
}
