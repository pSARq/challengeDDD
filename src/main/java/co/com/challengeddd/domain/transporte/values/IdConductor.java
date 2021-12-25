package co.com.challengeddd.domain.transporte.values;

import co.com.sofka.domain.generic.Identity;

public class IdConductor extends Identity {

    public IdConductor() {

    }

    private IdConductor(String id){
        super(id);
    }

    public static IdConductor of(String id){
        return new IdConductor(id);
    }
}
