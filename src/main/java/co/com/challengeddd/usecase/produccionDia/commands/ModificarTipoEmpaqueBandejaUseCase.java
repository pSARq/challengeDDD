package co.com.challengeddd.usecase.produccionDia.commands;

import co.com.challengeddd.domain.producciondia.ProduccionDia;
import co.com.challengeddd.domain.producciondia.commands.ModificarTipoEmpaqueBandeja;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ModificarTipoEmpaqueBandejaUseCase extends UseCase<RequestCommand<ModificarTipoEmpaqueBandeja>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ModificarTipoEmpaqueBandeja> requestCommand) {
        ModificarTipoEmpaqueBandeja command = requestCommand.getCommand();
        ProduccionDia produccionDia = ProduccionDia.from(command.getIdProduccionDia(), retrieveEvents());
        produccionDia.modificarTipoEmpaqueBandeja(command.getTipoEmpaqueBandeja());
        emit().onResponse(new ResponseEvents(produccionDia.getUncommittedChanges()));
    }
}
