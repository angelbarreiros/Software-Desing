package e1;

public abstract class Personal extends IntegranteHogwarts {


    public Personal(String nombre, String apellidos, int edad, int horrocruxes) {
        super(nombre, apellidos, edad, horrocruxes);
    }


    public  abstract float  Recompensa();

    public  abstract float Salario();

    @Override
    public abstract String toString();


}
