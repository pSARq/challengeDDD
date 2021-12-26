package co.com.challengeddd.usecase.producciondia.commands;

import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.producciondia.commands.ModificarTipoEmpaqueBandeja;
import co.com.challengeddd.domain.producciondia.events.CreadaProduccionDia;
import co.com.challengeddd.domain.producciondia.events.ModificadoTipoEmpaqueBandeja;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.domain.producciondia.values.TipoEmpaqueBandeja;
import co.com.challengeddd.usecase.produccionDia.commands.ModificarTipoEmpaqueBandejaUseCase;
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
class ModificarTipoEmpaqueBandejaUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    void modificarTipoEmpaqueBandeja(){

        IdProduccionDia idProduccionDia = IdProduccionDia.of("produccion");
        TipoEmpaqueBandeja tipoEmpaqueBandeja = new TipoEmpaqueBandeja("Bolsa");
        ModificarTipoEmpaqueBandeja command = new ModificarTipoEmpaqueBandeja(idProduccionDia, tipoEmpaqueBandeja);
        ModificarTipoEmpaqueBandejaUseCase useCase = new ModificarTipoEmpaqueBandejaUseCase();

        when(repository.getEventsBy("produccion")).thenReturn(events());
        useCase.addRepository(repository);

        ResponseEvents events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idProduccionDia.value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();
        ModificadoTipoEmpaqueBandeja event = (ModificadoTipoEmpaqueBandeja) events.getDomainEvents().get(0);

        Assertions.assertEquals("Bolsa", event.getTipoEmpaqueBandeja().value());
        Mockito.verify(repository).getEventsBy("produccion");
    }

    private List<DomainEvent> events() {
        return List.of(new CreadaProduccionDia(
                IdJefe.of("jefe"),
                new TipoEmpaqueBandeja("Canasta")
        ));
    }
}