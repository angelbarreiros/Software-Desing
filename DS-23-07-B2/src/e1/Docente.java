package e1;

public class Docente  extends  Personal{
    enum asignatura {
        Historioa,Transformaciones,Defensa,Herbologia,Pociones
    }
    private final Docente.asignatura Asignatura;

    public Docente(String nombre, int edad, String apellidos, int horrocruxes, tipo tipo, asignatura asignatura) {
        super(nombre, edad, apellidos, horrocruxes, tipo);
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

}
