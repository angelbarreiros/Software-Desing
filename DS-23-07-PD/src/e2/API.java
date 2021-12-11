package e2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;


public class API {
    private Dependency dependency=null;
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    public Graph GraphMaker(String s) throws IOException {
        File archivo= new File (s);
        FileReader fr= new FileReader (archivo);
        BufferedReader br=new BufferedReader(fr);
        String linea;
        StringBuilder builder= new StringBuilder();
        while((linea=br.readLine())!=null){
            builder.append(linea);
        }
        return grahpBuilder(builder.toString());

    }
    public void work(Graph g)  {
        List<Character>lista=new ArrayList<>();
        dependency.execute(g,lista);

    }
    private Graph grahpBuilder(String s){
        char c;
        Graph graph=new Graph();
        List<Character> aux=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            c=s.charAt(i);
            if (!(c=='\n'||c=='-'||c=='>' || c==' ')){
                aux.add(c);
            }
        }
        for (int i=0;i<aux.size();i=i+2){
            graph.add(aux.get(i),aux.get(i+1));

        }
        aux.clear();
        return graph;

    }

}
