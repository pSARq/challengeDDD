package co.com.challengeddd.domain.transporte.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Arrays;
import java.util.Objects;

public class CapacidadCarga implements ValueObject<String> {

    private final String valor;

    public CapacidadCarga(String valor){
        this.valor = Objects.requireNonNull(validarValor(valor), "La capacidad de carga no puede ser nula");
    }

    private String validarValor(String valor){
        if (isValorValido(valor)){
            return valor;
        }
        throw new IllegalArgumentException("La capacidad de carga no es valida");
    }

    private boolean isValorValido(String valor){
        String[] listaCapacidadesDeCargas = new String[]{"10 Canastas", "18 Bolsas", "30 Canastas", "45 Bolsas", "3 Bolsas", "3 Canastas"};
        return Arrays.stream(listaCapacidadesDeCargas).anyMatch(capacidad -> capacidad.equals(valor));
    }

    @Override
    public String value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CapacidadCarga that = (CapacidadCarga) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
