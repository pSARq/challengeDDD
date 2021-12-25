package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.personalpatio.values.AreaAFumigar;
import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.sofka.domain.generic.Command;

public class ModificarAreaAFumigarFumigador extends Command {

    private final IdFumigador idFumigador;
    private final AreaAFumigar areaAFumigar;

    public ModificarAreaAFumigarFumigador(IdFumigador idFumigador, AreaAFumigar areaAFumigar){
        this.idFumigador = idFumigador;
        this.areaAFumigar = areaAFumigar;
    }

    public IdFumigador getIdFumigador() {
        return idFumigador;
    }

    public AreaAFumigar getAreaAFumigar() {
        return areaAFumigar;
    }
}
