package co.com.challengeddd.usecase.produccionDia;

import co.com.challengeddd.domain.producciondia.ProduccionDia;
import co.com.challengeddd.domain.producciondia.commands.ModificarTipoChampiñonBandejaChampiñon;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ModificarTipoChampiñonBandejaChampiñonUseCase extends UseCase<RequestCommand<ModificarTipoChampiñonBandejaChampiñon>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<ModificarTipoChampiñonBandejaChampiñon> requestCommand) {
        ModificarTipoChampiñonBandejaChampiñon command = requestCommand.getCommand();
        ProduccionDia produccionDia = ProduccionDia.from(command.getIdProduccionDia(), retrieveEvents());
        produccionDia.modificarTipoChampiñonBandejaChampiñon(command.getIdBandejaChampiñon(), command.getTipoChampiñon());
        emit().onResponse(new ResponseEvents(produccionDia.getUncommittedChanges()));
    }
}
