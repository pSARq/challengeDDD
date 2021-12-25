package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.challengeddd.domain.personalpatio.values.Veneno;
import co.com.sofka.domain.generic.Command;

public class ModificarVenenoFumigador extends Command {

    private final IdFumigador idFumigador;
    private final Veneno veneno;

    public ModificarVenenoFumigador(IdFumigador idFumigador, Veneno veneno){
        this.idFumigador = idFumigador;
        this.veneno = veneno;
    }

    public IdFumigador getIdFumigador() {
        return idFumigador;
    }

    public Veneno getVeneno() {
        return veneno;
    }
}
