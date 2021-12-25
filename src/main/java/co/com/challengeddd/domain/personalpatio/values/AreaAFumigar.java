package co.com.challengeddd.domain.personalpatio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class AreaAFumigar implements ValueObject<String> {

    private final String valor;

    public AreaAFumigar(String valor){
        this.valor = Objects.requireNonNull(validarAreaAFumigar(valor), "El área a fumigar no puede ser nulo");
    }

    private String validarAreaAFumigar(String valor){
        if (isValidaArea(valor)){
            return valor;
        }
        throw new IllegalArgumentException("El área a fumigar no es valido");
    }

    private boolean isValidaArea(String valor){
        String[] listaAreas = new String[]{"0", "1", "3", "5", "6", "7", "Patio", "Siembra", "Empaque", "Cosecha"};

        for (String area: listaAreas) {
            if (area.equals(valor)){
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
        AreaAFumigar that = (AreaAFumigar) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
