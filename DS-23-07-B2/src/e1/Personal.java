package e1;

public abstract class Personal extends IntegranteHowarts {

    enum tipo {
    Docente,Conserje,Guardabosques
        }
    private final Personal.tipo Tipo;

    public Personal(String nombre, int edad, String apellidos, int horrocruxes, tipo tipo) {
        super(nombre, edad, apellidos, horrocruxes);
        Tipo = tipo;
    }

    public  abstract float  Recompensa();


}
