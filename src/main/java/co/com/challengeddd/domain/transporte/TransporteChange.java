package co.com.challengeddd.domain.transporte;

import co.com.challengeddd.domain.transporte.events.*;
import co.com.sofka.domain.generic.EventChange;

public class TransporteChange extends EventChange {

    public TransporteChange(Transporte transporte) {

        apply((CreadoTransporte event) ->{
            transporte.idProduccionDia = event.getIdProduccionDia();
        });

        apply((AsignadoConductor event) ->{
            transporte.conductor = new Conductor(
                    event.getId(),
                    event.getNombre(),
                    event.getNumeroCelular(),
                    event.getLicencia()
            );
        });

        apply((AsignadoVehiculo event) ->{
            transporte.vehiculo = new Vehiculo(
                    event.getId(),
                    event.getEstado(),
                    event.getCapacidadCarga()
            );
        });

        apply((ModificadoConductor event) ->{
            transporte.conductor = event.getConductor();
        });

        apply((ModificadoVehiculo event) ->{
            transporte.vehiculo = event.getVehiculo();
        });

        apply((ModificadaProduccionDia event) ->{
            transporte.idProduccionDia = event.getIdProduccionDia();
        });

        apply((ModificadoNombreConductor event) ->{
            transporte.conductor.modificarNombre(event.getNombre());
        });

        apply((ModificadoNumeroCelularConductor event) ->{
            transporte.conductor.modificarNumeroCelular(event.getNumeroCelular());
        });

        apply((ModificadaLicenciaConductor event) ->{
            transporte.conductor.modificarLicencia(event.getLicencia());
        });

        apply((ModificadoEstadoVehiculo event) ->{
            transporte.vehiculo.modificarEstado(event.getEstado());
        });

        apply((ModificadaCapacidadCargaVehiculo event) ->{
            transporte.vehiculo.modificarCapacidadCarga(event.getCapacidadCarga());
        });
    }
}
