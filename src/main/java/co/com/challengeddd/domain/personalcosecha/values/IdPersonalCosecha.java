package co.com.challengeddd.domain.personalcosecha.values;

import co.com.sofka.domain.generic.Identity;

public class IdPersonalCosecha extends Identity {

    public IdPersonalCosecha(){

    }

    private IdPersonalCosecha(String id){
        super(id);
    }

    public static IdPersonalCosecha of(String id){
        return new IdPersonalCosecha(id);
    }
}
