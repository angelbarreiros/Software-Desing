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

  /*public static void main(String[] args) {
        ArrayList<Personal> arrayPersonal =new ArrayList<>();
        ArrayList<Residentes> arrayResidentes=new ArrayList<>();

      arrayPersonal.add(new Docente("Paquito", "38", 50, 16, Docente.asignatura.Defensa));
      arrayPersonal.add(new Docente("Julio", "Suarez", 43, 26, Docente.asignatura.Pociones));
      arrayPersonal.add(new Docente("Laureano", "Rosales", 61, 18, Docente.asignatura.Historia));
      arrayPersonal.add(new Docente("Laura", "Mendez", 36, 30, Docente.asignatura.Transformaciones));
      arrayPersonal.add(new Docente("Nuria", "Casado", 36, 30, Docente.asignatura.Herbologia));
      arrayPersonal.add(new Guardabosques("Luis", "Casas", 80, 65, true));
      arrayPersonal.add(new Guardabosques("Andres", "Lopez", 80, 65, false));
      arrayPersonal.add(new Conserje("Roberto", "Loureiro", 30, 23, true));
      arrayPersonal.add(new Conserje("Carlota", "Sueiro", 30, 23, false));
      arrayResidentes.add(new Estudiantes("Joseluis", "Rodriguez Zapatero", 21, 6, Residentes.casa.Slytherin));
      arrayResidentes.add(new Estudiantes("Joseluis", "Rodriguez Zapatero", 21, 6, Residentes.casa.Hufflepuff));
      arrayResidentes.add(new Fantasmas("Josemanuel", "Dieguez", 200, 8, Residentes.casa.Slytherin));
      arrayResidentes.add(new Fantasmas("Josemanuel", "Dieguez", 200, 8, Residentes.casa.Gryffindor));
      System.out.println(imprimirRecompensa(arrayPersonal, arrayResidentes));
      System.out.println(imprimirSalarios(arrayPersonal));
    }*/
}
