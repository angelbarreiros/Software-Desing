package e1;

import java.util.ArrayList;
import java.util.List;

public class And  implements Operations {
    @Override
    public List<Ticket> logic(List<Ticket> list, Properties... P) {
        List<Ticket> aux;
        List<Ticket> aux2=new ArrayList<>();
        List<Ticket> aux3=new ArrayList<>();
        if (P.length==1){
            return P[0].sort(list,P[0]);
        }
        for (int i=0;i<list.size();i++){
            list.get(i).setIter(0);
        }
        for (int i=0;i<P.length;i++) {
            aux = P[i].sort(list, P[i]);
            for (int j=0;j<aux.size();j++){
                if (aux2.contains(aux.get(j))){
                     aux.get(j).setIter(aux.get(j).getIter()+1);
                    if (aux.get(j).getIter()==(P.length)-1){
                        aux3.add(aux.get(j));
                    }
                }
                else{
                  aux2.add(aux.get(j));
                }
            }
        }


      return aux3;
    }

}

