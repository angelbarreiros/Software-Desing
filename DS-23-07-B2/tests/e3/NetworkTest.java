package e3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NetworkTest {
    @Test
    void setup(){
        List<TopicOfInterest> topic = new ArrayList<>();
        Network<NetworkManager> net = new Network<>();
        Matriz mapa = new Matriz();
        net.setNetworkManager(mapa);
        net.addUser("pepe",topic);


    }
}