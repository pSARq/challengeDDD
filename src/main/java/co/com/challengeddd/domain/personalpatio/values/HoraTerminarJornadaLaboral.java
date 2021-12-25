package co.com.challengeddd.domain.personalpatio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class HoraTerminarJornadaLaboral implements ValueObject<Integer> {

    private final int hora;

    public HoraTerminarJornadaLaboral(int hora){
        this.hora = Objects.requireNonNull(validarHora(hora), "La hora no puede estar nula");
    }

    private int validarHora(int hora){
        if (isHoraValida(hora)){
            return hora;
        }
        throw new IllegalArgumentException("La hora ingresada no es valida");
    }

    private boolean isHoraValida(int hora) {
        return hora >= 13 && hora <= 15;
    }

    @Override
    public Integer value() {
        return hora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraTerminarJornadaLaboral that = (HoraTerminarJornadaLaboral) o;
        return hora == that.hora;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hora);
    }
}
