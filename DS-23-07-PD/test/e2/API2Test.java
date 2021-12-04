package e2;

import org.junit.jupiter.api.Test;

import java.io.IOException;


public class API2Test {
    @Test
    public void ApiTest() throws IOException {
        API api = new API();
        Graph graph=api.graphMaker(api.fileReader("src/e2/Prueba2Dependencies.txt"));
        Dependency_Weak dependency_weak= new Dependency_Weak();
        Dependency_Strong dependency_strong= new Dependency_Strong();
        Dependency_Hierarchy dependency_hierarchy=new Dependency_Hierarchy();
        api.setDependency(dependency_strong);
        api.work(graph);
        api.setDependency(dependency_weak);
        api.work(graph);
        api.setDependency(dependency_hierarchy);
        api.work(graph);










    }
    
}