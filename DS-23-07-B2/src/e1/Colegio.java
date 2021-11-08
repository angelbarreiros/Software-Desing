package e1;


import java.util.ArrayList;

public class Colegio  {

    public static String imprimirRecompensa(ArrayList<Personal> arrayPersonal, ArrayList<Residentes> arrayResidentes) {
        StringBuilder sb = new StringBuilder();
        float total = 0;
        for (Personal p:arrayPersonal) {
            sb.append(p.toString()).append(p.printHorrocruxes()).append(" ");
            sb.append(p.Recompensa()).append("\n");
            total += p.Recompensa();
        }
        for (Residentes r:arrayResidentes) {
            sb.append(r.toString()).append(r.printHorrocruxes()).append(" ");
            sb.append(r.Recompensa()).append(" galeones\n");
            total += r.Recompensa();
        }
        sb.append("La recompensa total del Colegio Hogwarts es de ").append(total).append(" galeones\n");
        return sb.toString();
    }

    public static String imprimirSalarios(ArrayList<Personal> arrayPersonal) {
        StringBuilder sb = new StringBuilder();
        float total = 0;
        for (Personal p:arrayPersonal) {
            sb.append(p.toString()).append(p.printHorrocruxes()).append(" ");
            sb.append(p.Salario()).append(" galeones\n");
            total += p.Salario();
        }
        sb.append("El gasto de Hogwarts en personal es de ").append(total).append(" galeones\n");
        return sb.toString();
    }
}
