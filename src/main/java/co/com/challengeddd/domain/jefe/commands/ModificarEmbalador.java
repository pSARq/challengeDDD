package co.com.challengeddd.domain.jefe.commands;

import co.com.challengeddd.domain.jefe.Embalador;
import co.com.sofka.domain.generic.Command;

public class ModificarEmbalador extends Command {

    private final Embalador embalador;

    public ModificarEmbalador(Embalador embalador){
        this.embalador = embalador;
    }

    public Embalador getEmbalador() {
        return embalador;
    }
}
