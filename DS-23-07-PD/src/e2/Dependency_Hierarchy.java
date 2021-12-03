package e2;

import java.io.IOException;
import java.util.*;



public class Dependency_Hierarchy implements Dependency{
    private final Graph aux = new Graph();


    @Override
        public void ejecutar(Graph g,List<Character> list) {


            List<Character>lista2;
            if (aux.getPredecesores().size() == 0 && list.size()!=0  ){
                System.out.println("listafinal = " + list);
            }
            else{
                if (list.size()==0){
                    Map<Character,List<Character>> aux1;
                    Map<Character,List<Character>> aux2;
                    aux1=copy(g.getAntecesores());
                    aux2=copy(g.getPredecesores());
                    this.aux.setAntecesores(aux1);
                    this.aux.setPredecesores(aux2);

                }
                lista2=filtro(aux,list);
                Character c =maximo(lista2,g.getAntecesores());
                if (c!=null){
                    eliminar(c,aux.getPredecesores());
                    aux.getPredecesores().remove(c);
                    list.add(c);
                }
                ejecutar(aux,list);



            }
            aux.getAntecesores().clear();
            aux.getAntecesores().clear();

        }
        private int  camino(char c, Map<Character,List<Character>> M){
            List<Character>aux;
            if (M.get(c)!=null){
                aux=M.get(c);
                int contador=0;
                if (aux.size()==1){
                    contador = 1+camino(aux.get(0),M);
                }
                else {
                    for (int i=0;i<aux.size();i++){
                        contador=1+(Integer.min(camino(aux.get(i),M),contador));
                    }
                }
                return contador;
            }
            else {
                return 0;
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
        private List<Character> filtro(Graph g,List<Character> list) {
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
        private  Character maximo(List<Character> lista, Map<Character,List<Character>> M){

        if (lista.size()!=0){
            int max=camino(lista.get(0),M);
            char c = lista.get(0);
                
                for (int i=0;i<lista.size();i++){
                     if (camino(lista.get(i),M)< max){
                        max=camino(lista.get(i),M);
                         c=lista.get(i);
                    }


                }
                return c;
            }
            else{
                return null;
            }


        }
    private static Map<Character, List<Character>> copy(Map<Character, List<Character>> original)
    {
        Map<Character, List<Character>> copy = new HashMap<Character, List<Character>>();
        for (Map.Entry<Character, List<Character>> entry : original.entrySet())
        {
            copy.put(entry.getKey(),
                    // Or whatever List implementation you'd like here.
                    new ArrayList<>(entry.getValue()));
        }
        return copy;
    }
}
