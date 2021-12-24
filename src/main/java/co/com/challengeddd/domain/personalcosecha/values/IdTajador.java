package co.com.challengeddd.domain.personalcosecha.values;

import co.com.sofka.domain.generic.Identity;

public class IdTajador extends Identity {

    public IdTajador(){

    }

    private IdTajador(String id){
        super(id);
    }

    public static IdTajador of(String id){
        return new IdTajador(id);
    }
}
