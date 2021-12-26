package co.com.challengeddd.usecase.produccionDia;

import co.com.challengeddd.domain.producciondia.ProduccionDia;
import co.com.challengeddd.domain.producciondia.commands.CrearProduccionDia;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearProduccionDiaCaseUse extends UseCase<RequestCommand<CrearProduccionDia>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearProduccionDia> requestCommand) {
        //Se crea el comando
        CrearProduccionDia command = requestCommand.getCommand();
        //Se crea el elemento de produccionDia con el comando
        ProduccionDia produccionDia = new ProduccionDia(command.getIdProduccionDia(), command.getIdJefe(), command.getTipoEmpaqueBandeja());
        //Se emite el elemento
        emit().onResponse(new ResponseEvents(produccionDia.getUncommittedChanges()));
    }
}
