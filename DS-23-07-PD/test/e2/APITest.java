package e2;

import org.junit.jupiter.api.Test;

import java.io.IOException;


public class APITest {
    @Test
    public void Test() throws IOException {
        API api = new API();
        api.graphMaker(api.fileReader("src/e2/xDependencies.txt"));
        Dependency_Strong dependency_strong= new Dependency_Strong();
        api.setDependency(dependency_strong);
        api.work();
    }
    
}