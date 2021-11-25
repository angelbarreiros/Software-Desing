package e1;

import java.util.ArrayList;
import java.util.List;

public class API {
    List<Ticket> list=new ArrayList<>();
    public void add (Ticket t){
        list.add(t);
    }

    public void setList(List<Ticket> list) {
        this.list = list;
    }

    public void sout() {
        for (int i=0;i<list.size();i++){
            System.out.println( list.get(i).toString()+"\n");
        }
    }
    public List<Ticket> sort(Operations O, Properties... P){
            setList(O.logic(list,P));
        return list;
    }
}
