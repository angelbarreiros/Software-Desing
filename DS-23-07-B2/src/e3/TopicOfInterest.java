package e3;

public class TopicOfInterest {
    String topic;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public TopicOfInterest(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return  topic;
    }
}
