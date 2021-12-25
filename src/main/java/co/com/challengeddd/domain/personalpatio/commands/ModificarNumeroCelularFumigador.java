package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.general.values.NumeroCelular;
import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.sofka.domain.generic.Command;

public class ModificarNumeroCelularFumigador extends Command {

    private final IdFumigador idFumigador;
    private final NumeroCelular numeroCelular;

    public ModificarNumeroCelularFumigador(IdFumigador idFumigador, NumeroCelular numeroCelular){
        this.idFumigador = idFumigador;
        this.numeroCelular = numeroCelular;
    }

    public IdFumigador getIdFumigador() {
        return idFumigador;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
