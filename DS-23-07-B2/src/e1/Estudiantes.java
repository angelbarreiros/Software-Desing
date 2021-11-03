package e1;

public class Estudiantes extends Residentes {

    public Estudiantes(String nombre, String apellidos, int edad, int horrocruxes, casa casa) {
        super(nombre, apellidos, edad, horrocruxes, casa);
    }

    @Override
    public float Recompensa() {
        if (this.getCasa() == casa.Slytherin) {
            return this.getHorrocruxes() * 90 * 2;
        } else {
            return this.getHorrocruxes() * 90;
        }

    }

    @Override
    public String toString() {
        return getNombre() + " " + getApellidos() + " (estudiante de " + this.getCasa();
    }
}