package e2;


import java.util.List;


public interface Dependency {
    void execute(Graph g, List<Character> l);
}
