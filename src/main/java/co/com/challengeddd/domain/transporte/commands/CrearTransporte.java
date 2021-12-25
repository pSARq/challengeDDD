package co.com.challengeddd.domain.transporte.commands;

import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.domain.transporte.values.IdTransporte;
import co.com.sofka.domain.generic.Command;

public class CrearTransporte extends Command {

    private final IdTransporte idTransporte;
    private final IdProduccionDia idProduccionDia;

    public CrearTransporte(IdTransporte idTransporte, IdProduccionDia idProduccionDia){
        this.idTransporte = idTransporte;
        this.idProduccionDia = idProduccionDia;
    }

    public IdTransporte getIdTransporte() {
        return idTransporte;
    }

    public IdProduccionDia getIdProduccionDia() {
        return idProduccionDia;
    }
}
