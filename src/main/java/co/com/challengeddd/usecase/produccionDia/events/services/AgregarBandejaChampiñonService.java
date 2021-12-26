package co.com.challengeddd.usecase.produccionDia.events.services;

import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.challengeddd.domain.producciondia.values.TipoChampiñon;

public interface AgregarBandejaChampiñonService {
    boolean agregar(IdBandejaChampiñon id, TipoBandeja tipoBandeja, TipoChampiñon tipoChampiñon, TamañoChampiñon tamañoChampiñon, String respuesta);
}
