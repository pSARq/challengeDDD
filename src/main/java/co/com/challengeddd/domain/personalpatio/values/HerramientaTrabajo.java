package co.com.challengeddd.domain.personalpatio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Arrays;
import java.util.Objects;

public class HerramientaTrabajo implements ValueObject<String> {

    private final String valor;

    public HerramientaTrabajo(String valor){
        this.valor = Objects.requireNonNull(validarHerramienta(valor), "La herramienta no puede ser nula");
    }

    private String validarHerramienta(String valor){
        if (isHerramientaValida(valor)){
            return valor;
        }
        throw new IllegalArgumentException("La herramienta es invalida");
    }

    private boolean isHerramientaValida(String valor){
        String[] listaHerramientas = new String[]{"Pesa", "Gancho", "Carreta", "Bolsa", "Amarra"};
        return Arrays.stream(listaHerramientas).anyMatch(herramienta -> herramienta.equals(valor));
    }

    @Override
    public String value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HerramientaTrabajo that = (HerramientaTrabajo) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
