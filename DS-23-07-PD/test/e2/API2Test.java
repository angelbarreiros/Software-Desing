package e2;


import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class API2Test {
    @Test
    public void ApiTest() throws IOException {
        //Creación de la API
        API api = new API();
        //Lectura de grafo de archivo
        Graph graph=new Graph();
        graph=api.graphMaker("test/e2/Prueba1Dependencies.txt");
        //Declaracion de dependecias
        Dependency_Weak dependency_weak= new Dependency_Weak();
        Dependency_Strong dependency_strong= new Dependency_Strong();
        Dependency_Hierarchy dependency_hierarchy=new Dependency_Hierarchy();
        //Seteo de dependencias y ejecucion de los distintos algoritmos
        api.setDependency(dependency_strong);
        api.work(graph);
        assertEquals("[C, A, B, D, G, F, E, H, J]",api.work(graph).toString());
        api.setDependency(dependency_weak);
        api.work(graph);
        assertEquals("[C, A, B, D, E, F, G, H, J]",api.work(graph).toString());
        api.setDependency(dependency_hierarchy);
        api.work(graph);
        assertEquals("[C, G, A, F, H, B, D, E, J]",api.work(graph).toString());



    }
    
}