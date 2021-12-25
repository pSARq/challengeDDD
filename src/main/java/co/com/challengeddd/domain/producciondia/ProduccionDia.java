package co.com.challengeddd.domain.producciondia;

import co.com.challengeddd.domain.general.values.Nombre;
import co.com.challengeddd.domain.general.values.TamañoChampiñon;
import co.com.challengeddd.domain.general.values.TipoBandeja;
import co.com.challengeddd.domain.jefe.values.IdJefe;
import co.com.challengeddd.domain.producciondia.events.*;
import co.com.challengeddd.domain.producciondia.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class ProduccionDia extends AggregateEvent<IdProduccionDia> {

    protected IdJefe idJefe;
    protected TipoEmpaqueBandeja tipoEmpaqueBandeja;
    protected Set<BandejaChampiñon> bandejasChampiñon;

    public ProduccionDia(IdProduccionDia idProduccionDia, TipoEmpaqueBandeja tipoEmpaqueBandeja){
        super(idProduccionDia);
        appendChange(new CreadaProduccionDia(tipoEmpaqueBandeja)).apply();
    }

    private ProduccionDia(IdProduccionDia idProduccionDia){
        super(idProduccionDia);
        subscribe(new ProduccionDiaChange(this));
    }

    public static ProduccionDia from(IdProduccionDia idProduccionDia, List<DomainEvent> events){
        ProduccionDia produccionDia = new ProduccionDia(idProduccionDia);
        events.forEach(produccionDia::applyEvent);
        return produccionDia;
    }

    public void agregarBandejaChampiñon(TipoBandeja tipoBandeja, TipoChampiñon tipoChampiñon, TamañoChampiñon tamañoChampiñon){
        Objects.requireNonNull(tipoBandeja);
        Objects.requireNonNull(tipoChampiñon);
        Objects.requireNonNull(tamañoChampiñon);
        IdBandejaChampiñon id = new IdBandejaChampiñon();
        appendChange(new AgregadaBandejaChampiñon(id, tipoBandeja, tipoChampiñon, tamañoChampiñon)).apply();
    }

    public void modificarJefe(IdJefe idJefe){
        Objects.requireNonNull(idJefe);
        appendChange(new ModificadoJefe(idJefe)).apply();
    }

    public void modificarTipoEmpaqueBandeja(TipoEmpaqueBandeja tipoEmpaqueBandeja){
        Objects.requireNonNull(tipoEmpaqueBandeja);
        appendChange(new ModificadoTipoEmpaqueBandeja(tipoEmpaqueBandeja)).apply();
    }

    public void AsignarNombreCompradorBandejaChampiñon(IdBandejaChampiñon idBandejaChampiñon, Nombre nombreComprador){
        Objects.requireNonNull(idBandejaChampiñon);
        Objects.requireNonNull(nombreComprador);
        appendChange(new AsignadoNombreCompradorBandejaChampiñon(idBandejaChampiñon, nombreComprador)).apply();
    }

    public void modificarNombreCompradorBandeja(IdBandejaChampiñon idBandejaChampiñon, Nombre nombreComprador){
        Objects.requireNonNull(idBandejaChampiñon);
        Objects.requireNonNull(nombreComprador);
        appendChange(new ModificadoNombreCompradorBandejaChampiñon(idBandejaChampiñon, nombreComprador)).apply();
    }

    public void modificarTipoBandejaBandejaChampiñon(IdBandejaChampiñon idBandejaChampiñon, TipoBandeja tipoBandeja){
        Objects.requireNonNull(idBandejaChampiñon);
        Objects.requireNonNull(tipoBandeja);
        appendChange(new ModificadoTipoBandejaBandejaChampiñon(idBandejaChampiñon, tipoBandeja)).apply();
    }

    public void modificarTipoChampiñonBandejaChampiñon(IdBandejaChampiñon idBandejaChampiñon, TipoChampiñon tipoChampiñon){
        Objects.requireNonNull(idBandejaChampiñon);
        Objects.requireNonNull(tipoChampiñon);
        appendChange(new ModificadoTipoChampiñonBandejaChampiñon(idBandejaChampiñon, tipoChampiñon)).apply();
    }

    public void modificarTamañoChampiñonBandejaChampiñon(IdBandejaChampiñon idBandejaChampiñon, TamañoChampiñon tamañoChampiñon){
        Objects.requireNonNull(idBandejaChampiñon);
        Objects.requireNonNull(tamañoChampiñon);
        appendChange(new ModificadoTamañoChampiñonBandejaChampiñon(idBandejaChampiñon, tamañoChampiñon)).apply();
    }

    protected Optional<BandejaChampiñon> obtenerBandejaChampiñonPorId(IdBandejaChampiñon idBandejaChampiñon){
        return bandejasChampiñon().stream()
                .filter(bandejaChampiñon -> bandejaChampiñon.identity().equals(idBandejaChampiñon)).findFirst();
    }

    public IdJefe idJefe() {
        return idJefe;
    }

    public TipoEmpaqueBandeja tipoEmpaqueBandeja() {
        return tipoEmpaqueBandeja;
    }

    public Set<BandejaChampiñon> bandejasChampiñon() {
        return bandejasChampiñon;
    }
}
