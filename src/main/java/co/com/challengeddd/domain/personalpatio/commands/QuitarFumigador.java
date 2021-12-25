package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.sofka.domain.generic.Command;

public class QuitarFumigador extends Command {

    private final IdFumigador idFumigador;

    public QuitarFumigador(IdFumigador idFumigador){
        this.idFumigador = idFumigador;
    }

    public IdFumigador getIdFumigador() {
        return idFumigador;
    }
}
