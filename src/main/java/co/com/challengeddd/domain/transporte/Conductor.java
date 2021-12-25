package co.com.challengeddd.domain.transporte;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.transporte.values.IdConductor;
import co.com.challengeddd.domain.transporte.values.Licencia;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Conductor extends Entity<IdConductor> {

    private Nombre nombre;
    private NumeroCelular numeroCelular;
    private Licencia licencia;

    public Conductor(IdConductor idConductor, Nombre nombre, NumeroCelular numeroCelular, Licencia licencia){
        super(idConductor);
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.licencia = licencia;
    }

    public void modificarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void modificarNumeroCelular(NumeroCelular numeroCelular){
        this.numeroCelular = Objects.requireNonNull(numeroCelular);
    }

    public void modificarLicencia(Licencia licencia){
        this.licencia = Objects.requireNonNull(licencia);
    }

    public Nombre nombre() {
        return nombre;
    }

    public NumeroCelular numeroCelular() {
        return numeroCelular;
    }

    public Licencia licencia() {
        return licencia;
    }
}
