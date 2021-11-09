package e3;


import java.util.ArrayList;
import java.util.List;

public class Network {
    private NetworkManager networkManager =null;

    public void setNetworkManager(NetworkManager networkManager) {
        this.networkManager = networkManager;
    }
    public NetworkManager getNetworkManager() {
        return networkManager;
    }
    public void addUser(String user , List<TopicOfInterest> tp ){
        networkManager.addUser(user,tp);
    }
    public List<String> getUsers(){
        return networkManager.getUsers();
    }
    public void addInterest(String user, TopicOfInterest topicofinterest){
        networkManager.addInterest(user,topicofinterest);
    }
    public void removeInterest(String user, TopicOfInterest topicOfInterest){
        networkManager.removeInterest(user,topicOfInterest);
    }
    public void removeUser(String user){
        networkManager.removeUser(user);
    }
    public List<TopicOfInterest> getInterest(){
        return  networkManager.getInterest();
    }
    public List<TopicOfInterest> getInterestUser(String user){
        return  networkManager.getInterestUser(user);
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
            if (lista1.contains(element)) {
                lista3.add(element);
            }
        }
        return  lista3;
    }


    public List<String> common (TopicOfInterest topic){
        List<String> lista4=new ArrayList<>();
        List<TopicOfInterest> lista2;
        List<String> lista3;
        lista3=getUsers();
        for (String s : lista3) {
            lista2 = getInterestUser(s);
            if (lista2.contains(topic)) {
                lista4.add(s);
            }
        }
        return lista4;
    }
    public List<String> TotalList(){
        String listavacia="[]";
        List<String> lista4=new ArrayList<>();
        List<String> lista3;
        lista3=getUsers();
        for (String s : lista3) {
            if (s!=null){
                lista4.add(s);
                if(getInterestUser(s).toString()!=null && !listavacia.equals(getInterestUser(s).toString())){
                    lista4.add(getInterestUser(s).toString());

                }

            }


        }
        return lista4;
    }
}
