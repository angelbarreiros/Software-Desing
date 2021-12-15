package e1;

import java.util.ArrayList;

import java.util.List;

public class Operations_Or implements Operations {
    public List<Ticket> logic (List<Ticket> list,Properties... P) {
        List<Ticket> aux ;
        if (P.length==1){
            return P[0].sort(list);
        }
        List<Ticket> aux2 = new ArrayList<>();
        for (int i = 0; i < P.length; i++) {
            aux = P[i].sort(list);
            for (int j = 0; j < aux.size(); j++) {
                if (!(aux2.contains(aux.get(j)))) {
                    aux2.add(aux.get(j));
                }
            }

        }
        return aux2;
    }

}
