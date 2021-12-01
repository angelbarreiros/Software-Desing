package e1;

import java.util.ArrayList;
import java.util.List;

public class Operations_And implements Operations {
    @Override
    public List<Ticket> logic(List<Ticket> list, Properties... P) {
        List<Ticket> aux = new ArrayList<>();
        List<Ticket> aux2 = new ArrayList<>();
        int cnt, len, pos = 0;
        for (Properties i:P) {
            aux.addAll(i.sort(list, i));
        }
        aux2.addAll(aux);
        for (Ticket t1: aux){
            if(aux.size() > pos) {
                cnt = 0;
                for (Ticket t2: aux) {
                    if (aux.get(pos) == t2) {
                        cnt++;
                    }
                }
                if (cnt < P.length) {
                    aux2.remove(t1);
                }else{pos ++;}
            }
        }
        return aux2;

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

