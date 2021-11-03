package e3;


import java.util.ArrayList;
import java.util.List;

public class Network <T extends  NetworkManager>{
    private NetworkManager networkManager =null;

    public void setNetworkManager(NetworkManager networkManager) {
        this.networkManager = networkManager;
    }

    public NetworkManager getNetworkManager() {
        return networkManager;
    }
    void addUser(String xd , List<TopicOfInterest> tp ){
        networkManager.addUser(xd,tp);
    }
    public List<String> getUsers(){
        return networkManager.getUsers();
    }

    public static void main(String[] args) {
        List<TopicOfInterest> topic = new ArrayList<>();
        Network<NetworkManager> net = new Network<>();
        Matriz mapa = new Matriz();
        net.setNetworkManager(mapa);
        net.addUser("pepe",topic);
        System.out.println("net.getUsers() = " + net.getUsers());


    }
}
