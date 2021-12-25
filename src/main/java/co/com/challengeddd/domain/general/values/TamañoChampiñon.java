package co.com.challengeddd.domain.general.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TamañoChampiñon implements ValueObject<String> {

    private final String valor;

    public TamañoChampiñon(String valor){
        this.valor = Objects.requireNonNull(validarValor(valor), "El tamaño del champiñon no puede ser nulo");
    }

    private String validarValor(String valor){
        if (isTamañoCorrecto(valor)){
            return valor;
        }
        throw new IllegalArgumentException("El tamaño del champiñon es incorrecto");
    }

    private boolean isTamañoCorrecto(String valor){
        String[] listaTamaños = new String[]{"Boton", "Mediano", "Grande"};

        for (String tamaño: listaTamaños) {
            if (tamaño.equals(valor)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TamañoChampiñon that = (TamañoChampiñon) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
