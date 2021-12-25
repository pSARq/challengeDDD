package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.sofka.domain.generic.Command;

public class ModificarProduccionDia extends Command {

    private final IdProduccionDia idProduccionDia;

    public ModificarProduccionDia(IdProduccionDia idProduccionDia){
        this.idProduccionDia = idProduccionDia;
    }

    public IdProduccionDia getIdProduccionDia() {
        return idProduccionDia;
    }
}
