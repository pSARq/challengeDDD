package co.com.challengeddd.domain.transporte;

import co.com.challengeddd.domain.transporte.values.CapacidadCarga;
import co.com.challengeddd.domain.transporte.values.Estado;
import co.com.challengeddd.domain.transporte.values.IdVehiculo;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Vehiculo extends Entity<IdVehiculo> {

    private Estado estado;
    private CapacidadCarga capacidadCarga;

    public Vehiculo(IdVehiculo idVehiculo, Estado estado, CapacidadCarga capacidadCarga){
        super(idVehiculo);
        this.estado = estado;
        this.capacidadCarga = capacidadCarga;
    }

    public void modificarEstado(Estado estado){
        this.estado = Objects.requireNonNull(estado);
    }

    public void modificarCapacidadCarga(CapacidadCarga capacidadCarga){
        this.capacidadCarga = Objects.requireNonNull(capacidadCarga);
    }

    public Estado estado() {
        return estado;
    }

    public CapacidadCarga capacidadCarga() {
        return capacidadCarga;
    }
}