package co.com.challengeddd.domain.personalpatio.events;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalpatio.values.AreaAFumigar;
import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.challengeddd.domain.personalpatio.values.Veneno;
import co.com.sofka.domain.generic.DomainEvent;

public class AgregadoFumigador extends DomainEvent {

    private final IdFumigador id;
    private final Nombre nombre;
    private final NumeroCelular numeroCelular;
    private final AreaAFumigar areaAFumigar;
    private final Veneno veneno;

    public AgregadoFumigador(IdFumigador id, Nombre nombre, NumeroCelular numeroCelular, AreaAFumigar areaAFumigar, Veneno veneno) {
        super("challengeddd.domain.personalpatio.agregadofumigador");
        this.id = id;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.areaAFumigar = areaAFumigar;
        this.veneno = veneno;
    }

    public IdFumigador getId() {
        return id;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }

    public AreaAFumigar getAreaAFumigar() {
        return areaAFumigar;
    }

    public Veneno getVeneno() {
        return veneno;
    }
}
