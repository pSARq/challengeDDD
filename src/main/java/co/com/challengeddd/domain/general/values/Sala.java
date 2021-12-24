package co.com.challengeddd.domain.general.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Sala implements ValueObject<String> {

    private final String valor;

    public Sala(String valor){
        this.valor = Objects.requireNonNull(validarValor(valor), "La sala no puede ser nula");
    }

    private String validarValor(String valor){
        if (isSalaCorrecta(valor)) {
            return valor;
        }
        throw new IllegalArgumentException("El número de la sala es incorrecto");
    }

    private boolean isSalaCorrecta(String valor){
        String[] listaSalas = new String[]{"0", "1", "3", "5", "6", "7"};

        for (String sala: listaSalas) {
            if (sala.equals(valor)){
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
        Sala sala = (Sala) o;
        return Objects.equals(valor, sala.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
