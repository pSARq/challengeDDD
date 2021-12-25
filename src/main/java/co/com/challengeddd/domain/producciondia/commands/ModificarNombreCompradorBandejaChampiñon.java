package co.com.challengeddd.domain.producciondia.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreCompradorBandejaChampiñon extends Command {

    private IdProduccionDia idProduccionDia;
    private final IdBandejaChampiñon idBandejaChampiñon;
    private final Nombre nombreComprador;

    public ModificarNombreCompradorBandejaChampiñon(IdProduccionDia idProduccionDia, IdBandejaChampiñon idBandejaChampiñon, Nombre nombreComprador){
        this.idProduccionDia = idProduccionDia;
        this.idBandejaChampiñon = idBandejaChampiñon;
        this.nombreComprador = nombreComprador;
    }

    public IdProduccionDia getIdProduccionDia() {
        return idProduccionDia;
    }

    public IdBandejaChampiñon getIdBandejaChampiñon() {
        return idBandejaChampiñon;
    }

    public Nombre getNombreComprador() {
        return nombreComprador;
    }
}
