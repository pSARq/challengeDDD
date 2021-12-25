package co.com.challengeddd.usecase;

import co.com.challengeddd.domain.producciondia.ProduccionDia;
import co.com.challengeddd.domain.producciondia.commands.CrearProduccionDia;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearProduccionDiaCaseUse extends UseCase<RequestCommand<CrearProduccionDia>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearProduccionDia> requestCommand) {
        CrearProduccionDia command = requestCommand.getCommand();
        ProduccionDia produccionDia = new ProduccionDia(command.getIdProduccionDia(), command.getTipoEmpaqueBandeja());
        emit().onResponse(new ResponseEvents(produccionDia.getUncommittedChanges()));
    }
}
