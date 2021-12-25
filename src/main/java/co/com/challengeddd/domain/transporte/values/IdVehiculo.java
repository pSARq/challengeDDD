package co.com.challengeddd.domain.transporte.values;

import co.com.sofka.domain.generic.Identity;

public class IdVehiculo extends Identity {

    public IdVehiculo(){

    }

    private IdVehiculo(String id){
        super(id);
    }

    public static IdVehiculo of(String id){
        return new IdVehiculo(id);
    }
}
