package e2;

import java.util.Comparator;

public class CompareGarageNumber implements Comparator<Vivienda> {
    @Override
    public int compare(Vivienda o1, Vivienda o2) {
        return o1.getGarageNumber()-o2.getGarageNumber();
    }
}
