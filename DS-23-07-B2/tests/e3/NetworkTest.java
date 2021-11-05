package e3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NetworkTest {
    @Test
    void Mapa(){

        Map mapa= new Map();
        Network<NetworkManager> network=new Network<>();
        network.setNetworkManager(mapa);



    }
    @Test
    void Matriz(){
        Matriz matriz = new Matriz();
        Network<NetworkManager> network=new Network<>();
        network.setNetworkManager(matriz);
        List<TopicOfInterest> topicOfInterestList=new ArrayList<>();
        List<String> stringList= new ArrayList<>();
        TopicOfInterest topica= new TopicOfInterest("deportes");
        TopicOfInterest topicb= new TopicOfInterest("musica");
        TopicOfInterest topicc= new TopicOfInterest("series");
        TopicOfInterest topicd= new TopicOfInterest("informatica");
        network.addUser("pepe",topicOfInterestList);
        network.addInterest("pepe",topica);
        network.addInterest("pepe",topicb);
        network.addUser("jesus",topicOfInterestList);
        network.addInterest("jesus",topicc);
        topicOfInterestList.add(topicd);
        network.addUser("angel",topicOfInterestList);
        stringList=network.getUsers();
        assertEquals("pepe",stringList.get(0));
        assertEquals("jesus",stringList.get(1));
        assertEquals("angel",stringList.get(2));
        assertNotEquals("pepe",stringList.get(2));
        topicOfInterestList=network.compare("jesus","pepe");
        assertEquals("[]",topicOfInterestList.toString());
        topicOfInterestList=network.compare("pepe","pepe");
        assertEquals("[deportes, musica]",topicOfInterestList.toString());
        stringList=network.common(topicc);
        assertEquals("jesus",stringList.get(0));
        assertNotEquals("pepe",stringList.get(0));
        topicOfInterestList=network.getInterestUser("pepe");
        assertEquals(topica,topicOfInterestList.get(0));
        assertEquals(topicb,topicOfInterestList.get(1));
        network.removeUser("pepe");
        stringList=network.getUsers();
        assertEquals("jesus",stringList.get(0));
        assertEquals("angel",stringList.get(1));
        network.removeInterest("jesus",topicc);
        topicOfInterestList=network.getInterestUser("jesus");
        assertEquals("[]",topicOfInterestList.toString());


    }
}