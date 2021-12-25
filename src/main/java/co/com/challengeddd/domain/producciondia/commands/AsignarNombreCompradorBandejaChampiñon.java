package co.com.challengeddd.domain.producciondia.commands;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.sofka.domain.generic.Command;

public class AsignarNombreCompradorBandejaChampiñon extends Command {

    private final IdBandejaChampiñon idBandejaChampiñon;
    private final Nombre nombreComprador;

    public AsignarNombreCompradorBandejaChampiñon(IdBandejaChampiñon idBandejaChampiñon, Nombre nombreComprador){
        this.idBandejaChampiñon = idBandejaChampiñon;
        this.nombreComprador = nombreComprador;
    }

    public IdBandejaChampiñon getIdBandejaChampiñon() {
        return idBandejaChampiñon;
    }

    public Nombre getNombreComprador() {
        return nombreComprador;
    }
}
