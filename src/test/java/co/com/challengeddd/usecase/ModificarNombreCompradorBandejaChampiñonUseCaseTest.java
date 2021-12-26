package co.com.challengeddd.usecase;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.producciondia.commands.ModificarNombreCompradorBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.events.AgregadaBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.events.CreadaProduccionDia;
import co.com.challengeddd.domain.producciondia.events.ModificadoNombreCompradorBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.domain.producciondia.values.TipoChampiñon;
import co.com.challengeddd.domain.producciondia.values.TipoEmpaqueBandeja;
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
class ModificarNombreCompradorBandejaChampiñonUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    void modificarNombreCompradorBandejaChampiñon(){
        IdProduccionDia idProduccionDia = IdProduccionDia.of("produccion");
        IdBandejaChampiñon idBandejaChampiñon = IdBandejaChampiñon.of("bandeja");
        Nombre nombreComprador = new Nombre("Lucas");

        ModificarNombreCompradorBandejaChampiñon command = new ModificarNombreCompradorBandejaChampiñon(idProduccionDia, idBandejaChampiñon, nombreComprador);
        ModificarNombreCompradorBandejaChampiñonUseCase useCase = new ModificarNombreCompradorBandejaChampiñonUseCase();

        when(repository.getEventsBy("produccion")).thenReturn(events());
        useCase.addRepository(repository);

        ResponseEvents events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idProduccionDia.value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        ModificadoNombreCompradorBandejaChampiñon event = (ModificadoNombreCompradorBandejaChampiñon) events.getDomainEvents().get(0);

        Assertions.assertEquals("bandeja", event.getIdBandejaChampiñon().value());
        Assertions.assertEquals("Lucas", event.getNombreComprador().value());
        Mockito.verify(repository).getEventsBy("produccion");
    }

    private List<DomainEvent> events() {
        return List.of(new CreadaProduccionDia(
                new TipoEmpaqueBandeja("Canasta")
        ), new AgregadaBandejaChampiñon(
                IdBandejaChampiñon.of("bandeja"),
                new TipoBandeja("500"),
                new TipoChampiñon("Entero"),
                new TamañoChampiñon("Mediano")
        ));
    }
}