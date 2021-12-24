package co.com.challengeddd.domain.jefe.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoEmbaladora implements ValueObject<String> {

    private final String valor;

    public TipoEmbaladora(String valor){
        this.valor = Objects.requireNonNull(validarValor(valor), "El tipo de embaladora no puede estar nulo");
    }

    private String validarValor(String valor){
        if (isEmbaladoraCorrecta(valor)){
            return valor;
        }
        throw new IllegalArgumentException("El valor de la embaladora no es valido");
    }

    private boolean isEmbaladoraCorrecta(String valor) {
        return valor.equals("Pequeña") || valor.equals("Grande");
    }

    @Override
    public String value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoEmbaladora that = (TipoEmbaladora) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
