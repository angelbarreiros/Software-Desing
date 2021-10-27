package e1;

public class Conserje extends Personal{
    @Override
    public void setTipo(tipo tipo) {
        super.setTipo(Personal.tipo.Conserje);
    }

    private boolean nocturnidad;
    public Conserje(String nombre, int edad, String apellidos, int horrocruxes, boolean nocturnidad) {
        super(nombre, apellidos, edad, horrocruxes);
        this.nocturnidad = nocturnidad;
    }

    public float Recompensa(){
        return  getHorrocruxes()*65;

    }

    @Override
    public float Salario() {
        if(nocturnidad){
            return 170 + 10;
        }else{
            return 170;
        }
    }

    @Override
    public String toString() {
        return getNombre() + " " + getApellidos() + " (Conserje , " ;
    }

}


