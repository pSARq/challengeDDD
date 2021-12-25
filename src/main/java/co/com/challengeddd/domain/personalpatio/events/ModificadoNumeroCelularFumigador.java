package co.com.challengeddd.domain.personalpatio.events;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoNumeroCelularFumigador extends DomainEvent {

    private final IdFumigador idFumigador;
    private final NumeroCelular numeroCelular;

    public ModificadoNumeroCelularFumigador(IdFumigador idFumigador, NumeroCelular numeroCelular) {
        super("challengeddd.domain.personalpatio.modificadonumerocelularfumigador");
        this.idFumigador = idFumigador;
        this.numeroCelular = numeroCelular;
    }

    public IdFumigador getIdFumigador() {
        return idFumigador;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
