package co.com.challengeddd.domain.personalpatio.events;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoNombreFumigador extends DomainEvent {

    private final IdFumigador idFumigador;
    private final Nombre nombre;

    public ModificadoNombreFumigador(IdFumigador idFumigador, Nombre nombre) {
        super("challengeddd.domain.personalpatio.modificadonombrefumigador");
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
