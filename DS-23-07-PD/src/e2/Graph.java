package e2;

import java.util.*;

public class Graph {

    private Map<Character,List<Character>> predecesores= new HashMap<>();
    private Map<Character,List<Character>> antecesores= new HashMap<>();

    public void setPredecesores(Map<Character, List<Character>> predecesores) {
        this.predecesores = predecesores;
    }

    public void setAntecesores(Map<Character, List<Character>> antecesores) {
        this.antecesores = antecesores;
    }

    public void add(char a, char b){
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

    public Map<Character, List<Character>> getPredecesores() {
        return predecesores;
    }



    public Map<Character, List<Character>> getAntecesores() {
        return antecesores;
    }



    @Override
    public String toString() {
        return "Graph{" +
                "predecesores=" + predecesores +
                ", antecesores=" + antecesores +
                '}';
    }
}
