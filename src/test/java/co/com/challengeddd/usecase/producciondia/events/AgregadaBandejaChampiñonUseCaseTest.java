package co.com.challengeddd.usecase.producciondia.events;

import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.producciondia.events.AgregadaBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.TipoChampiñon;
import co.com.challengeddd.usecase.produccionDia.events.AgregadaBandejaChampiñonUseCase;
import co.com.challengeddd.usecase.produccionDia.events.services.AgregarBandejaChampiñonService;
import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AgregadaBandejaChampiñonUseCaseTest {

    @Mock
    AgregarBandejaChampiñonService agregarBandejaChampiñonService;

    @Test
    void agregadaBandejaChampiñon(){
        IdBandejaChampiñon idBandejaChampiñon = IdBandejaChampiñon.of("bandeja1");
        TipoBandeja tipoBandeja = new TipoBandeja("250");
        TipoChampiñon tipoChampiñon = new TipoChampiñon("Entero");
        TamañoChampiñon tamañoChampiñon = new TamañoChampiñon("Grande");
        AgregadaBandejaChampiñon event = new AgregadaBandejaChampiñon(idBandejaChampiñon, tipoBandeja, tipoChampiñon, tamañoChampiñon);
        AgregadaBandejaChampiñonUseCase useCase = new AgregadaBandejaChampiñonUseCase();

        when(agregarBandejaChampiñonService.agregar(
            IdBandejaChampiñon.of("bandeja1"),
                new TipoBandeja("250"),
                new TipoChampiñon("Entero"),
                new TamañoChampiñon("Grande"),
                "Se agregó la bandeja correctamente con la identificación: "+ event.getId()

        )).thenReturn(true);

        ServiceBuilder builder = new ServiceBuilder();
        builder.addService(agregarBandejaChampiñonService);
        useCase.addServiceBuilder(builder);

        UseCaseHandler.getInstance()
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow();

        verify(agregarBandejaChampiñonService).agregar(
                event.getId(),
                event.getTipoBandeja(),
                event.getTipoChampiñon(),
                event.getTamañoChampiñon(),
                "Se agregó la bandeja correctamente con la identificación: "+ event.getId());
    }
}