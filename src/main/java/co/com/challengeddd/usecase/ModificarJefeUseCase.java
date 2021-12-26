package co.com.challengeddd.usecase;

import co.com.challengeddd.domain.producciondia.ProduccionDia;
import co.com.challengeddd.domain.producciondia.commands.ModificarJefe;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ModificarJefeUseCase extends UseCase<RequestCommand<ModificarJefe>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarJefe> requestCommand) {
        ModificarJefe command = requestCommand.getCommand();
        ProduccionDia produccionDia = ProduccionDia.from(command.getIdProduccionDia(), retrieveEvents());
        produccionDia.modificarJefe(command.getIdJefe());
        emit().onResponse(new ResponseEvents(produccionDia.getUncommittedChanges()));
    }
}
