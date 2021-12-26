package co.com.challengeddd.usecase.producciondia;

import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.producciondia.commands.ModificarJefe;
import co.com.challengeddd.domain.producciondia.events.CreadaProduccionDia;
import co.com.challengeddd.domain.producciondia.events.ModificadoJefe;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.domain.producciondia.values.TipoEmpaqueBandeja;
import co.com.challengeddd.usecase.produccionDia.ModificarJefeUseCase;
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

class ModificarJefeUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    void modificarJefe(){

        IdProduccionDia idProduccionDia = IdProduccionDia.of("produccion");
        IdJefe idJefe = IdJefe.of("jefe");

        ModificarJefe command = new ModificarJefe(idProduccionDia, idJefe);
        ModificarJefeUseCase useCase = new ModificarJefeUseCase();

        when(repository.getEventsBy("produccion")).thenReturn(event());
        useCase.addRepository(repository);

        ResponseEvents events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idProduccionDia.value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        ModificadoJefe event = (ModificadoJefe) events.getDomainEvents().get(0);

        Assertions.assertEquals("jefe", event.getIdJefe().value());
        Mockito.verify(repository).getEventsBy("produccion");

    }

    private List<DomainEvent> event() {
        return List.of(new CreadaProduccionDia(
                IdJefe.of("jefe"),
                new TipoEmpaqueBandeja("Bolsa")
        ));
    }
}