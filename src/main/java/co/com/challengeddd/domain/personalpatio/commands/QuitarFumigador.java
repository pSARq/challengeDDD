package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.sofka.domain.generic.Command;

public class QuitarFumigador extends Command {

    private IdPersonalPatio idPersonalPatio;
    private final IdFumigador idFumigador;

    public QuitarFumigador(IdPersonalPatio idPersonalPatio, IdFumigador idFumigador){
        this.idPersonalPatio = idPersonalPatio;
        this.idFumigador = idFumigador;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }

    public IdFumigador getIdFumigador() {
        return idFumigador;
    }
}
