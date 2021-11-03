package e1;

public abstract class Residentes extends IntegranteHogwarts {

    enum casa {
        Gryffindor, Revneclaw, Hufflepuff, Slytherin
    }
    private final casa Casa;

    public casa getCasa() {
        return Casa;
    }

    public Residentes(String nombre, String apellidos, int edad, int horrocruxes, casa casa) {
        super(nombre, apellidos, edad, horrocruxes);
        Casa = casa;

    }

    public abstract float Recompensa();

    @Override
    public abstract String toString();
}