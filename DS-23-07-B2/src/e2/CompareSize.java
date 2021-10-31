package e2;

import java.util.Comparator;

public class CompareSize implements Comparator<Vivienda> {


    @Override
    public int compare(Vivienda o1, Vivienda o2) {
        return Float.compare(o1.getSize(),o2.getSize());
    }
}
