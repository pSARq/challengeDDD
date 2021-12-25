package co.com.challengeddd.domain.transporte.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Estado implements ValueObject<String> {

    private final String valor;

    public Estado(String valor){
        this.valor = Objects.requireNonNull(validarValor(valor), "El estado no puede ser nulo");
    }

    private String validarValor(String valor){
        if (isValorValido(valor)){
            return valor;
        }
        throw new IllegalArgumentException("El estado del vehículo no es valido");
    }

    private boolean isValorValido(String valor){
        String[] listaEstadoVehiculo = new String[]{"Bueno", "Regular", "Malo"};
        for (String estado: listaEstadoVehiculo) {
            if (estado.equals(valor)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado that = (Estado) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
