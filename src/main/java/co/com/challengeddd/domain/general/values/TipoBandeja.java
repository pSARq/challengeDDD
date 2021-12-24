package co.com.challengeddd.domain.general.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoBandeja implements ValueObject<String> {

    private String valor;

    public TipoBandeja(String valor){
        this.valor = Objects.requireNonNull(validarValor(valor), "El tipo de bandeja no puede ser nulo");
    }

    private String validarValor(String valor){
        if (isTipoBandejaCorrecta(valor)) {
            return valor;
        }
        throw new IllegalArgumentException("El número de la sala es incorrecto");
    }

    private boolean isTipoBandejaCorrecta(String valor){
        String[] listaTiposBandejas = new String[]{"150", "250", "500"};

        for (String tipoBandeja : listaTiposBandejas) {
            if (tipoBandeja.equals(valor)){
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
        TipoBandeja that = (TipoBandeja) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
