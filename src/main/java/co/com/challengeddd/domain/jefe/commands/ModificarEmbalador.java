package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.jefe.Embalador;
import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.sofka.domain.generic.Command;

public class ModificarEmbalador extends Command {

    private IdJefe idJefe;
    private final Embalador embalador;

    public ModificarEmbalador(IdJefe idJefe, Embalador embalador){
        this.idJefe = idJefe;
        this.embalador = embalador;
    }

    public IdJefe getIdJefe() {
        return idJefe;
    }

    public Embalador getEmbalador() {
        return embalador;
    }
}
