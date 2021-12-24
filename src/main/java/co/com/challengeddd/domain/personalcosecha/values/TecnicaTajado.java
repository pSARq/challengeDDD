package co.com.challengeddd.domain.personalcosecha.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TecnicaTajado implements ValueObject<String> {

    private final String valor;

    public TecnicaTajado(String valor){
        this.valor = Objects.requireNonNull(validarValor(valor), "La tecnica de tajado no puede ser nula");
    }

    private String validarValor(String valor){
        if (valor.equals("Industrial") || valor.equals("Artesanal")){
            return valor;
        }
        throw new IllegalArgumentException("La tecnica de tajado no es valida");
    }

    @Override
    public String value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TecnicaTajado that = (TecnicaTajado) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
