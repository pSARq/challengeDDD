package co.com.challengeddd.domain.general.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroCelular implements ValueObject<String> {

    private final String valor;

    public NumeroCelular(String valor){
        this.valor = Objects.requireNonNull(validarNumero(valor), "El numero no puede set nulo");
    }

    private String validarNumero(String valor){
        if (valor.length() != 10){
            throw new IllegalArgumentException("El numero celular es invalido");
        }
        return valor;
    }

    @Override
    public String value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroCelular that = (NumeroCelular) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
