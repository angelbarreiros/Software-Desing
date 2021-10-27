package e2;

import java.util.Comparator;

public class CompareGaragePrize implements Comparator<Vivienda> {
    @Override
    public int compare(Vivienda o1, Vivienda o2) {
        return Integer.compare(o1.getGaragePrize(),o2.getGaragePrize());
    }
}
