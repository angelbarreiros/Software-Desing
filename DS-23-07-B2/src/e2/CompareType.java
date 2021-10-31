package e2;

import java.util.Comparator;


public class CompareType implements Comparator<Vivienda> {
    @Override
    public int compare(Vivienda o1, Vivienda o2) {
        return Integer.compare(o1.getType().compareTo(o2.getType()), 0);
    }
}
