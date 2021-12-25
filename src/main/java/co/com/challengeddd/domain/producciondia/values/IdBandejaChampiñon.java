package co.com.challengeddd.domain.producciondia.values;

import co.com.sofka.domain.generic.Identity;

public class IdBandejaChampiñon extends Identity {

    public IdBandejaChampiñon(){

    }

    private IdBandejaChampiñon(String id){
        super(id);
    }

    public static IdBandejaChampiñon of(String id){
        return new IdBandejaChampiñon(id);
    }
}
