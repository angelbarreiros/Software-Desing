package e1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Or  implements Operations {
    public List<Ticket> logic (List<Ticket> list,Properties... P) {
        List<Ticket> aux ;
        List<Ticket> aux2 = new ArrayList<>();
        for (int i = 0; i < P.length; i++) {
            aux = P[i].sort(list, P[i]);
            for (int j = 0; j < aux.size(); j++) {
                if (!(aux2.contains(aux.get(j)))) {
                    aux2.add(aux.get(j));
                }
            }

        }
        return aux2;
    }

}
