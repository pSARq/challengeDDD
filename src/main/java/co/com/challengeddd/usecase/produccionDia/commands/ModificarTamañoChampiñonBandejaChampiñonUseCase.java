package co.com.challengeddd.usecase.produccionDia.commands;

import co.com.challengeddd.domain.producciondia.ProduccionDia;
import co.com.challengeddd.domain.producciondia.commands.ModificarTamañoChampiñonBandejaChampiñon;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ModificarTamañoChampiñonBandejaChampiñonUseCase extends UseCase<RequestCommand<ModificarTamañoChampiñonBandejaChampiñon>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarTamañoChampiñonBandejaChampiñon> requestCommand) {
        ModificarTamañoChampiñonBandejaChampiñon command = requestCommand.getCommand();
        ProduccionDia produccionDia = ProduccionDia.from(command.getIdProduccionDia(), retrieveEvents());
        produccionDia.modificarTamañoChampiñonBandejaChampiñon(command.getIdBandejaChampiñon(), command.getTamañoChampiñon());
        emit().onResponse(new ResponseEvents(produccionDia.getUncommittedChanges()));
    }
}
