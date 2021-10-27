package e1;

public class Conserje extends Personal{
    boolean nocturnidad;
    public Conserje(String nombre, int edad, String apellidos, int horrocruxes, tipo tipo, boolean nocturnidad) {
        super(nombre, apellidos, edad, horrocruxes, tipo);
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

}


