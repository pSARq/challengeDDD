package co.com.challengeddd.domain.jefe;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.jefe.values.IdSupervisor;
import co.com.challengeddd.domain.jefe.values.InformeMateriaPrima;
import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Supervisor extends Entity<IdSupervisor> {

    private IdPersonalPatio idPersonalPatio;
    private IdPersonalCosecha idPersonalCosecha;
    private Nombre nombre;
    private NumeroCelular numeroCelular;
    private InformeMateriaPrima informeMateriaPrima;

    public Supervisor(IdSupervisor idSupervisor, IdPersonalPatio idPersonalPatio, IdPersonalCosecha idPersonalCosecha, Nombre nombre, NumeroCelular numeroCelular){
        super(idSupervisor);
        this.idPersonalPatio = idPersonalPatio;
        this.idPersonalCosecha = idPersonalCosecha;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
    }

    public void modificarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void modificarNumeroCelular(NumeroCelular numeroCelular){
        this.numeroCelular = Objects.requireNonNull(numeroCelular);
    }

    public void modificarPersonalPatio(IdPersonalPatio idPersonalPatio){
        this.idPersonalPatio = Objects.requireNonNull(idPersonalPatio);
    }

    public void modificarPersonalCosecha(IdPersonalCosecha idPersonalCosecha){
        this.idPersonalCosecha = Objects.requireNonNull(idPersonalCosecha);
    }

    public void AgregarInformeMateriaPrima(InformeMateriaPrima informeMateriaPrima){
        this.informeMateriaPrima = Objects.requireNonNull(informeMateriaPrima);
    }

    public void modificarInformeMateriaPrima(InformeMateriaPrima informeMateriaPrima){
        this.informeMateriaPrima = Objects.requireNonNull(informeMateriaPrima);
    }

    public IdPersonalPatio idPersonalPatio() {
        return idPersonalPatio;
    }

    public IdPersonalCosecha idPersonalCosecha() {
        return idPersonalCosecha;
    }

    public Nombre nombre() {
        return nombre;
    }

    public NumeroCelular numeroCelular() {
        return numeroCelular;
    }

    public InformeMateriaPrima informeMateriaPrima() {
        return informeMateriaPrima;
    }
}
