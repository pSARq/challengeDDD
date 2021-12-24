package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.challengeddd.domain.personalcosecha.values.TecnicaTajado;
import co.com.sofka.domain.generic.Command;

public class ModificarTecnicaTajadoTajador extends Command {

    private final IdTajador idTajador;
    private final TecnicaTajado tecnicaTajado;

    public ModificarTecnicaTajadoTajador(IdTajador idTajador, TecnicaTajado tecnicaTajado){
        this.idTajador = idTajador;
        this.tecnicaTajado = tecnicaTajado;
    }

    public IdTajador getIdTajador() {
        return idTajador;
    }

    public TecnicaTajado getTecnicaTajado() {
        return tecnicaTajado;
    }
}
