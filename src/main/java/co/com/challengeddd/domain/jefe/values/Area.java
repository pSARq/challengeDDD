package co.com.challengeddd.domain.jefe.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Area implements ValueObject<String> {

    private final String valor;

    public Area(String valor){
        this.valor = Objects.requireNonNull(validarValor(valor), "El area no puede ser nula");
    }

    private String validarValor(String valor){
        if (valor.equals("Produccion") || valor.equals("Contabilidad")){
            return valor;
        }
        throw new IllegalArgumentException("El área no es valida");
    }



    @Override
    public String value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return Objects.equals(valor, area.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
