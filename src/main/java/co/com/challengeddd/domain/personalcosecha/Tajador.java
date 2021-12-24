package co.com.challengeddd.domain.personalcosecha;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.challengeddd.domain.personalcosecha.values.TecnicaTajado;
import co.com.challengeddd.domain.personalcosecha.values.TipoCuchillo;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Tajador extends Entity<IdTajador> {

    private Nombre nombre;
    private NumeroCelular numeroCelular;
    private TipoCuchillo tipoCuchillo;
    private TecnicaTajado tecnicaTajado;

    public Tajador(IdTajador idTajador, Nombre nombre, NumeroCelular numeroCelular, TipoCuchillo tipoCuchillo, TecnicaTajado tecnicaTajado){
        super(idTajador);
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.tipoCuchillo = tipoCuchillo;
        this.tecnicaTajado = tecnicaTajado;
    }

    public void modificarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void modificarNumeroCelular(NumeroCelular numeroCelular){
        this.numeroCelular = Objects.requireNonNull(numeroCelular);
    }

    public void modificarTipoCuchillo(TipoCuchillo tipoCuchillo){
        this.tipoCuchillo = Objects.requireNonNull(tipoCuchillo);
    }

    public void modificarTecnicaTajado(TecnicaTajado tecnicaTajado){
        this.tecnicaTajado = Objects.requireNonNull(tecnicaTajado);
    }

    public Nombre nombre() {
        return nombre;
    }

    public NumeroCelular numeroCelular() {
        return numeroCelular;
    }

    public TipoCuchillo tipoCuchillo() {
        return tipoCuchillo;
    }

    public TecnicaTajado tecnicaTajado() {
        return tecnicaTajado;
    }
}
