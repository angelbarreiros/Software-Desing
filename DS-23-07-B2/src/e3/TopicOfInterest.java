package e3;

public class TopicOfInterest {
    enum TOPIC {a,b,c,d,e}
    public TopicOfInterest.TOPIC interest;

    public TopicOfInterest(TOPIC interest) {
        this.interest = interest;
    }

    public void setInterest(TOPIC interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return interest.toString();
    }


}
