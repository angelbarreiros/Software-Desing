package e2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class API {
    private Dependency dependency;
    private String Aux;
    private final Graph gaux = new Graph();


    private void setAux(String aux) {
        this.Aux = aux;
    }

    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    public String fileReader(String s) throws IOException {
        this.setAux(Aux);
        File archivo= new File (s);
        FileReader fr= new FileReader (archivo);
        BufferedReader br=new BufferedReader(fr);
        String linea;
        StringBuilder builder= new StringBuilder();
        while((linea=br.readLine())!=null){
            builder.append(linea);
        }
        return builder.toString();
    }
    public Graph graphMaker(String s){
        char c;
         Graph graph=new Graph();
        List<Character> aux=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            c=s.charAt(i);
            if (!(c=='\n'||c=='-'||c=='>')){
                aux.add(c);
            }
        }
        for (int i=0;i<aux.size();i=i+2){
            graph.add(aux.get(i),aux.get(i+1));

        }
        Map<Character,List<Character>> aux1;
        Map<Character,List<Character>> aux2;
        aux1=copy(graph.getAntecesores());
        aux2=copy(graph.getPredecesores());
        this.gaux.setAntecesores(aux1);
        this.gaux.setPredecesores(aux2);
        return graph;


    }
    public Graph reset(){
        return gaux;
    }
    public void work(Graph g) throws IOException {
        List<Character>lista=new ArrayList<>();
        dependency.ejecutar(g,lista);

    }
    private static Map<Character, List<Character>> copy(Map<Character, List<Character>> original)
    {
        Map<Character, List<Character>> copy = new HashMap<Character, List<Character>>();
        for (Map.Entry<Character, List<Character>> entry : original.entrySet())
        {
            copy.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }
        return copy;
    }
}
