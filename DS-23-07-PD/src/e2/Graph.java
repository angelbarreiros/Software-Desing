package e2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    Map<Character, List<Character>> predecesores= new HashMap<>();
    Map<Character,List<Character>> antecesores= new HashMap<>();

    private void add(char a, char b){
        List<Character> lista = predecesores.get(a);
        lista.add(b);
        predecesores.put(a, lista);
        List<Character> lista2 = antecesores.get(b);
        lista2.add(a);
        antecesores.put(b,lista2);
    }

    public Map<Character, List<Character>> getAntecesores() {
        return antecesores;
    }
}
