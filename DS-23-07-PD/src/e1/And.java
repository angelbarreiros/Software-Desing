package e1;

import java.util.ArrayList;
import java.util.List;

public class And  extends Operations {
    private void  iterator( Ticket t ){
        int a =t.getIter()+1;
        t.setIter(a);
    }
    @Override
    public List<Ticket> logic(List<Ticket> list, Properties... P) {
        List<Ticket> aux=new ArrayList<>();
        List<Ticket> aux2=new ArrayList<>();
        List<Ticket> aux3=new ArrayList<>();
        int k=0;
        for (int i=0;i<P.length;i++) {
            aux = P[i].sort(list, P[i]);
            for (int j=0;j<aux.size();j++){
                if (aux2.contains(aux.get(j))){
                    k++;
                    if (k==(P.length)-1){
                        aux3.add(aux.get(j));
                    }
                }
                else{
                  aux2.add(aux.get(j));
                }
            }
        }
        if (P.length==1){
            return aux2;
        }
      return aux3;
    }

}

