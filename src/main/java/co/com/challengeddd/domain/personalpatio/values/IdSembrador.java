package co.com.challengeddd.domain.personalpatio.values;

import co.com.sofka.domain.generic.Identity;

public class IdSembrador extends Identity {

    public IdSembrador(){

    }

    private IdSembrador(String id){
        super(id);
    }

    public static IdSembrador of(String id){
        return new IdSembrador(id);
    }
}
