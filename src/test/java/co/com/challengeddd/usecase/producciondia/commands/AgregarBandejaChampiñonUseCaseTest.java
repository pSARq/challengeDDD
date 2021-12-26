package co.com.challengeddd.usecase.producciondia.commands;


import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.producciondia.commands.AgregarBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.events.AgregadaBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.events.CreadaProduccionDia;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.domain.producciondia.values.TipoChampiñon;
import co.com.challengeddd.domain.producciondia.values.TipoEmpaqueBandeja;
import co.com.challengeddd.usecase.produccionDia.commands.AgregarBandejaChampiñonUseCase;
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

//Necesario para probar el repositorio de eventos de un metodo de un agregado root
@ExtendWith(MockitoExtension.class)
class AgregarBandejaChampiñonUseCaseTest {

    //Repositorio mockeado
    @Mock
    DomainEventRepository repository;

    @Test
    void agregarBandejaChampiñon(){
        IdProduccionDia idProduccionDia = IdProduccionDia.of("Hoy");
        TipoBandeja tipoBandeja = new TipoBandeja("250");
        TipoChampiñon tipoChampiñon = new TipoChampiñon("Entero");
        TamañoChampiñon tamañoChampiñon = new TamañoChampiñon("Boton");

        AgregarBandejaChampiñon command = new AgregarBandejaChampiñon(idProduccionDia, tipoBandeja, tipoChampiñon, tamañoChampiñon);
        AgregarBandejaChampiñonUseCase useCase = new AgregarBandejaChampiñonUseCase();

        //Cuando se llama el repositorio con "Hoy" debe retornar events()
        when(repository.getEventsBy("Hoy")).thenReturn(events());

        //Se le inyecta el repositorio al caso de uso == El caso de uso va a usar ese repositorio
        useCase.addRepository(repository);

        ResponseEvents events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idProduccionDia.value())//Se le agrega un identificador de ejecución oara saber con cual se va a ejecutar
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        AgregadaBandejaChampiñon event = (AgregadaBandejaChampiñon) events.getDomainEvents().get(0);

        Assertions.assertEquals( "250", event.getTipoBandeja().value());
        Assertions.assertEquals("Entero", event.getTipoChampiñon().value());
        Assertions.assertEquals("Boton", event.getTamañoChampiñon().value());

        //Verifica que se haya llamado el repositorio con ese parametro
        Mockito.verify(repository).getEventsBy("Hoy");

    }

    //Son los eventos que pasaron para poder crear un ProduccionDia
    private List<DomainEvent> events() {
        return List.of(new CreadaProduccionDia(
                IdJefe.of("jefe"),
                new TipoEmpaqueBandeja("Canasta")
        ));
    }


}