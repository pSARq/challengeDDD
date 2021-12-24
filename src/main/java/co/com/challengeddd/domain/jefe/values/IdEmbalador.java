package co.com.challengeddd.domain.jefe.values;

import co.com.sofka.domain.generic.Identity;

public class IdEmbalador extends Identity {

    public IdEmbalador(){

    }

    private IdEmbalador(String id){
        super(id);
    }

    public static IdEmbalador of(String id){
        return new IdEmbalador(id);
    }
}
