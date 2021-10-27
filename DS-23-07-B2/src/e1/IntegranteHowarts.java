package e1;

import java.util.ArrayList;

public abstract class IntegranteHowarts extends Colegio {
    private String Nombre;
    private String Apellidos;
    private int edad;
    private int  horrocruxes;

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellindos(String apellindos) {
        Apellidos = apellindos;
    }

    public void setHorrocruxes(int horrocruxes) {
        this.horrocruxes = horrocruxes;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getHorrocruxes() {
        return horrocruxes;
    }

    public IntegranteHowarts(String nombre, String apellidos, int edad, int horrocruxes) {
        Nombre = nombre;
        Apellidos = apellidos;
        this.edad = edad;
        this.horrocruxes = horrocruxes;
    }

}

