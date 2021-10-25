package e1;

public class Conserje extends Personal{
    private boolean nocturnidad;
    public Conserje(String nombre, String apellidos, int edad, int horrocruxes, tipo tipo, boolean nocturnidad) {
        super(nombre, apellidos, edad, horrocruxes, tipo);
        this.nocturnidad = nocturnidad;
    }

    public float Recompensa(){
        return  getHorrocruxes()*65;

    }

    @Override
    public float Salario() {
        if (nocturnidad){
          return 150 + 10;
        }else{return 150;}
    }

}


