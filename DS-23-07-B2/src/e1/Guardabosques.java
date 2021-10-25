package e1;

public class Guardabosques extends Personal{
    private boolean nocturnidad;
    public Guardabosques(String nombre, String apellidos, int edad, int horrocruxes, tipo tipo, boolean nocturnidad) {
        super(nombre, apellidos, edad, horrocruxes, tipo);
        this.nocturnidad = nocturnidad;
    }

    @Override
    public float Recompensa() {
        return getHorrocruxes()*75;
    }

    @Override
    public float Salario() {
        if (nocturnidad){
            return 170 + 10;
        }else{return 170;}
    }
}
