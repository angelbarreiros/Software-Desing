package e1;


import java.util.ArrayList;

public class Colegio  {
    ArrayList<Personal> arrayPersonal =new ArrayList<>();
    ArrayList<Residentes> arrayResidentes=new ArrayList<>();

    public void imprimirRecompensa() {
        for (Personal p:arrayPersonal) {
            p.toString();
        }
    }
        // No se si se hace con listas pero bueno te lo dejo por aqui , me refiero a lo de imprimir listas
        //suerte

    public static void main(String[] args) {

    }
}
