package e3;


import java.util.List;

public interface NetworkManager  {
    void addUser(String user, List<TopicOfInterest> topicOfInterest);
    void addInterest(String user,TopicOfInterest topicofinterest);
    void removeInterest(String user,TopicOfInterest topicOfInterest);
    List<String> getUsers();
    List<TopicOfInterest> getInterest();
    List<TopicOfInterest> getInterestUser(String user);
    void removeUser(String user);


}
