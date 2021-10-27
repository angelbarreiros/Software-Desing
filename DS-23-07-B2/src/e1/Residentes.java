package e1;

public class Residentes extends IntegranteHogwarts {

    enum tipo {
        Estudiantes, Fantasmas
    }

    enum casa {
        Gryffindor, Revneclaw, Hufflepuff, Slytherin
    }

    private final tipo Tipo;
    private final casa Casa;

    public Residentes(String nombre, String apellidos, int edad, int horrocruxes, tipo tipo, casa casa) {
        super(nombre, apellidos, edad, horrocruxes);
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
        } else{
            return this.getHorrocruxes() * 80;
        }
    }

    @Override
    public String toString() {
        return getNombre() + " " + getApellidos() + " (" + this.Tipo +" de " + this.Casa;
    }

    public static void main(String[] args) {
        Residentes r1 = new  Residentes("Angel ","Otero",18,10,tipo.Estudiantes,casa.Hufflepuff);
        System.out.println("r1.toString() = " + r1);
    }
}