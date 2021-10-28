package e1;

public class Conserje extends Personal{
    @Override
    public void setTipo(tipo tipo) {
        super.setTipo(Personal.tipo.Conserje);
    }

    private final boolean nocturnidad;
    public Conserje(String nombre, String apellidos, int edad, int horrocruxes, boolean nocturnidad) {
        super(nombre, apellidos, edad, horrocruxes);
        this.nocturnidad = nocturnidad;
    }

    public float Recompensa(){
        return  getHorrocruxes()*65;

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
        return getNombre() + " " + getApellidos() + " (Conserje" ;
    }

}


