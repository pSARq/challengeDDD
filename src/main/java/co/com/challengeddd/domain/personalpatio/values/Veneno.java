package co.com.challengeddd.domain.personalpatio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Arrays;
import java.util.Objects;

public class Veneno implements ValueObject<String> {

    private final String valor;

    public Veneno(String valor){
        this.valor = Objects.requireNonNull(validarVeneno(valor), "El veneno no puede ser nulo");
    }

    private String validarVeneno(String valor){
        if (isVenenoValido(valor)){
            return valor;
        }

        throw new IllegalArgumentException("El veneno no es valido");
    }

    private boolean isVenenoValido(String valor){
        String[] listaVenenos = new String[]{"Cipermetrina", "Mats", "Mirage", "Nuvan"};
        return Arrays.stream(listaVenenos).anyMatch(veneno -> veneno.equals(valor));
    }

    @Override
    public String value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veneno veneno = (Veneno) o;
        return Objects.equals(valor, veneno.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
