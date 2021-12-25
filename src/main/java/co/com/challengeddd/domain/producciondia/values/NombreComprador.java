package co.com.challengeddd.domain.producciondia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreComprador implements ValueObject<String> {

    private final String valor;

    public NombreComprador(String valor){
        this.valor = Objects.requireNonNull(valor, "El nombre del comprador no puede ser nulo");
    }

    private String validarValor(String valor){
        if (valor.isBlank()) {
            throw new IllegalArgumentException("El nombre del comprador no puede estar vacio");
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
        NombreComprador that = (NombreComprador) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
