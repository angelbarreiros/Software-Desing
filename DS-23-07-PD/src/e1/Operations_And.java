package e1;

import java.util.ArrayList;
import java.util.List;

public class Operations_And implements Operations {
    @Override
    public List<Ticket> logic(List<Ticket> list, Properties... P) {
        List<Ticket> aux = new ArrayList<>();
        int i, t1, t2, cnt;
        for (i = 0; i < P.length; i++) {
            aux.addAll(P[i].sort(list, P[i]));
        }
        for (t1=0; t1 < aux.size(); t1++){
            cnt = 0;
            for (t2=0; t2 < aux.size(); t2++){
                if (aux.get(t1) == aux.get(t2)) {
                    cnt++;
                }
            }
            if (cnt < P.length){
                aux.remove(t1);
            }
        }
        return aux;

        /*List<Ticket> aux;
        List<Ticket> aux2=new ArrayList<>();
        List<Ticket> aux3=new ArrayList<>();

        if (P.length==1){
            return P[0].sort(list,P[0]);
        }
        for (int i=0;i<list.size();i++){
            list.get(i).getIter().reset();
        }
        for (int i=0;i<P.length;i++) {
            aux = P[i].sort(list, P[i]);
            for (int j=0;j<aux.size();j++){
                if (aux2.contains(aux.get(j))){
                     aux.get(j).getIter().sumar();
                    if (aux.get(j).getIter().getIter()==(P.length)-1){
                        aux3.add(aux.get(j));
                    }
                }
                else{
                  aux2.add(aux.get(j));
                }
            }
        }

        return aux3;
        */
    }

}
