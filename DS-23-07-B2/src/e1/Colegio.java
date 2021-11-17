package e1;



import java.util.ArrayList;
import java.util.List;

public class Colegio  {

    private static final List<Personal> arrayPersonal =new ArrayList<>();
    private static final  List<Residentes> arrayResidentes=new ArrayList<>();

    public static void addPersonal(Personal p){
        if (p.getClass() == Docente.class){
            for( Personal q: arrayPersonal){
                if (q.getClass() == Docente.class){
                    if(((Docente) p).getAsignatura() == ((Docente) q).getAsignatura()){
                        throw new IllegalArgumentException();
                    }
                }
            }
        }

        arrayPersonal.add(p);
    }

    public static void addResidentes(Residentes r){
        arrayResidentes.add(r);
    }

    public static String imprimirRecompensa() {
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

    public static String imprimirSalarios() {
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
