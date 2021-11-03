package e1;

public class Fantasmas extends Residentes{
    public Fantasmas(String nombre, String apellidos, int edad, int horrocruxes, casa casa) {
        super(nombre, apellidos, edad, horrocruxes, casa);
    }

    @Override
    public float Recompensa() {
        if (this.getCasa() == casa.Slytherin) {
            return this.getHorrocruxes() * 80 * 2;
        } else{
            return this.getHorrocruxes() * 80;
        }
    }

    @Override
    public String toString() {
        return getNombre() + " " + getApellidos() + " (fantasma de " + this.getCasa();
    }
}
