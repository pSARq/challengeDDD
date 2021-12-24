package co.com.challengeddd.domain.jefe;

import co.com.challengeddd.domain.jefe.events.*;
import co.com.sofka.domain.generic.EventChange;

public class JefeChange extends EventChange {

    public JefeChange(Jefe jefe) {

        apply((CreadoJefe event) ->{
            jefe.area = event.getArea();
        });

        apply((AsignadoEmbalador event) ->{
            jefe.embalador = new Embalador(
                    event.getId(),
                    event.getNombre(),
                    event.getNumeroCelular(),
                    event.getTipoEmbaladora()
            );
        });

        apply((AsignadoSupervisor event) ->{
            jefe.supervisor = new Supervisor(
                    event.getId(),
                    event.getIdPersonalPatio(),
                    event.getIdPersonalCosecha(),
                    event.getNombre(),
                    event.getNumeroCelular()
            );
        });

        apply((ModificadoEmbalador event) ->{
            jefe.embalador = event.getEmbalador();
        });

        apply((ModificadoSupervisor event) ->{
            jefe.supervisor = event.getSupervisor();
        });

        apply((ModificadaArea event) ->{
            jefe.area = event.getArea();
        });

        apply((ModificadoNombreEmbalador event) -> {
            jefe.embalador.modificarNombre(event.getNombre());
        });

        apply((ModificadoNumeroCelularEmbalador event) -> {
            jefe.embalador.modificarNumeroCelular(event.getNumeroCelular());
        });

        apply((ModificadaTipoEmbaladoraEmbalador event) ->{
            jefe.embalador.modificarTipoEmbaladora(event.getTipoEmbaladora());
        });

        apply((ModificadoNombreSupervisor event) -> {
            jefe.supervisor.modificarNombre(event.getNombre());
        });

        apply((ModificadoNumeroCelularSupervisor event) ->{
            jefe.supervisor.modificarNumeroCelular(event.getNumeroCelular());
        });

        apply((ModificadoPersonalPatioSupervisor event) ->{
            jefe.supervisor.modificarPersonalPatio(event.getIdPersonalPatio());
        });

        apply((ModificadoPersonalCosechaSupervisor event) ->{
            jefe.supervisor.modificarPersonalCosecha(event.getIdPersonalCosecha());
        });

        apply((AgregadoInformeMateriaPrimaSupervisor event) ->{
            jefe.supervisor.AgregarInformeMateriaPrima(event.getInformeMateriaPrima());
        });

        apply((ModificadoInformeMateriaPrimaSupervisor event) ->{
            jefe.supervisor.modificarInformeMateriaPrima(event.getInformeMateriaPrima());
        });
    }
}
