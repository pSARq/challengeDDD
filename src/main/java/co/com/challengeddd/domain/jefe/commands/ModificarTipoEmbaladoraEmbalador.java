package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.jefe.values.TipoEmbaladora;
import co.com.sofka.domain.generic.Command;

public class ModificarTipoEmbaladoraEmbalador extends Command {

    private final TipoEmbaladora tipoEmbaladora;

    public ModificarTipoEmbaladoraEmbalador(TipoEmbaladora tipoEmbaladora){
        this.tipoEmbaladora = tipoEmbaladora;
    }

    public TipoEmbaladora getTipoEmbaladora() {
        return tipoEmbaladora;
    }
}
