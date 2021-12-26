package co.com.challengeddd.usecase.transporte;

import co.com.challengeddd.domain.transporte.Transporte;
import co.com.challengeddd.domain.transporte.commands.CrearTransporte;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearTransporteUseCase extends UseCase<RequestCommand<CrearTransporte>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearTransporte> requestCommand) {
        CrearTransporte command = requestCommand.getCommand();
        Transporte transporte = new Transporte(command.getIdTransporte(), command.getIdProduccionDia());
        emit().onResponse(new ResponseEvents(transporte.getUncommittedChanges()));

    }
}
