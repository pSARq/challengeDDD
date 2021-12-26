package co.com.challengeddd.usecase.produccionDia;

import co.com.challengeddd.domain.producciondia.ProduccionDia;
import co.com.challengeddd.domain.producciondia.commands.ModificarNombreCompradorBandejaChampiñon;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ModificarNombreCompradorBandejaChampiñonUseCase extends UseCase<RequestCommand<ModificarNombreCompradorBandejaChampiñon>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarNombreCompradorBandejaChampiñon> requestCommand) {
        ModificarNombreCompradorBandejaChampiñon command = requestCommand.getCommand();
        ProduccionDia produccionDia = ProduccionDia.from(command.getIdProduccionDia(), retrieveEvents());
        produccionDia.modificarNombreCompradorBandeja(command.getIdBandejaChampiñon(), command.getNombreComprador());
        emit().onResponse(new ResponseEvents(produccionDia.getUncommittedChanges()));
    }
}
