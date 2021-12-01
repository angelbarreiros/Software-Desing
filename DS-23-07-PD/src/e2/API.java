package e2;
import java.util.ArrayList;
import java.util.List;

public class API {
    private Dependency dependency;
    private final Graph graph=new Graph();

    public void graphmaker(String s){
        char c;
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

    }

    public void work(){
        dependency.ejecutar(this.graph);
    }

    @Override
    public String toString() {
        return "API{" +
                "dependency=" + dependency +
                ", graph=" + graph +
                '}';
    }
}
