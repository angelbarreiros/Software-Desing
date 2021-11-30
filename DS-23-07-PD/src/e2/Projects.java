package e2;

public class Projects {
    private final char name;

    public Projects(char name) {
        this.name = name;
    }

    public char getName() {
        return name;

    }

    @Override
    public String toString() {
        return "Projects{" +
                "name=" + name +
                '}';
    }
}
