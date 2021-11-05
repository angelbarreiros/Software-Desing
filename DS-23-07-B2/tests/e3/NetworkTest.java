package e3;

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
        //iniciamos el tipo de working manager
        Matriz matriz = new Matriz();
        //creamos una network
        Network<NetworkManager> network=new Network<>();
        //seteamos el tipo de working manager a matriz
        network.setNetworkManager(matriz);
        //comprobamos que devuelve matriz, comprobamos que seteea bien
        assertEquals(matriz,network.getNetworkManager());
        //iniciamos la lista de intereses y la lista de string de los nombres
        List<TopicOfInterest> topicOfInterestList=new ArrayList<>();
        List<String> stringList;
        final List<TopicOfInterest> topicOfInterestListnull=null;
        //creamos los diferentes tipos de intereses
        TopicOfInterest topica= new TopicOfInterest("deportes");
        TopicOfInterest topicb= new TopicOfInterest("musica");
        TopicOfInterest topicc= new TopicOfInterest("series");
        TopicOfInterest topicd= new TopicOfInterest("informatica");
        //añadimos un usuario con la lista vacia y le añdimos intereses con la funcion de addinterest
        network.addUser("pepe",topicOfInterestList);
        network.addInterest("pepe",topica);
        network.addInterest("pepe",topicb);
        //añadimos otro usuario con la lista vacia y le añadimos intereses con la funcion addinterest
        network.addUser("jesus",topicOfInterestList);
        network.addInterest("jesus",topicc);
        //añadimos un interes a la lista de intereses y la insertamos en la creacion de un usuario
        topicOfInterestList.add(topicd);
        network.addUser("angel",topicOfInterestList);
        //utilizamos la funcion get users que devuelve una lista de strings para comprobar que ha insertado bien
        stringList=network.getUsers();
        assertEquals("pepe",stringList.get(0));
        assertEquals("jesus",stringList.get(1));
        assertEquals("angel",stringList.get(2));
        assertNotEquals("pepe",stringList.get(2));
        //comparamos 2 usuarios , que deberian tener 0 intereses en comun
        topicOfInterestList=network.compare("jesus","pepe");
        assertEquals("[]",topicOfInterestList.toString());
        //comparamos 2 usuarios que sí deberian tener intereses en comun
        topicOfInterestList=network.compare("pepe","pepe");
        assertEquals("[deportes, musica]",topicOfInterestList.toString());
        //buscamos los usuarios con un interes en comun y como se vio antes jesus es el unico que tiene el topicc
        stringList=network.common(topicc);
        assertEquals("jesus",stringList.get(0));
        assertNotEquals("pepe",stringList.get(0));
        //conseguimos la lista de intereses de un usuario con la funcion getinteresuser y comprobamos que los intereses que añadimos lineas atrás sigeun ahi
        topicOfInterestList=network.getInterestUser("pepe");
        assertEquals(topica,topicOfInterestList.get(0));
        assertEquals(topicb,topicOfInterestList.get(1));
        //eliminamos a un usuario y comprobamos que se elimina correctamente
        network.removeUser("pepe");
        stringList=network.getUsers();
        assertEquals("jesus",stringList.get(0));
        assertEquals("angel",stringList.get(1));
        //eliminamos un interes de un usuario y comprobamos que lo elimina correctamente
        network.removeInterest("jesus",topicc);
        topicOfInterestList=network.getInterestUser("jesus");
        assertEquals("[]",topicOfInterestList.toString());
        //comprobamos los interes que nos quedan en la lista , que tras la eliminacion de pepe y del interes de jesus seria el de angel, informatica, el unico que queda en la lista
        topicOfInterestList=network.getInterest();
        assertEquals(topicd,topicOfInterestList.get(0));
        //por ultimo , la lista quedaria jesus(null) angel(informatica)->lo comprobamos
        stringList=network.TotalList();
        assertEquals("[jesus, angel, [informatica]]",stringList.toString());
        //por ultimo test de errores
        assertThrows(IllegalArgumentException.class, () -> network.addInterest("natalia",topica));
        assertThrows(IllegalArgumentException.class, () -> network.addInterest("natalia",null));
        assertThrows(IllegalArgumentException.class, () -> network.addInterest(null,topica));
        assertThrows(IllegalArgumentException.class, () -> network.addUser("natalia",null));
        assertThrows(IllegalArgumentException.class, () -> network.addUser(null,topicOfInterestListnull));
        assertThrows(IllegalArgumentException.class, () -> network.removeUser(null));
        assertThrows(IllegalArgumentException.class, () -> network.removeInterest(null,topica));
        assertThrows(IllegalArgumentException.class, () -> network.removeInterest("jesus",null));
        assertThrows(IllegalArgumentException.class, () -> network.getInterestUser(null));




        


    }
}