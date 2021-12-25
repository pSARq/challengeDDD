package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.personalcosecha.values.IdPersonalCosecha;
import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.challengeddd.domain.personalcosecha.values.TecnicaTajado;
import co.com.sofka.domain.generic.Command;

public class ModificarTecnicaTajadoTajador extends Command {

    private IdPersonalCosecha idPersonalCosecha;
    private final IdTajador idTajador;
    private final TecnicaTajado tecnicaTajado;

    public ModificarTecnicaTajadoTajador(IdPersonalCosecha idPersonalCosecha, IdTajador idTajador, TecnicaTajado tecnicaTajado){
        this.idPersonalCosecha = idPersonalCosecha;
        this.idTajador = idTajador;
        this.tecnicaTajado = tecnicaTajado;
    }

    public IdPersonalCosecha getIdPersonalCosecha() {
        return idPersonalCosecha;
    }

    public IdTajador getIdTajador() {
        return idTajador;
    }

    public TecnicaTajado getTecnicaTajado() {
        return tecnicaTajado;
    }
}
