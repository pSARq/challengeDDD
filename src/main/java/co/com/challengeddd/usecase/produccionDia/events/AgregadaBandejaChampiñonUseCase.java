package co.com.challengeddd.usecase.produccionDia.events;

import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.producciondia.ProduccionDia;
import co.com.challengeddd.domain.producciondia.events.AgregadaBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.usecase.produccionDia.events.services.AgregarBandejaChampiñonService;
import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;

import java.util.List;

public class AgregadaBandejaChampiñonUseCase extends UseCase<TriggeredEvent<AgregadaBandejaChampiñon>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<AgregadaBandejaChampiñon> triggeredEvent) {
        AgregadaBandejaChampiñon event = triggeredEvent.getDomainEvent();
        AgregarBandejaChampiñonService service = getService(AgregarBandejaChampiñonService.class).orElseThrow();

        boolean isValido = service.agregar(
                event.getId(),
                event.getTipoBandeja(),
                event.getTipoChampiñon(),
                event.getTamañoChampiñon(),
                "Se agregó la bandeja correctamente con la identificación: "+ event.getId()
        );
        if (!isValido){
            throw new BusinessException(event.aggregateRootId(), "No se pudo agregar");
        }

        emit().onResponse(new ResponseEvents(List.of()));
    }
}
