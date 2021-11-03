package e3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map implements NetworkManager{
    HashMap<String, List<TopicOfInterest>> map = new HashMap<>();
    List<String> usuarios=new ArrayList<>();
    List<TopicOfInterest> topic =new ArrayList<>();

    @Override
    public void addUser(String user, List<TopicOfInterest> topicOfInterest) {
        map.put(user,topicOfInterest);
        usuarios.add(user);
    }

    @Override
    public void addInterest(String user, TopicOfInterest topicofinterest) {
        List<TopicOfInterest>aux;
        aux=map.get(user);
        aux.add(topicofinterest);
        map.replace(user,aux);
        topic.add(topicofinterest);
    }

    @Override
    public void removeInterest(String user, TopicOfInterest topicOfInterest) {
        List<TopicOfInterest>aux;
        aux=map.get(user);
        aux.remove(topicOfInterest);
        map.replace(user,aux);
        topic.remove(topicOfInterest);
    }

    @Override
    public List<String> getUsers() {
        return usuarios;
    }

    @Override
    public List<TopicOfInterest> getInterest() {
        return topic;
    }

    @Override
    public List<TopicOfInterest> getInterestUser(String user) {
        List<TopicOfInterest>aux;
        aux=map.get(user);
        return aux;
    }

    @Override
    public void removeUser(String user) {
        map.remove(user);
        usuarios.remove(user);
    }

}
