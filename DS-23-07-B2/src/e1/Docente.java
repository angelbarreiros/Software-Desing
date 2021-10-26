package e1;

public class Docente  extends  Personal{

    enum asignatura {
        Historia,Transformaciones,Defensa,Herbologia,Pociones
    }
    private final Docente.asignatura Asignatura;

    public Docente(String nombre, String apellidos, int edad, int horrocruxes, tipo tipo, asignatura asignatura) {
        super(nombre, apellidos, edad,horrocruxes, tipo);
        Asignatura = asignatura;

    }

    public asignatura getAsignatura() {
        return Asignatura;
    }
    public float Recompensa(){
        if (this.Asignatura==asignatura.Defensa){
            return  getHorrocruxes()*50*0.25f;
        }
        else{
            return  getHorrocruxes()*50;
        }
    }

    @Override
    public float Salario() {
        return switch (Asignatura) {
            case Defensa -> 500;
            case Transformaciones -> 400;
            case Pociones -> 350;
            case Herbologia -> 250;
            case Historia -> 200;
        };
    }

}
