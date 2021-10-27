package e1;

public class Guardabosques extends Personal{
    @Override
    public void setTipo(tipo tipo) {
        super.setTipo(Personal.tipo.Guardabosques);
    }

    private boolean nocturnidad;
    public Guardabosques(String nombre, int edad, String apellidos, int horrocruxes, boolean nocturnidad) {
        super(nombre, apellidos ,edad, horrocruxes);
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

    @Override
    public String toString() {
        return getNombre() + " " + getApellidos() + " (Guardabosques , ";
    }

}
