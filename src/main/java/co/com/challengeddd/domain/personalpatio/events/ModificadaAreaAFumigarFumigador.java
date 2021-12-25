package co.com.challengeddd.domain.personalpatio.events;

import co.com.challengeddd.domain.personalpatio.values.AreaAFumigar;
import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadaAreaAFumigarFumigador extends DomainEvent {

    private final IdFumigador idFumigador;
    private final AreaAFumigar areaAFumigar;

    public ModificadaAreaAFumigarFumigador(IdFumigador idFumigador, AreaAFumigar areaAFumigar) {
        super("challengeddd.domain.personalpatio.modificadaareaafumigarfumigador");
        this.idFumigador = idFumigador;
        this.areaAFumigar = areaAFumigar;
    }

    public IdFumigador getIdFumigador() {
        return idFumigador;
    }

    public AreaAFumigar getAreaAFumigar() {
        return areaAFumigar;
    }
}
