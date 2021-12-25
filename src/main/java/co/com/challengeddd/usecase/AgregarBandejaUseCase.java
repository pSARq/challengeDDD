package co.com.challengeddd.usecase;

import co.com.challengeddd.domain.producciondia.ProduccionDia;
import co.com.challengeddd.domain.producciondia.commands.AgregarBandejaChampiñon;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AgregarBandejaUseCase extends UseCase<RequestCommand<AgregarBandejaChampiñon>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AgregarBandejaChampiñon> agregarBandejaChampiñonRequestCommand) {
        AgregarBandejaChampiñon command = agregarBandejaChampiñonRequestCommand.getCommand();
        ProduccionDia produccionDia = ProduccionDia.from(command.getIdProduccionDia(), retrieveEvents());

        produccionDia.agregarBandejaChampiñon(command.getTipoBandeja(), command.getTipoChampiñon(), command.getTamañoChampiñon());

        emit().onResponse(new ResponseEvents(produccionDia.getUncommittedChanges()));

    }
}
