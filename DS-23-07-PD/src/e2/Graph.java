package e2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    Map<Character, List<Character>> predecesores= new HashMap<>();
    Map<Character,List<Character>> antecesores= new HashMap<>();

    private void add(char a, char b){
        List<Character> lista = predecesores.get(b);
        lista.add(a);
        predecesores.put(a, lista);
        List<Character> lista2 = antecesores.get(a);
        lista2.add(b);
        antecesores.put(a,lista2);

    }
}
