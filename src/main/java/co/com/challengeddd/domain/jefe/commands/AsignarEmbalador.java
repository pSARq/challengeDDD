package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.jefe.values.TipoEmbaladora;
import co.com.sofka.domain.generic.Command;

public class AsignarEmbalador extends Command {

    private IdJefe idJefe;
    private final Nombre nombre;
    private final NumeroCelular numeroCelular;
    private final TipoEmbaladora tipoEmbaladora;

    public AsignarEmbalador(IdJefe idJefe, Nombre nombre, NumeroCelular numeroCelular, TipoEmbaladora tipoEmbaladora){
        this.idJefe = idJefe;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.tipoEmbaladora = tipoEmbaladora;
    }

    public IdJefe getIdJefe() {
        return idJefe;
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
