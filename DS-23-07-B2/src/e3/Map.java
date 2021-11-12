package e3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Map implements NetworkManager{
    private final LinkedHashMap<String, List<TopicOfInterest>> map = new LinkedHashMap<>();
    private final List<String> usuarios=new ArrayList<>();
    private final List<TopicOfInterest> topic =new ArrayList<>();

    @Override
    public void addUser(String user, List<TopicOfInterest> topicOfInterest) {
        if (topicOfInterest==null){
            throw new IllegalArgumentException();
        }
        map.put(user,topicOfInterest);
        usuarios.add(user);
        topic.addAll(topicOfInterest);
    }

    @Override
    public void addInterest(String user, TopicOfInterest topicofinterest) {
        if (topicofinterest==null){
            throw  new IllegalArgumentException();
        }
        else if(user==null){
            throw new IllegalArgumentException();
        }
        List<TopicOfInterest>aux;
        if (map.get(user)!=null){
            aux=map.get(user);
            aux.add(topicofinterest);
            map.put(user,aux);
            topic.add(topicofinterest);
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void removeInterest(String user, TopicOfInterest topicOfInterest) {
        if (user==null){
            throw new IllegalArgumentException();
        }
        else if (topicOfInterest==null){
            throw  new IllegalArgumentException();
        }
        List<TopicOfInterest>aux;
        if (map.get(user)!=null){

            aux=map.get(user);
            aux.remove(topicOfInterest);
            map.replace(user,aux);
            topic.remove(topicOfInterest);
        }
        else{
            throw new IllegalArgumentException();
        }

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
        if (user==null){
            throw  new IllegalArgumentException();
        }
        List<TopicOfInterest>aux;
        aux=map.get(user);
        return aux;
    }

    @Override
    public void removeUser(String user) {
        if (user==null){
            throw new IllegalArgumentException();
        }
        List<TopicOfInterest>aux;
        if (map.get(user)!=null){
            aux=map.get(user);
            for (TopicOfInterest topicOfInterest : aux) {
                topic.remove(topicOfInterest);
            }
        }
        map.remove(user);
        usuarios.remove(user);

    }
}
