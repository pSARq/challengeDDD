package co.com.challengeddd.usecase.produccionDia.events;

import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.producciondia.events.ModificadoJefe;
import co.com.challengeddd.usecase.produccionDia.events.services.ModificarJefeService;
import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;

import java.util.List;

public class ModificadoJefeUseCase extends UseCase<TriggeredEvent<ModificadoJefe>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<ModificadoJefe> triggeredEvent) {
        ModificadoJefe event = triggeredEvent.getDomainEvent();
        ModificarJefeService service = getService(ModificarJefeService.class).orElseThrow();

        boolean isValido = service.agregar(
                event.getIdJefe(),
                "El nuevo jefe es: "+event.getIdJefe()
        );
        if (!isValido){
            throw new BusinessException(event.aggregateRootId(), "No se pudo modificar el jefe");
        }

        emit().onResponse(new ResponseEvents(List.of()));
    }
}
