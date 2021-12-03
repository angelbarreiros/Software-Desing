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
                graphcopy(g);
            }
            lista2= avaliables(aux);
            char c = max(lista2);
            delete(c, aux.getAntecesores());
            delete(c,aux.getPredecesores());
            aux.getPredecesores().remove(c);
            aux.getAntecesores().remove(c);
            list.add(c);
            execute(aux,list);
        }
    }

    private void delete(char c , Map<Character,List<Character>> M){
        Iterator<Character> it2 = M.keySet().iterator();
        List<Character> aux2;
        while(it2.hasNext()){
            Character clave = it2.next();
            aux2 = M.get(clave);
            if (aux2!=null){
                for (int i=0;i<aux2.size();i++){
                    if (aux2.get(i).equals(c)){
                        aux2.remove(aux2.get(i));
                        M.replace(clave,aux2);
                    }
                }
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
        char c=lista.get(0);
          for (int i =0;i< lista.size();i++){
              if (lista.get(i)<c){
                  c=lista.get(i);
              }


        }
          return c;
    }
    private static Map<Character, List<Character>> copy(Map<Character, List<Character>> original)
    {
        Map<Character, List<Character>> copy = new HashMap<>();
        for (Map.Entry<Character, List<Character>> entry : original.entrySet())
        {
            copy.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }
        return copy;
    }
    private void graphcopy(Graph g){
        Map<Character,List<Character>> aux1;
        Map<Character,List<Character>> aux2;
        aux1=copy(g.getAntecesores());
        aux2=copy(g.getPredecesores());
        this.aux.setAntecesores(aux1);
        this.aux.setPredecesores(aux2);
    }

}
