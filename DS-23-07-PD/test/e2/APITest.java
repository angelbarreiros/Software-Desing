package e2;

import org.junit.jupiter.api.Test;

import java.io.IOException;


public class APITest {
    @Test
    public void Test() throws IOException {
        API api = new API();
        api.graphMaker(api.fileReader("src/e2/xDependencies.txt"));
        System.out.println("api.toString() = " + api);
    }
    
}