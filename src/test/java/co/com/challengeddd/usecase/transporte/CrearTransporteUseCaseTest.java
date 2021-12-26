package co.com.challengeddd.usecase.transporte;

import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.domain.transporte.commands.CrearTransporte;
import co.com.challengeddd.domain.transporte.events.CreadoTransporte;
import co.com.challengeddd.domain.transporte.values.IdTransporte;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CrearTransporteUseCaseTest {

    @Test
    void crearTransporte(){
        IdTransporte idTransporte = IdTransporte.of("transporte");
        IdProduccionDia idProduccionDia = IdProduccionDia.of("produccion");

        CrearTransporte command = new CrearTransporte(idTransporte, idProduccionDia);
        CrearTransporteUseCase useCase = new CrearTransporteUseCase();

        ResponseEvents events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();
        CreadoTransporte event = (CreadoTransporte) events.getDomainEvents().get(0);

        Assertions.assertEquals("transporte", event.aggregateRootId());
        Assertions.assertEquals("produccion", event.getIdProduccionDia().value());
    }
}