package e3;

import java.util.Objects;

public record TopicOfInterest(String topic) {

    @Override
    public String toString() {
        return topic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TopicOfInterest that = (TopicOfInterest) o;
        return Objects.equals(topic, that.topic);
    }


}
