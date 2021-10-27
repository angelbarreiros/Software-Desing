package e1;

public class Conserje extends Personal{
    public Conserje(String nombre, int edad, String apellidos, int horrocruxes, tipo tipo) {
        super(nombre, apellidos, edad, horrocruxes, tipo);

    }

    public float Recompensa(){
        return  getHorrocruxes()*65;

    }

    @Override
    public float Salario() {
        return 0;
    }

}


