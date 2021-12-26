package co.com.challengeddd.usecase.produccionDia;

import co.com.challengeddd.domain.producciondia.ProduccionDia;
import co.com.challengeddd.domain.producciondia.commands.AsignarNombreCompradorBandejaChampiñon;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AsignarNombreCompradorBandejaChampiñonUseCase extends UseCase<RequestCommand<AsignarNombreCompradorBandejaChampiñon>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsignarNombreCompradorBandejaChampiñon> requestCommand) {
        AsignarNombreCompradorBandejaChampiñon command = requestCommand.getCommand();
        ProduccionDia produccionDia = ProduccionDia.from(command.getIdProduccionDia(), retrieveEvents());
        produccionDia.AsignarNombreCompradorBandejaChampiñon(command.getIdBandejaChampiñon(), command.getNombreComprador());
        emit().onResponse(new ResponseEvents(produccionDia.getUncommittedChanges()));
    }
}
