package e2;

import java.util.*;



public class Dependency_Hierarchy implements Dependency{
    private final Graph aux = new Graph();
    @Override
        public void execute(Graph g, List<Character> list) {

            List<Character>lista2;
            if (aux.getPredecesores().size() == 0 && list.size()!=0  ){
                System.out.println("listafinal = " + list);
            }
            else{
                if (list.size()==0){
                   aux.graphcopy(g);
                }
                lista2= avaliables(aux,list);
                Character c = max(lista2,g);
                if (c!=null){
                    aux.deletePredecesores(c);
                    aux.getPredecesores().remove(c);
                    list.add(c);
                }
                execute(aux,list);
            }
        }



        private List<Character> avaliables(Graph g, List<Character> list) {
            List<Character> lista = new ArrayList<>();
            List<Character> aux2;
            Iterator<Character> it2 = g.getAntecesores().keySet().iterator();
            while (it2.hasNext()) {
                Character clave = it2.next();

                if (!(list.contains(clave))) {
                    aux2 = g.getAntecesores().get(clave);
                    if (aux2.isEmpty()) {
                        lista.add(clave);
                    }
                    for (Character value : list) {
                        if (aux2.contains(value)) {
                            lista.add(clave);
                        }
                    }

                }

            }
        return lista;
        }
        private  Character max(List<Character> lista, Graph g){

        if (lista.size()!=0){
            int max= g.pathFromAntecesores(lista.get(0));
            char c = lista.get(0);
                
                for (int i=0;i<lista.size();i++){
                     if (g.pathFromAntecesores(lista.get(i))< max){
                        max= g.pathFromAntecesores(lista.get(i));
                         c=lista.get(i);
                    }


                }
                return c;
            }
            else{
                return null;
            }


        }

}
