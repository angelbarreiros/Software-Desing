package e2;

import java.util.Comparator;

public class ComparatorLocation implements Comparator<Vivienda> {
    @Override
    public int compare(Vivienda o1, Vivienda o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getLocation(),o2.getLocation());
    }
}
