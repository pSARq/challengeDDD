package co.com.challengeddd.usecase.producciondia.commands;

import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.producciondia.commands.ModificarTamañoChampiñonBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.events.AgregadaBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.events.CreadaProduccionDia;
import co.com.challengeddd.domain.producciondia.events.ModificadoTamañoChampiñonBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.domain.producciondia.values.TipoChampiñon;
import co.com.challengeddd.domain.producciondia.values.TipoEmpaqueBandeja;
import co.com.challengeddd.usecase.produccionDia.commands.ModificarTamañoChampiñonBandejaChampiñonUseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ModificarTamañoChampiñonBandejaChampiñonUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    void modificarTamañoChampiñonBandejaChampiñon(){
        IdProduccionDia idProduccionDia = IdProduccionDia.of("produccion");
        IdBandejaChampiñon idBandejaChampiñon = IdBandejaChampiñon.of("bandeja");
        TamañoChampiñon tamañoChampiñon = new TamañoChampiñon("Mediano");
        ModificarTamañoChampiñonBandejaChampiñon command = new ModificarTamañoChampiñonBandejaChampiñon(idProduccionDia, idBandejaChampiñon, tamañoChampiñon);
        ModificarTamañoChampiñonBandejaChampiñonUseCase useCase = new ModificarTamañoChampiñonBandejaChampiñonUseCase();

        when(repository.getEventsBy("produccion")).thenReturn(events());
        useCase.addRepository(repository);

        ResponseEvents events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idProduccionDia.value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();
        ModificadoTamañoChampiñonBandejaChampiñon event = (ModificadoTamañoChampiñonBandejaChampiñon) events.getDomainEvents().get(0);

        Assertions.assertEquals("bandeja", event.getIdBandejaChampiñon().value());
        Assertions.assertEquals("Mediano", event.getTamañoChampiñon().value());
        Mockito.verify(repository).getEventsBy("produccion");
    }

    private List<DomainEvent> events() {
        return List.of(new CreadaProduccionDia(
                IdJefe.of("jefe"),
                new TipoEmpaqueBandeja("Bolsa")
        ), new AgregadaBandejaChampiñon(
                IdBandejaChampiñon.of("bandeja"),
                new TipoBandeja("150"),
                new TipoChampiñon("Entero"),
                new TamañoChampiñon("Grande")
        ));
    }
}