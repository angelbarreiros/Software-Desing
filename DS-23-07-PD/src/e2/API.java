package e2;

import e1.*;

import java.time.LocalDateTime;
import java.time.Month;

public class API {
    private Dependency dependency;
    private Graph graph=null;

    public API(Graph graph) {
        this.graph = graph;
    }
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }
    public void work(){
        dependency.ejecutar();
    }




}
