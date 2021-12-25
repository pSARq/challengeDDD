package co.com.challengeddd.domain.producciondia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoChampiñon implements ValueObject<String> {

    private final String valor;

    public TipoChampiñon(String valor){
        this.valor = Objects.requireNonNull(validarValor(valor), "El tipo de champiñon no puede ser nulo");
    }

    private String validarValor(String valor){
        if (valor.equals("Tajado") || valor.equals("Entero")){
            return valor;
        }
        throw new IllegalArgumentException("El tipo de champiñon no es valido");
    }

    @Override
    public String value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoChampiñon that = (TipoChampiñon) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
