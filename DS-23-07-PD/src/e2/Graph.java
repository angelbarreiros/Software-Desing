package e2;

import java.util.*;

public class Graph {
    //Atributos
    private Map<Character,List<Character>> predecesores= new HashMap<>();
    private Map<Character,List<Character>> antecesores= new HashMap<>();
    //Funciones
    public Map<Character, List<Character>> getPredecesores() {
        return predecesores;
    }
    public Map<Character, List<Character>> getAntecesores() {
        return antecesores;
    }
    public void setPredecesores(Map<Character, List<Character>> predecesores) {
        this.predecesores = predecesores;
    }
    public void setAntecesores(Map<Character, List<Character>> antecesores) {
        this.antecesores = antecesores;
    }
    public void add(Character a, Character b){
        List<Character> aux=new ArrayList<>();
        List<Character> lista=predecesores.get(a);
        if (lista==null){
            aux.add(b);
            if (predecesores.containsKey(a)){
                predecesores.replace(a,aux);
            }
            else{
                predecesores.put(a, aux);
            }
        }
        else{
            if (predecesores.containsKey(a)){
                lista.add(b);
                predecesores.replace(a,lista);
            }
            else{
                lista.add(b);
                predecesores.put(a, lista);
            }
        }
        List<Character> aux2=new ArrayList<>();

        List<Character> lista2 = antecesores.get(b);
        if (lista2==null){
            aux2.add(a);
            if (antecesores.containsKey(b)){
                antecesores.replace(b,aux2);
            }
            else   {
                antecesores.put(b,aux2);
            }
        }
        else{
            if (antecesores.containsKey(b)){
                lista2.add(a);
                antecesores.replace(b,lista2);
            }
            else   {
                lista2.add(a);
                antecesores.put(b,lista2);
            }
        }
        List<Character> lista3 = antecesores.get(a);
        List<Character> aux3=new ArrayList<>();
        if (lista3==null){
            antecesores.put(a,aux3);
        }
        List<Character> lista4 = predecesores.get(b);
        List<Character> aux4=new ArrayList<>();
        if (lista4==null){
            predecesores.put(b,aux4);
        }

    }
    public void deleteAntecesores(Character c ){
        Iterator<Character> it2 = antecesores.keySet().iterator();
        List<Character> aux2;
        while(it2.hasNext()){
            Character clave = it2.next();
            aux2 = antecesores.get(clave);
            if (aux2!=null){
                for (int i=0;i<aux2.size();i++){
                    if (aux2.get(i).equals(c)){
                        aux2.remove(aux2.get(i));
                        antecesores.replace(clave,aux2);
                    }
                }
            }
        }
    }
    public void deletePredecesores(Character c ){
        Iterator<Character> it2 = predecesores.keySet().iterator();
        List<Character> aux2;
        while(it2.hasNext()){
            Character clave = it2.next();
            aux2 = predecesores.get(clave);
            if (aux2!=null){
                for (int i=0;i<aux2.size();i++){
                    if (aux2.get(i).equals(c)){
                        aux2.remove(aux2.get(i));
                        predecesores.replace(clave,aux2);
                    }
                }
            }
        }
    }
    private  Map<Character, List<Character>> copyAntecesores() {
        Map<Character, List<Character>> copy = new HashMap<>();
        for (Map.Entry<Character, List<Character>> entry : antecesores.entrySet())
        {
            copy.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }
        return copy;
    }
    private Map<Character, List<Character>> copyPredecesores() {
        Map<Character, List<Character>> copy = new HashMap<>();
        for (Map.Entry<Character, List<Character>> entry : predecesores.entrySet())
        {
            copy.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }
        return copy;
    }
    public int nodePath(Character c){
        List<Character>aux;
        if (antecesores.get(c)!=null || antecesores.size()==0){
            aux=antecesores.get(c);
            int contador=0;
            if (aux.size()==1){
                contador = 1+ nodePath(aux.get(0));
            }
            else {
                for (int i=0;i<aux.size();i++){
                    contador=1+(Integer.min(nodePath(aux.get(i)),contador));
                }
            }
            return contador;
        }
        else {
            return 0;
        }

    }
    public void graphcopy(Graph g){
        Map<Character,List<Character>> aux1;
        Map<Character,List<Character>> aux2;
        aux1=g.copyAntecesores();
        aux2=g.copyPredecesores();
        this.setAntecesores(aux1);
        this.setPredecesores(aux2);
    }
}
