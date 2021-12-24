package co.com.challengeddd.domain.jefearea.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Planilla implements ValueObject<String> {

    private final String valor;

    public Planilla(String valor){
        this.valor = Objects.requireNonNull(validarValor(valor), "La planilla no puede ser nula");
    }

    private String validarValor(String valor){
        if (valor.length() < 26){
            throw new IllegalArgumentException("La planilla debe contener al menos 25 caracteres");
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
        Planilla planilla = (Planilla) o;
        return Objects.equals(valor, planilla.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
