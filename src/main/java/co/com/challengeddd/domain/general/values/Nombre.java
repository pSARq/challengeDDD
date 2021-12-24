package co.com.challengeddd.domain.general.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {

    private final String valor;

    public Nombre(String valor){
        this.valor = Objects.requireNonNull(valor, "El nombre no puede ser nulo");
    }

    private String validarValor(String valor){
        if (valor.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
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
        Nombre nombre = (Nombre) o;
        return Objects.equals(valor, nombre.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
