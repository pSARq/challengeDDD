package co.com.challengeddd.domain.producciondia.events;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.sofka.domain.generic.DomainEvent;

public class AsignadoNombreCompradorBandejaChampiñon extends DomainEvent {

    private final IdBandejaChampiñon idBandejaChampiñon;
    private final Nombre nombreComprador;

    public AsignadoNombreCompradorBandejaChampiñon(IdBandejaChampiñon idBandejaChampiñon, Nombre nombreComprador) {
        super("challengeddd.domain.producciondia.asigandonombrecompradorbandejachampiñones");
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
