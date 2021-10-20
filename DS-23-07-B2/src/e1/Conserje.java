package e1;

public class Conserje extends Personal{
    public Conserje(String nombre, int edad, String apellidos, int horrocruxes, tipo tipo) {
        super(nombre, edad, apellidos, horrocruxes, tipo);

    }

    public float Recompensa(){
        return  getHorrocruxes()*65;

    }

}


