package e1;

import java.util.ArrayList;
import java.util.List;

public class Operations_And implements Operations {
    private static final Operations_And operations_and=new Operations_And();

    private Operations_And() {
    }
    public static Operations_And getOperations_and() {
        return operations_and;
    }


    @Override
    public List<Ticket> logic(List<Ticket> list, Properties... P) {
        List<Ticket> aux = new ArrayList<>();
        int cnt, t2, pos = 0;
        for (Properties i : P) {
            aux.addAll(i.sort(list));
        }
        List<Ticket> aux2 = new ArrayList<>(aux);
        for (Ticket t1 : aux) {
            if (aux.size() > pos) {
                cnt = 0;
                for (t2 = pos; t2 < aux.size(); t2++) {
                    if (aux.get(pos) == aux.get(t2)) {
                        cnt++;
                    }
                }
                if (cnt < P.length) {
                    aux2.remove(t1);
                } else {
                    pos++;
                }
            }
        }

        return aux2;

    }

}

