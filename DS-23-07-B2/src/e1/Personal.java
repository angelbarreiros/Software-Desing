package e1;

public abstract class Personal extends IntegranteHowarts {


    enum tipo {
    Docente,Conserje,Guardabosques
        }

    public void setTipo(tipo tipo) {
        Tipo = tipo;
    }

    private Personal.tipo Tipo;

    public Personal(String nombre, String apellidos, int edad, int horrocruxes) {
        super(nombre, apellidos, edad, horrocruxes);
    }

    public tipo getTipo() {
        return Tipo;
    }

    public String printHorrocruxes() {
        return ", " + getHorrocruxes() + "): ";
    }

    public  abstract float  Recompensa();

    public  abstract float Salario();

    @Override
    public abstract String toString();


}
