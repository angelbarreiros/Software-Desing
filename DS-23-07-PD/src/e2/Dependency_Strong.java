package e2;
import java.util.*;

public class Dependency_Strong implements Dependency{

    @Override
    public void ejecutar(Graph g,List<Character> list) {
        List<Character>lista2;
        if (g.getPredecesores().size() == 0 && g.getAntecesores().size()==0 ){
            System.out.println("listafinal = " + list);
        }
        else{
            lista2=filtro(g);
            if (lista2.size()!=0){
                char c = lista2.get(0);
                for (int i=0;i<lista2.size();i++){
                    if (lista2.get(i)<c){
                        c=lista2.get(i);
                    }
                }
                eliminar(c, g.getAntecesores());
                eliminar(c,g.getPredecesores());
                g.getPredecesores().remove(c);
                g.getAntecesores().remove(c);
                list.add(c);
            }
            ejecutar(g,list);
        }
    }

    private void eliminar(char c , Map<Character,List<Character>> M){
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
    private List<Character> filtro(Graph g){
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
}
