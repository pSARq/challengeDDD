package co.com.challengeddd.domain.producciondia.events;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoNombreCompradorBandejaChampiñon extends DomainEvent {

    private final IdBandejaChampiñon idBandejaChampiñon;
    private final Nombre nombreComprador;

    public ModificadoNombreCompradorBandejaChampiñon(IdBandejaChampiñon idBandejaChampiñon, Nombre nombreComprador) {
        super("challengeddd.domain.producciondia.modificadonombrecompradorbandejachampiñon");
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
