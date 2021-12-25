package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.challengeddd.domain.personalpatio.values.Veneno;
import co.com.sofka.domain.generic.Command;

public class ModificarVenenoFumigador extends Command {

    private IdPersonalPatio idPersonalPatio;
    private final IdFumigador idFumigador;
    private final Veneno veneno;

    public ModificarVenenoFumigador(IdPersonalPatio idPersonalPatio, IdFumigador idFumigador, Veneno veneno){
        this.idPersonalPatio = idPersonalPatio;
        this.idFumigador = idFumigador;
        this.veneno = veneno;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }

    public IdFumigador getIdFumigador() {
        return idFumigador;
    }

    public Veneno getVeneno() {
        return veneno;
    }
}
