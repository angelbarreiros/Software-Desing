package e2;

import java.util.Comparator;

public class CompareReadyToTakeUp implements Comparator<Vivienda> {
    @Override
    public int compare(Vivienda o1, Vivienda o2) {
        return Boolean.compare(o1.getReadyToTakeUp(),o2.getReadyToTakeUp());
    }
}
