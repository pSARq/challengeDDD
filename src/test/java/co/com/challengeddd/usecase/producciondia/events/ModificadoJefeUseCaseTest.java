package co.com.challengeddd.usecase.producciondia.events;


import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.producciondia.events.AgregadaBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.events.ModificadoJefe;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.TipoChampiñon;
import co.com.challengeddd.usecase.produccionDia.events.AgregadaBandejaChampiñonUseCase;
import co.com.challengeddd.usecase.produccionDia.events.ModificadoJefeUseCase;
import co.com.challengeddd.usecase.produccionDia.events.services.AgregarBandejaChampiñonService;
import co.com.challengeddd.usecase.produccionDia.events.services.ModificarJefeService;
import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ModificadoJefeUseCaseTest {

    @Mock
    ModificarJefeService modificarJefeService;

    @Test
    void modificadoJefe(){
        IdJefe idJefe = IdJefe.of("jefe");
        ModificadoJefe event = new ModificadoJefe(idJefe);
        ModificadoJefeUseCase useCase = new ModificadoJefeUseCase();

        when(modificarJefeService.agregar(
                IdJefe.of("jefe"),
                "El nuevo jefe es: "+event.getIdJefe()

        )).thenReturn(true);

        ServiceBuilder builder = new ServiceBuilder();
        builder.addService(modificarJefeService);
        useCase.addServiceBuilder(builder);

        UseCaseHandler.getInstance()
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow();

        verify(modificarJefeService).agregar(
                event.getIdJefe(),
                "El nuevo jefe es: "+event.getIdJefe()
        );
    }

}