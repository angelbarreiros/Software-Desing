package e1;

import java.util.ArrayList;

public abstract class IntegranteHogwarts extends Colegio {
    private final String Nombre;
    private final String Apellidos;
    private final int edad;
    private final int  horrocruxes;

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getHorrocruxes() {
        return horrocruxes;
    }

    public IntegranteHogwarts(String nombre, String apellidos, int edad, int horrocruxes) {
        Nombre = nombre;
        Apellidos = apellidos;
        this.edad = edad;
        this.horrocruxes = horrocruxes;
    }
    public String printHorrocruxes() {
        return ", " + getHorrocruxes() + "): ";
    }

}

