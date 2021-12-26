package co.com.challengeddd.usecase.produccionDia.commands;

import co.com.challengeddd.domain.producciondia.ProduccionDia;
import co.com.challengeddd.domain.producciondia.commands.ModificarTipoBandejaBandejaChampiñon;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ModificarTipoBandejaBandejaChampiñonUseCase extends UseCase<RequestCommand<ModificarTipoBandejaBandejaChampiñon>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ModificarTipoBandejaBandejaChampiñon> requestCommand) {
        ModificarTipoBandejaBandejaChampiñon command = requestCommand.getCommand();
        ProduccionDia produccionDia = ProduccionDia.from(command.getIdProduccionDia(), retrieveEvents());
        produccionDia.modificarTipoBandejaBandejaChampiñon(command.getIdBandejaChampiñon(), command.getTipoBandeja());
        emit().onResponse(new ResponseEvents(produccionDia.getUncommittedChanges()));
    }
}
