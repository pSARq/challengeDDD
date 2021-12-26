package co.com.challengeddd.domain.transporte.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Arrays;
import java.util.Objects;

public class Licencia implements ValueObject<Licencia.Properties> {

    private final String nombre;
    private final String numeroIdentificacion;
    private final String tipo;

    public Licencia(String nombre, String numeroIdentificacion, String tipo){
        this.nombre = Objects.requireNonNull(validarNombre(nombre), "El nombre no puede ser nulo");
        this.numeroIdentificacion = Objects.requireNonNull(validarNumeroIdentificacion(numeroIdentificacion), "El número de identifiacion no puede ser nulo");
        this.tipo = Objects.requireNonNull(validarTipo(tipo), "El tipo no puede ser nulo");
    }

    private String validarNombre(String nombre){
        if (nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        return nombre;
    }

    private String validarNumeroIdentificacion(String numeroIdentificacion){
        if (numeroIdentificacion.length() != 10){
            throw new IllegalArgumentException("El numero de la identificacion debe contener 10 digitos");
        }
        return numeroIdentificacion;
    }

    private String validarTipo(String tipo){
        if (isTipoCorrecto(tipo)){
            return tipo;
        }
        throw new IllegalArgumentException("El tipo de no es incorrecto");
    }

    private boolean isTipoCorrecto(String tipo){
        String[] listaTiposLicencia = new String[]{"A1", "A2", "B1", "B2", "C3"};
        return Arrays.stream(listaTiposLicencia).anyMatch(tipoLicencia -> tipoLicencia.equals(tipo));
    }

    public interface Properties{
        String nombre();
        String numeroIdentificacion();
        String tipo();
    }

    public Properties value(){
        return new Properties() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String numeroIdentificacion() {
                return numeroIdentificacion;
            }

            @Override
            public String tipo() {
                return tipo;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Licencia licencia = (Licencia) o;
        return Objects.equals(nombre, licencia.nombre) && Objects.equals(numeroIdentificacion, licencia.numeroIdentificacion) && Objects.equals(tipo, licencia.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numeroIdentificacion, tipo);
    }
}
