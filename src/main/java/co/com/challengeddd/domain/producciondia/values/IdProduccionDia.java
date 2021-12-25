package co.com.challengeddd.domain.producciondia.values;

import co.com.sofka.domain.generic.Identity;

public class IdProduccionDia extends Identity {

    public IdProduccionDia(){

    }

    private IdProduccionDia(String id){
        super(id);
    }

    public static IdProduccionDia of(String id){
        return new IdProduccionDia(id);
    }
}
