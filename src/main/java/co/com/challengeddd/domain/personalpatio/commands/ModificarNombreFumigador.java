package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreFumigador extends Command {

    private final IdFumigador idFumigador;
    private final Nombre nombre;

    public ModificarNombreFumigador(IdFumigador idFumigador, Nombre nombre){
        this.idFumigador = idFumigador;
        this.nombre = nombre;
    }

    public IdFumigador getIdFumigador() {
        return idFumigador;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
