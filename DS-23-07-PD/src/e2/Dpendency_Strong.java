package e2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dpendency_Strong implements Dependency{

    @Override
    public void ejecutar(Graph g,List<Character> list) {
        List<Character>lista2= new ArrayList<>();

        List<Character> aux2;
        Iterator<Character> it2 = g.getAntecesores().keySet().iterator();
        if (g.getPredecesores().size() == 0 && g.getAntecesores().size()==0 ){
            System.out.println("listafinal = " + list);
        }
        else{
            while(it2.hasNext()){
                Character clave = it2.next();
                aux2 = g.getAntecesores().get(clave);
                if (aux2.isEmpty()){
                    lista2.add(clave);
                }

            }
            if (lista2.size()!=0){
                char c = lista2.get(0);
                for (int i=0;i<lista2.size();i++){
                    if (lista2.get(i)<c){
                        c=lista2.get(i);
                    }
                }
                eliminar(c, g);
                g.getPredecesores().remove(c);
                g.getAntecesores().remove(c);
                list.add(c);

            }
            ejecutar(g,list);

        }


        
    }
    private Graph eliminar(char c , Graph g){
        Iterator<Character> it2 = g.getAntecesores().keySet().iterator();
        Iterator<Character> it3 = g.getAntecesores().keySet().iterator();
        List<Character> aux2;
        List<Character> aux3;
        while(it2.hasNext()){
            Character clave = it2.next();
            aux2 = g.getAntecesores().get(clave);
            if (aux2!=null){
                for (int i=0;i<aux2.size();i++){
                    if (aux2.get(i).equals(c)){
                        aux2.remove(aux2.get(i));
                        g.getAntecesores().replace(clave,aux2);
                    }
                }
            }


        }
        while(it3.hasNext()){
            Character clave = it3.next();
            aux3 = g.getPredecesores().get(clave);
            if (aux3!=null){
                for (int i=0;i<aux3.size();i++){
                    if (aux3.get(i).equals(c)){
                        aux3.remove(aux3.get(i));
                        g.getPredecesores().replace(clave,aux3);
                    }
                }

            }
        }

        return g;
    }
    

    public static void main(String[] args) throws IOException {
        API api= new API();

        Dpendency_Strong dpendency_strong=new Dpendency_Strong();
        api.graphMaker(api.fileReader("src/e2/xDependencies.txt"));
        api.setDependency(dpendency_strong);
        api.work();
    }

}
