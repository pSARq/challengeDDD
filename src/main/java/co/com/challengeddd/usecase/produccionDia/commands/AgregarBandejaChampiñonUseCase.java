package co.com.challengeddd.usecase.produccionDia.commands;

import co.com.challengeddd.domain.producciondia.ProduccionDia;
import co.com.challengeddd.domain.producciondia.commands.AgregarBandejaChampiñon;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AgregarBandejaChampiñonUseCase extends UseCase<RequestCommand<AgregarBandejaChampiñon>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarBandejaChampiñon> requestCommand) {
        AgregarBandejaChampiñon command = requestCommand.getCommand();

        ProduccionDia produccionDia = ProduccionDia.from(command.getIdProduccionDia(), retrieveEvents());

        produccionDia.agregarBandejaChampiñon(command.getTipoBandeja(), command.getTipoChampiñon(), command.getTamañoChampiñon());

        emit().onResponse(new ResponseEvents(produccionDia.getUncommittedChanges()));
    }
}
