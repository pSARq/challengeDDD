package co.com.challengeddd.domain.personalcosecha.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoCuchillo implements ValueObject<String> {

    private final String valor;

    public TipoCuchillo(String valor){
        this.valor = Objects.requireNonNull(validarValor(valor), "El tipo de cuchillo no puede ser nulo");
    }

    private String validarValor(String valor){
        if (valor.equals("Cuchillo con escoba") || valor.equals("Cuchillo sin escoba")){
            return valor;
        }
        throw new IllegalArgumentException("El tipo de cuchillo no es valido");
    }

    @Override
    public String value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoCuchillo that = (TipoCuchillo) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
