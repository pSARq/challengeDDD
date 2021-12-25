package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreFumigador extends Command {

    private IdPersonalPatio idPersonalPatio;
    private final IdFumigador idFumigador;
    private final Nombre nombre;

    public ModificarNombreFumigador(IdPersonalPatio idPersonalPatio, IdFumigador idFumigador, Nombre nombre){
        this.idPersonalPatio = idPersonalPatio;
        this.idFumigador = idFumigador;
        this.nombre = nombre;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }

    public IdFumigador getIdFumigador() {
        return idFumigador;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
