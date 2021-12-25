package co.com.challengeddd.usecase;

import co.com.challengeddd.domain.producciondia.commands.CrearProduccionDia;
import co.com.challengeddd.domain.producciondia.events.CreadaProduccionDia;
import co.com.challengeddd.domain.producciondia.values.IdProduccionDia;
import co.com.challengeddd.domain.producciondia.values.TipoEmpaqueBandeja;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CrearProduccionDiaCaseUseTest {

    @Test
    public void crearProduccionDia(){

        //Arrange

        //Inicializa valores de atributos para la clase
        IdProduccionDia idProduccionDia = IdProduccionDia.of("Hoy");
        TipoEmpaqueBandeja tipoEmpaque = new TipoEmpaqueBandeja("Bolsa");

        //Inicializa el comando
        CrearProduccionDia command = new CrearProduccionDia(idProduccionDia, tipoEmpaque);
        //Inicializa el caso de uso
        CrearProduccionDiaCaseUse useCase = new CrearProduccionDiaCaseUse();

        //Act

        //Recibe los eventos
        ResponseEvents events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow();

        //Asssert

        //Recibe el evento especifico de creadaProduccionDia
        CreadaProduccionDia event = (CreadaProduccionDia) events.getDomainEvents().get(0);

        //Compara que los valores para asegurarse que sean verdaderos
        Assertions.assertEquals("Hoy", event.aggregateRootId());
        Assertions.assertEquals("Bolsa", event.getTipoEmpaqueBandeja().value());
    }

}