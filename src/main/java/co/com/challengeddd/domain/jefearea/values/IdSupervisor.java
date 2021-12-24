package co.com.challengeddd.domain.jefearea.values;

import co.com.sofka.domain.generic.Identity;

public class IdSupervisor extends Identity {

    public IdSupervisor(){

    }

    private IdSupervisor(String id){
        super(id);
    }

    public static IdSupervisor of(String id){
        return new IdSupervisor(id);
    }

}
