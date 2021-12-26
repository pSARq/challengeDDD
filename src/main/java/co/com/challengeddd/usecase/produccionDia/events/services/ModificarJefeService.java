package co.com.challengeddd.usecase.produccionDia.events.services;

import co.com.challengeddd.domain.jefe.values.IdJefe;

public interface ModificarJefeService {

    boolean agregar(IdJefe idJefe, String respuesta);
}
