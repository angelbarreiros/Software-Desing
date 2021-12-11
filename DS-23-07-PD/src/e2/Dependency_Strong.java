package e2;
import java.util.*;

public class Dependency_Strong implements Dependency{
    private final Graph aux = new Graph();
    @Override
    public void execute(Graph g, List<Character> list) {
        List<Character>lista2;
        if (aux.getPredecesores().size() == 0 && aux.getAntecesores().size()==0 && list.size()!=0 ){
            System.out.println("listafinal = " + list);
        }
        else{
            if (list.size()==0){
                aux.graphcopy(g);
            }
            lista2= avaliables(aux);
            if (lista2.size()!=0) {
                Character c = max(lista2);
                aux.deletePredecesores(c);
                aux.deleteAntecesores(c);
                aux.getPredecesores().remove(c);
                aux.getAntecesores().remove(c);
                list.add(c);
                execute(aux, list);

            }
            else{
                System.out.println("Interrumpido :existen caminos duplicados en " + list.get(list.size()-1).toString());
            }

        }
    }


    private List<Character> avaliables(Graph g){
        List<Character>lista= new ArrayList<>();
        List<Character> aux2;
        Iterator<Character> it2 = g.getAntecesores().keySet().iterator();
        while(it2.hasNext()){
            Character clave = it2.next();
            aux2 = g.getAntecesores().get(clave);
            if (aux2.isEmpty()){
                lista.add(clave);
            }

        }
        return lista;
    }
    private  Character max(List<Character> lista){
        if (lista==null){
            return null;
        }
        else{
            Character c=lista.get(0);
            for (int i =0;i< lista.size();i++){
                if (lista.get(i)<c){
                    c=lista.get(i);
                }


            }
            return c;
        }
    }



}
