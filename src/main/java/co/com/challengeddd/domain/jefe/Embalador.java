package co.com.challengeddd.domain.jefe;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.jefe.values.IdEmbalador;
import co.com.challengeddd.domain.jefe.values.TipoEmbaladora;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Embalador extends Entity<IdEmbalador> {

    private Nombre nombre;
    private NumeroCelular numeroCelular;
    private TipoEmbaladora tipoEmbaladora;

    public Embalador(IdEmbalador idEmbalador, Nombre nombre, NumeroCelular numeroCelular, TipoEmbaladora tipoEmbaladora){
        super(idEmbalador);
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.tipoEmbaladora = tipoEmbaladora;
    }

    public void modificarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void modificarNumeroCelular(NumeroCelular numeroCelular){
        this.numeroCelular = Objects.requireNonNull(numeroCelular);
    }

    public void modificarTipoEmbaladora(TipoEmbaladora tipoEmbaladora){
        this.tipoEmbaladora = Objects.requireNonNull(tipoEmbaladora);
    }

    public Nombre nombre() {
        return nombre;
    }

    public NumeroCelular numeroCelular() {
        return numeroCelular;
    }

    public TipoEmbaladora tipoEmbaladora() {
        return tipoEmbaladora;
    }
}
