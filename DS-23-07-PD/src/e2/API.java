package e2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class API {
    private Dependency dependency;
    private final Graph graph=new Graph();
    List<Character>lista=new ArrayList<>();

    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    public String fileReader(String s) throws IOException {
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
    public void graphMaker(String s){
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
        dependency.ejecutar(this.graph,this.lista);
    }

    @Override
    public String toString() {
        return "API{" +
                "dependency=" + dependency +
                ", graph=" + graph +
                '}';
    }
}
