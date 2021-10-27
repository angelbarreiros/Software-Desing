package e2;

import java.util.Comparator;

public class CompareTipo implements Comparator<Vivienda> {
    @Override
    public int compare(Vivienda o1, Vivienda o2) {
        return Integer.compare(o1.getTipo().compareTo(o2.getTipo()), 0);
    }
}
