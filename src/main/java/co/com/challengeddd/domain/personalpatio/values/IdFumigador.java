package co.com.challengeddd.domain.personalpatio.values;

import co.com.sofka.domain.generic.Identity;

public class IdFumigador extends Identity {

    public IdFumigador(){

    }

    private IdFumigador(String id){
        super(id);
    }

    public static IdFumigador of(String id){
        return new IdFumigador(id);
    }
}
