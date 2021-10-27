package e1;

public class Guardabosques extends Personal{
    boolean nocturnidad;
    public Guardabosques(String nombre, int edad, String apellidos, int horrocruxes, tipo tipo, boolean nocturnidad) {
        super(nombre, apellidos ,edad, horrocruxes, tipo);
        this.nocturnidad = nocturnidad;
    }

    @Override
    public float Recompensa() {
        return getHorrocruxes()*75;
    }

    @Override
    public float Salario() {
        if(nocturnidad){
            return 150 + 10;
        }else{
            return 150;
        }
    }
}
