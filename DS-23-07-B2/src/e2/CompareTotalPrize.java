package e2;

import java.util.Comparator;

public class CompareTotalPrize  implements Comparator<Vivienda> {
    @Override
    public int compare(Vivienda o1, Vivienda o2) {
        int v1=o1.getGarageNumber()*o1.getGaragePrize()+o1.getPrize();
        int v2 =o2.getGarageNumber()*o2.getGaragePrize()+o2.getPrize();
        return Integer.compare(v1,v2);
    }

}
