package e2;


import java.util.List;


public interface Dependency {
    void execute(Graph g, List<Character> l);
    List<Character> avaliables(Graph g, List<Character> list);
    Character max(List<Character> lista,Graph g);
}
