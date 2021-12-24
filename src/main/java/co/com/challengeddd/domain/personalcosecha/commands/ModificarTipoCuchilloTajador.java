package co.com.challengeddd.domain.personalcosecha.commands;

import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.challengeddd.domain.personalcosecha.values.TipoCuchillo;
import co.com.sofka.domain.generic.Command;

public class ModificarTipoCuchilloTajador extends Command {

    private final IdTajador idTajador;
    private final TipoCuchillo tipoCuchillo;

    public ModificarTipoCuchilloTajador(IdTajador idTajador, TipoCuchillo tipoCuchillo){
        this.idTajador = idTajador;
        this.tipoCuchillo = tipoCuchillo;
    }

    public IdTajador getIdTajador() {
        return idTajador;
    }

    public TipoCuchillo getTipoCuchillo() {
        return tipoCuchillo;
    }
}
