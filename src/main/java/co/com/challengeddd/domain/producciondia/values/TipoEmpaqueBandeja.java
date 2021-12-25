package co.com.challengeddd.domain.producciondia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoEmpaqueBandeja implements ValueObject<String> {

    private final String valor;

    public TipoEmpaqueBandeja(String valor){
        this.valor = Objects.requireNonNull(validarValor(valor), "El tipo de empaque no puede ser nulo");
    }

    private String validarValor(String valor){
        if (valor.equals("Canasta") || valor.equals("Bandeja")){
            return valor;
        }
        throw new IllegalArgumentException("El tipo de empaque no es valido");
    }

    @Override
    public String value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoEmpaqueBandeja that = (TipoEmpaqueBandeja) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}

