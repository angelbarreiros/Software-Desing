package e1;

public class Guardabosques extends Personal{
    public Guardabosques(String nombre, int edad, String apellidos, int horrocruxes, tipo tipo) {
        super(nombre, apellidos ,edad, horrocruxes, tipo);
    }

    @Override
    public float Recompensa() {
        return getHorrocruxes()*75;
    }

    @Override
    public float Salario() {
        return 0;
    }
}
