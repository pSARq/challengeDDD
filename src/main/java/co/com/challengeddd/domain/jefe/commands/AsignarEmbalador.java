package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.jefe.values.TipoEmbaladora;
import co.com.sofka.domain.generic.Command;

public class AsignarEmbalador extends Command {

    private final Nombre nombre;
    private final NumeroCelular numeroCelular;
    private final TipoEmbaladora tipoEmbaladora;

    public AsignarEmbalador(Nombre nombre, NumeroCelular numeroCelular, TipoEmbaladora tipoEmbaladora){
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.tipoEmbaladora = tipoEmbaladora;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }

    public TipoEmbaladora getTipoEmbaladora() {
        return tipoEmbaladora;
    }
}
