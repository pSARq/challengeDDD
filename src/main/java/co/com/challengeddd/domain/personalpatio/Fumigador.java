package co.com.challengeddd.domain.personalpatio;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalpatio.values.AreaAFumigar;
import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.challengeddd.domain.personalpatio.values.Veneno;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Fumigador extends Entity<IdFumigador> {

    private Nombre nombre;
    private NumeroCelular numeroCelular;
    private AreaAFumigar areaAFumigar;
    private Veneno veneno;

    public Fumigador(IdFumigador idFumigador, Nombre nombre, NumeroCelular numeroCelular, AreaAFumigar areaAFumigar, Veneno veneno){
        super(idFumigador);
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.areaAFumigar = areaAFumigar;
        this.veneno = veneno;
    }

    public void modificarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void modificarNumeroCelular(NumeroCelular numeroCelular){
        this.numeroCelular = Objects.requireNonNull(numeroCelular);
    }

    public void modificarAreaAFumigar(AreaAFumigar areaAFumigar){
        this.areaAFumigar = Objects.requireNonNull(areaAFumigar);
    }

    public void modificarVeneno(Veneno veneno){
        this.veneno = Objects.requireNonNull(veneno);
    }

    public Nombre nombre() {
        return nombre;
    }

    public NumeroCelular numeroCelular() {
        return numeroCelular;
    }

    public AreaAFumigar areaAFumigar() {
        return areaAFumigar;
    }

    public Veneno veneno() {
        return veneno;
    }
}
