package e1;

public abstract class IntegranteHowarts {
    private String Nombre;
    private int edad;
    private String Apellidos;
     private int  horrocruxes;

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellindos(String apellindos) {
        Apellidos = apellindos;
    }

    public void setHorrocruxes(int horrocruxes) {
        this.horrocruxes = horrocruxes;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getHorrocruxes() {
        return horrocruxes;
    }

    public IntegranteHowarts(String nombre, int edad, String apellidos, int horrocruxes) {
        Nombre = nombre;
        this.edad = edad;
        Apellidos = apellidos;
        this.horrocruxes = horrocruxes;
    }
}
