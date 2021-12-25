package co.com.challengeddd.domain.producciondia;

import co.com.challengeddd.domain.producciondia.events.*;
import co.com.challengeddd.domain.producciondia.values.IdBandejaChampiñon;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class ProduccionDiaChange extends EventChange {

    private BandejaChampiñon obtenerBandejaChampiñon(ProduccionDia produccionDia, IdBandejaChampiñon idBandejaChampiñon) {
        return produccionDia.obtenerBandejaChampiñonPorId(idBandejaChampiñon)
                .orElseThrow(() -> new IllegalArgumentException("No se encontró la bandeja"));
    }

    public ProduccionDiaChange(ProduccionDia produccionDia) {

        apply((CreadaProduccionDia event) ->{
            produccionDia.tipoEmpaqueBandeja = event.getTipoEmpaqueBandeja();
            produccionDia.bandejasChampiñon = new HashSet<>();
        });

        apply((AgregadaBandejaChampiñon event) ->{
            produccionDia.bandejasChampiñon.add(new BandejaChampiñon(
                    event.getId(),
                    event.getTipoBandeja(),
                    event.getTipoChampiñon(),
                    event.getTamañoChampiñon()
            ));
        });

        apply((ModificadoJefe event) ->{
            produccionDia.idJefe = event.getIdJefe();
        });

        apply((ModificadoTipoEmpaqueBandeja event) ->{
            produccionDia.tipoEmpaqueBandeja = event.getTipoEmpaqueBandeja();
        });

        apply((AsignadoNombreCompradorBandejaChampiñon event) ->{
            BandejaChampiñon bandejaChampiñon = obtenerBandejaChampiñon(produccionDia, event.getIdBandejaChampiñon());
            bandejaChampiñon.agregarNombreComprador(event.getNombreComprador());
        });

        apply((ModificadoNombreCompradorBandejaChampiñon event) ->{
            BandejaChampiñon bandejaChampiñon = obtenerBandejaChampiñon(produccionDia, event.getIdBandejaChampiñon());
            bandejaChampiñon.modificarNombreComprador(event.getNombreComprador());
        });

        apply((ModificadoTipoBandejaBandejaChampiñon event) ->{
            BandejaChampiñon bandejaChampiñon = obtenerBandejaChampiñon(produccionDia, event.getIdBandejaChampiñon());
            bandejaChampiñon.modificarTipoBandeja(event.getTipoBandeja());
        });

        apply((ModificadoTipoChampiñonBandejaChampiñon event) ->{
            BandejaChampiñon bandejaChampiñon = obtenerBandejaChampiñon(produccionDia, event.getIdBandejaChampiñon());
            bandejaChampiñon.modificarTipoChampiñon(event.getTipoChampiñon());
        });

        apply((ModificadoTamañoChampiñonBandejaChampiñon event) ->{
            BandejaChampiñon bandejaChampiñon = obtenerBandejaChampiñon(produccionDia, event.getIdBandejaChampiñon());
            bandejaChampiñon.modificarTamañoChampiñon(event.getTamañoChampiñon());
        });
    }

}
