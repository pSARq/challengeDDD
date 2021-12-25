package co.com.challengeddd.domain.personalpatio.events;

import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.challengeddd.domain.personalpatio.values.Veneno;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoVenenoFumigador extends DomainEvent {

    private final IdFumigador idFumigador;
    private final Veneno veneno;

    public ModificadoVenenoFumigador(IdFumigador idFumigador, Veneno veneno) {
        super("challengeddd.domain.personalpatio.modificadovenenofumigador");
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
