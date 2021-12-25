package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalpatio.values.AreaAFumigar;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.challengeddd.domain.personalpatio.values.Veneno;
import co.com.sofka.domain.generic.Command;

public class AgregarFumigador extends Command {

    private IdPersonalPatio idPersonalPatio;
    private final Nombre nombre;
    private final NumeroCelular numeroCelular;
    private final AreaAFumigar areaAFumigar;
    private final Veneno veneno;

    public AgregarFumigador(IdPersonalPatio idPersonalPatio, Nombre nombre, NumeroCelular numeroCelular, AreaAFumigar areaAFumigar, Veneno veneno){
        this.idPersonalPatio = idPersonalPatio;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.areaAFumigar = areaAFumigar;
        this.veneno = veneno;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
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
