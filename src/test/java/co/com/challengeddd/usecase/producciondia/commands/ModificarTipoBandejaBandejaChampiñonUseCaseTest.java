package co.com.challengeddd.usecase.producciondia.commands;

import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.producciondia.commands.ModificarTipoBandejaBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.events.AgregadaBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.events.CreadaProduccionDia;
import co.com.challengeddd.domain.producciondia.events.ModificadoTipoBandejaBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.domain.producciondia.values.TipoChampiñon;
import co.com.challengeddd.domain.producciondia.values.TipoEmpaqueBandeja;
import co.com.challengeddd.usecase.produccionDia.commands.ModificarTipoBandejaBandejaChampiñonUseCase;
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
class ModificarTipoBandejaBandejaChampiñonUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    void modificarTipoBandejaBandejaChampiñon(){

        IdProduccionDia idProduccionDia = IdProduccionDia.of("produccion");
        IdBandejaChampiñon idBandejaChampiñon = IdBandejaChampiñon.of("bandeja");
        TipoBandeja tipoBandeja = new TipoBandeja("150");
        ModificarTipoBandejaBandejaChampiñon command = new ModificarTipoBandejaBandejaChampiñon(idProduccionDia, idBandejaChampiñon, tipoBandeja);
        ModificarTipoBandejaBandejaChampiñonUseCase useCase = new ModificarTipoBandejaBandejaChampiñonUseCase();

        when(repository.getEventsBy("produccion")).thenReturn(events());
        useCase.addRepository(repository);

        ResponseEvents events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idProduccionDia.value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();
        ModificadoTipoBandejaBandejaChampiñon event = (ModificadoTipoBandejaBandejaChampiñon) events.getDomainEvents().get(0);

        Assertions.assertEquals("bandeja", event.getIdBandejaChampiñon().value());
        Assertions.assertEquals("150", event.getTipoBandeja().value());
        Mockito.verify(repository).getEventsBy("produccion");
    }

    private List<DomainEvent> events() {
        return List.of(new CreadaProduccionDia(
                IdJefe.of("jefe"),
                new TipoEmpaqueBandeja("Canasta")
        ), new AgregadaBandejaChampiñon(
                IdBandejaChampiñon.of("bandeja"),
                new TipoBandeja("500"),
                new TipoChampiñon("Entero"),
                new TamañoChampiñon("Grande")));
    }
}