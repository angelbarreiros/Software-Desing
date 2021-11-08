package e1;


import java.util.ArrayList;

public class Colegio  {

    public static String imprimirRecompensa(ArrayList<Personal> arrayPersonal, ArrayList<Residentes> arrayResidentes) {
        StringBuilder sb = new StringBuilder();
        float total = 0;
        for (Personal p:arrayPersonal) {
            sb.append(p.toString() + p.printHorrocruxes() + " ");
            sb.append(p.Recompensa() + "\n");
            total += p.Recompensa();
        }
        for (Residentes r:arrayResidentes) {
            sb.append(r.toString() + r.printHorrocruxes() + " ");
            sb.append(r.Recompensa() + " galeones\n");
            total += r.Recompensa();
        }
        sb.append("La recompensa total del Colegio Hogwarts es de " + total + " galeones\n");
        return sb.toString();
    }

    public static String imprimirSalarios(ArrayList<Personal> arrayPersonal) {
        StringBuilder sb = new StringBuilder();
        float total = 0;
        for (Personal p:arrayPersonal) {
            sb.append(p.toString() + p.printHorrocruxes() + " ");
            sb.append(p.Salario() + " galeones\n");
            total += p.Salario();
        }
        sb.append("El gasto de Hogwarts en personal es de " + total + " galeones\n");
        return sb.toString();
    }
}
