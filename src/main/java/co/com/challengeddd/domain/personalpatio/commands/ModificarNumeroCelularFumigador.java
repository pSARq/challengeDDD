package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.sofka.domain.generic.Command;

public class ModificarNumeroCelularFumigador extends Command {

    private IdPersonalPatio idPersonalPatio;
    private final IdFumigador idFumigador;
    private final NumeroCelular numeroCelular;

    public ModificarNumeroCelularFumigador(IdPersonalPatio idPersonalPatio, IdFumigador idFumigador, NumeroCelular numeroCelular){
        this.idPersonalPatio = idPersonalPatio;
        this.idFumigador = idFumigador;
        this.numeroCelular = numeroCelular;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }

    public IdFumigador getIdFumigador() {
        return idFumigador;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
