package co.com.challengeddd.domain.producciondia.commands;

import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.NombreComprador;
import co.com.sofka.domain.generic.Command;

public class AsignarNombreCompradorBandejaChampiñon extends Command {

    private final IdBandejaChampiñon idBandejaChampiñon;
    private final NombreComprador nombreComprador;

    public AsignarNombreCompradorBandejaChampiñon(IdBandejaChampiñon idBandejaChampiñon, NombreComprador nombreComprador){
        this.idBandejaChampiñon = idBandejaChampiñon;
        this.nombreComprador = nombreComprador;
    }

    public IdBandejaChampiñon getIdBandejaChampiñon() {
        return idBandejaChampiñon;
    }

    public NombreComprador getNombreComprador() {
        return nombreComprador;
    }
}
