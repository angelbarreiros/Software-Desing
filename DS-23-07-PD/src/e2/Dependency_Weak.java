package e2;

import java.util.*;

public class Dependency_Weak implements Dependency {
    private final Graph aux = new Graph();
    @Override
    public List<Character> execute(Graph g, List<Character> list) {
        List<Character>lista2;
        if (aux.getPredecesores().size() == 0 && aux.getAntecesores().size()==0 && list.size()!=0 ){
            return list;
        }
        else{
            if (list.size()==0){
             aux.graphcopy(g);
            }
            lista2= avaliables(aux,list);
            Character c = max(lista2,aux);
            aux.deletePredecesores(c);
            aux.getPredecesores().remove(c);
            aux.getAntecesores().remove(c);
            list.add(c);
            execute(aux,list);
        }
        return list;
    }
    @Override
    public List<Character> avaliables(Graph g, List<Character> list){
        List<Character>lista= new ArrayList<>();
        List<Character> aux2;
        Iterator<Character> it2 = g.getAntecesores().keySet().iterator();
        while(it2.hasNext()){
            Character clave = it2.next();
            aux2 = g.getAntecesores().get(clave);
            if (aux2.isEmpty() ){
                lista.add(clave);
            }
            for(Character value : list){
                if (aux2.contains (value)){
                    lista.add(clave);
                }
            }
            

        }

        return lista;
    }
    @Override
    public  Character max(List<Character> lista,Graph g){
        Character c=lista.get(0);
        for (int i =0;i< lista.size();i++){
            if (lista.get(i)<c){
                c=lista.get(i);
            }


        }
        return c;



    }


}