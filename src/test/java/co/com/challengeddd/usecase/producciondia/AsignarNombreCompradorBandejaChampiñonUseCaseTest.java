package co.com.challengeddd.usecase.producciondia;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.producciondia.commands.AsignarNombreCompradorBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.events.AgregadaBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.events.AsignadoNombreCompradorBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.events.CreadaProduccionDia;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.domain.producciondia.values.TipoChampiñon;
import co.com.challengeddd.domain.producciondia.values.TipoEmpaqueBandeja;
import co.com.challengeddd.usecase.produccionDia.AsignarNombreCompradorBandejaChampiñonUseCase;
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
class AsignarNombreCompradorBandejaChampiñonUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    void AgregarNombreCompradorBandejaChampiñon(){
        IdProduccionDia idProduccionDia = IdProduccionDia.of("1");
        IdBandejaChampiñon idBandejaChampiñon = IdBandejaChampiñon.of("2");
        Nombre nombreComprador = new Nombre("Juan");
        AsignarNombreCompradorBandejaChampiñon command = new AsignarNombreCompradorBandejaChampiñon(idProduccionDia, idBandejaChampiñon, nombreComprador);
        AsignarNombreCompradorBandejaChampiñonUseCase useCase = new AsignarNombreCompradorBandejaChampiñonUseCase();

        when(repository.getEventsBy("1")).thenReturn(events());
        useCase.addRepository(repository);

        ResponseEvents events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idProduccionDia.value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        AsignadoNombreCompradorBandejaChampiñon event = (AsignadoNombreCompradorBandejaChampiñon) events.getDomainEvents().get(0);

        Assertions.assertEquals("2", event.getIdBandejaChampiñon().value());
        Assertions.assertEquals("Juan", event.getNombreComprador().value());
        Mockito.verify(repository).getEventsBy("1");
    }

    private List<DomainEvent> events() {
        return List.of(new CreadaProduccionDia(
                IdJefe.of("jefe"),
                new TipoEmpaqueBandeja("Bolsa")
        ), new AgregadaBandejaChampiñon(
                IdBandejaChampiñon.of("2"),
                new TipoBandeja("250"),
                new TipoChampiñon("Tajado"),
                new TamañoChampiñon("Grande")
        ));
    }

}