package e2;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private char job;
    private  List<Edges> edge;

    public Node(char job) {
        this.job = job;
    }

    public char getJob() {
        return job;
    }

    public void setJob(char job) {
        this.job = job;
    }

    public List<Edges> getEdge() {
        return edge;
    }
    public void addEdge(Edges edges) {
        if (edge == null) {
            edge = new ArrayList<>();
        }
        edge.add(edges);
    }
    @Override
    public String toString() {
        return "\n \tNode [city=" + job + ", edges=" + edge + "]";
    }
}
