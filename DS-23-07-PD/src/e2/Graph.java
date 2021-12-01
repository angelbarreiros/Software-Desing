package e2;

import java.util.*;

public class Graph {

    Map<Character,List<Character>> predecesores= new HashMap<>();
    Map<Character,List<Character>> antecesores= new HashMap<>();

    public void add(char a, char b){
        List<Character> aux=new ArrayList<>();
        List<Character> aux2=new ArrayList<>();
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
