package co.com.challengeddd.domain.personalcosecha.events;

import co.com.challengeddd.domain.personalcosecha.values.IdTajador;
import co.com.challengeddd.domain.personalcosecha.values.TipoCuchillo;
import co.com.sofka.domain.generic.DomainEvent;

public class ModificadoTipoCuchilloTajador extends DomainEvent {

    private final IdTajador idTajador;
    private final TipoCuchillo tipoCuchillo;

    public ModificadoTipoCuchilloTajador(IdTajador idTajador, TipoCuchillo tipoCuchillo) {
        super("challengeddd.domain.personalcosecha.modificadotipocuchillotajador");
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
