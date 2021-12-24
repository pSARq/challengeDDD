package co.com.challengeddd.domain.jefearea.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class InformeMateriaPrima implements ValueObject<String> {

    private final String valor;

    public InformeMateriaPrima(String valor){
        this.valor = Objects.requireNonNull(validarValor(valor), "El informe de materia prima no puede ser nulo");
    }

    private String validarValor(String valor){
        if (valor.isBlank()){
            throw new IllegalArgumentException("El informe de materia prima no puede estar vacio");
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
        InformeMateriaPrima that = (InformeMateriaPrima) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
