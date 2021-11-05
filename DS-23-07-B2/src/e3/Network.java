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
    public void addInterest(String user, TopicOfInterest topicofinterest){
        networkManager.addInterest(user,topicofinterest);
    }
    public void removeUser(String user){
        networkManager.removeUser(user);
    }
    public List<TopicOfInterest> compare(String a , String b){
        List<TopicOfInterest> lista1;
        List<TopicOfInterest> lista2;
        List<TopicOfInterest> lista3=new ArrayList<>();

        lista1=networkManager.getInterestUser(a);
        lista2=networkManager.getInterestUser(b);
        if (lista1.size()==0){
            return lista1;
        }
        if (lista2.size()==0){
            return lista2;
        }

        for (TopicOfInterest element : lista2) {
            if (!lista1.contains(element)) {
                lista3.add(element);
            }
        }
        return  lista3;
    }
    public List<TopicOfInterest> getInterest(){
       return  networkManager.getInterest();
    }
    public List<TopicOfInterest> getInterestUser(String user){
         return  networkManager.getInterestUser(user);
    }
    public List<String> common (TopicOfInterest topic){
        List<String> lista4=new ArrayList<>();
        List<TopicOfInterest> lista2;
        List<String> lista3;
        lista3=getUsers();
        for (int i=0;i<lista3.size();i++){
            String s =lista3.get(i);
            lista2=getInterestUser(s);
                if (lista2.contains(topic)){
                    lista4.add(s);
            }
        }
        return lista4;
    }
    public static void main(String[] args) {
        List<TopicOfInterest> topic = new ArrayList<>();
        List<String> nombres = new ArrayList<>();
        Network<NetworkManager> net = new Network<>();
        TopicOfInterest topic1 = new TopicOfInterest("furbo");
        TopicOfInterest topic2 = new TopicOfInterest("furbol");
        Matriz mapa = new Matriz();
        net.setNetworkManager(mapa);
        net.addUser("pepe",topic);
        net.addUser("jose",topic);
        net.addInterest("jose",topic1);
        net.addInterest("pepe",topic2);
        nombres=net.common(topic1);
        topic=net.compare("jose","pepe");
        System.out.println("net.getUsers() = " + nombres);


    }
}
