package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.jefe.values.TipoEmbaladora;
import co.com.sofka.domain.generic.Command;

public class ModificarTipoEmbaladoraEmbalador extends Command {

    private IdJefe idJefe;
    private final TipoEmbaladora tipoEmbaladora;

    public ModificarTipoEmbaladoraEmbalador(IdJefe idJefe, TipoEmbaladora tipoEmbaladora){
        this.idJefe = idJefe;
        this.tipoEmbaladora = tipoEmbaladora;
    }

    public IdJefe getIdJefe() {
        return idJefe;
    }

    public TipoEmbaladora getTipoEmbaladora() {
        return tipoEmbaladora;
    }
}
