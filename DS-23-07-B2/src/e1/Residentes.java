package e1;

import java.util.EmptyStackException;

public class Residentes extends IntegranteHowarts {
    enum tipo {
        Estudiantes, Fantasmas
    }

    enum casa {
        Gryffindor, Revneclaw, Hufflepuff, Slytherin
    }

    private final tipo Tipo;
    private final casa Casa;

    public Residentes(String nombre, int edad, String apellidos, int horrocruxes, tipo tipo, casa casa) {
        super(nombre, edad, apellidos, horrocruxes);
        Tipo = tipo;
        Casa = casa;
    }

    public float Recompensa() {
        if (this.Casa == casa.Slytherin && this.Tipo == tipo.Estudiantes) {
            return this.getHorrocruxes() * 90 * 2;
        } else if (this.Tipo == tipo.Estudiantes) {
            return this.getHorrocruxes() * 90;
        } else if (this.Casa == casa.Slytherin && this.Tipo == tipo.Fantasmas) {
            return this.getHorrocruxes() * 80 * 2;
        } else if (this.Tipo == tipo.Fantasmas) {
            return this.getHorrocruxes() * 80;
        }
        return 0;
    }

    @Override
    public String toString() {
        return getNombre()+""+getApellidos()+" "+getEdad()+" "+getHorrocruxes()+" "+Tipo+" "+Casa;
    }

    public static void main(String[] args) {
        Residentes r1 = new  Residentes("Angel ",18,"Otero",10,tipo.Estudiantes,casa.Hufflepuff);
        System.out.println("r1.toString() = " + r1);
    }
}