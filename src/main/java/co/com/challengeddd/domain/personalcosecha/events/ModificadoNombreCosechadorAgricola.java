package co.com.challengeddd.domain.personalcosecha.events;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.personalcosecha.values.IdCosechadorAgricola;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoNombreCosechadorAgricola extends DomainEvent {

    private final IdCosechadorAgricola idCosechadorAgricola;
    private final Nombre nombre;

    public ModificadoNombreCosechadorAgricola(IdCosechadorAgricola idCosechadorAgricola, Nombre nombre) {
        super("challengeddd.domain.personalcosecha.modificadonombrecosechadoragricola");
        this.idCosechadorAgricola = idCosechadorAgricola;
        this.nombre = nombre;
    }

    public IdCosechadorAgricola getIdCosechadorAgricola() {
        return idCosechadorAgricola;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
