package co.com.challengeddd.domain.jefearea.values;

import co.com.sofka.domain.generic.Identity;

public class IdJefeArea extends Identity {

    public IdJefeArea(){

    }
    private IdJefeArea(String id){
        super(id);
    }

    public static IdJefeArea of(String id){
        return new IdJefeArea(id);
    }
}
