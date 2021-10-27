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
        System.out.println(sb);
        return sb.toString();
    }

/*  public static void main(String[] args) {
        ArrayList<Personal> arrayPersonal =new ArrayList<>();
        ArrayList<Residentes> arrayResidentes=new ArrayList<>();

        arrayPersonal.add(new Docente("paquito", "38", 50, 16, Docente.asignatura.Defensa));
        arrayPersonal.add(new Guardabosques("Luis", "Cacas", 80, 65, true));
        arrayPersonal.add(new Conserje("Roberto", "Loureiro", 30, 23, false));
        arrayResidentes.add(new Residentes("Joseluis", "Rodriguez Zapatero", 21, 6, Residentes.tipo.Estudiantes, Residentes.casa.Hufflepuff));
        arrayResidentes.add(new Residentes("Josemanuel", "Dieguez", 200, 8, Residentes.tipo.Fantasmas, Residentes.casa.Slytherin));
        imprimirRecompensa(arrayPersonal, arrayResidentes);
        imprimirSalarios(arrayPersonal);
    }*/
}
