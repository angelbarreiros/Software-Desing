package e2;

import org.junit.jupiter.api.Test;

import java.io.IOException;


public class APITest {
    @Test
    public void Test() throws IOException {
        API api = new API();
        api.graphMaker(api.fileReader("src/e2/xDependencies.txt"));
        Dependency_Weak dependency_weak= new Dependency_Weak();
        Dependency_Strong dependency_strong= new Dependency_Strong();
        Dependency_Hierarchy dependency_hierarchy=new Dependency_Hierarchy();
        api.setDependency(dependency_hierarchy);
        api.work();


    }
    
}