package e2;

import java.util.Comparator;

public class CompareElevator implements Comparator<Vivienda> {
    @Override
    public int compare(Vivienda o1, Vivienda o2) {
        return Boolean.compare(o1.getElevator(),o2.getElevator());
    }
}
