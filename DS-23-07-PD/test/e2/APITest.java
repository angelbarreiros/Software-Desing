package e2;

import org.junit.jupiter.api.Test;

public class APITest {
    @Test
    public void Test(){
        API api = new API();
        api.graphmaker("" +
                "C->A\n" +
                "C->F\n" +
                "A->B\n" +
                "A->D\n" +
                "B->E\n" +
                "D->E\n" +
                "F->E\n" +
                "G->F\n" +
                "G->H\n" +
                "F->J\n" +
                "H->J");
        System.out.println("api.toString() = " + api.toString());
    }
    
}
