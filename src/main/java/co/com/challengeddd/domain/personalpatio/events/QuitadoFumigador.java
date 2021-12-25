package co.com.challengeddd.domain.personalpatio.events;

import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.sofka.domain.generic.DomainEvent;

public class QuitadoFumigador extends DomainEvent {

    private final IdFumigador idFumigador;

    public QuitadoFumigador(IdFumigador idFumigador) {
        super("challengeddd.domain.personalpatio.quitadofumigador");
        this.idFumigador = idFumigador;
    }

    public IdFumigador getIdFumigador() {
        return idFumigador;
    }
}
