package e1;

public abstract class Personal extends IntegranteHowarts {

    enum tipo {
    Docente,Conserje,Guardabosques
        }
    private final Personal.tipo Tipo;

    public Personal(String nombre, String apellidos, int edad, int horrocruxes, tipo tipo) {
        super(nombre, apellidos, edad, horrocruxes);
        Tipo = tipo;


    }

    public tipo getTipo() {
        return Tipo;
    }

    public  abstract float  Recompensa();

    public  abstract float Salario();

}
