package co.com.challengeddd.domain.personalpatio.commands;

import co.com.challengeddd.domain.personalpatio.values.AreaAFumigar;
import co.com.challengeddd.domain.personalpatio.values.IdFumigador;
import co.com.challengeddd.domain.personalpatio.values.IdPersonalPatio;
import co.com.sofka.domain.generic.Command;

public class ModificarAreaAFumigarFumigador extends Command {

    private IdPersonalPatio idPersonalPatio;
    private final IdFumigador idFumigador;
    private final AreaAFumigar areaAFumigar;

    public ModificarAreaAFumigarFumigador(IdPersonalPatio idPersonalPatio, IdFumigador idFumigador, AreaAFumigar areaAFumigar){
        this.idPersonalPatio = idPersonalPatio;
        this.idFumigador = idFumigador;
        this.areaAFumigar = areaAFumigar;
    }

    public IdPersonalPatio getIdPersonalPatio() {
        return idPersonalPatio;
    }

    public IdFumigador getIdFumigador() {
        return idFumigador;
    }

    public AreaAFumigar getAreaAFumigar() {
        return areaAFumigar;
    }
}
