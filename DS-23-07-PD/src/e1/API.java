package e1;

import java.util.ArrayList;
import java.util.List;

public class API {
    private  List<Ticket> list=new ArrayList<>();
    private final List<Ticket> renuve=new ArrayList<>();
    public void add (Ticket t){
        list.add(t);
        renuve.add(t);
    }
    public void remove (Ticket t){
        list.remove(t);
        renuve.remove(t);
    }

    public void setList(List<Ticket> list) {
        this.list = list;
    }
    public void reset (){
        setList(renuve);
    }

    public List<Ticket> sort(Operations O, Properties... P){
            setList(O.logic(list,P));
        return list;
    }

    @Override
    public String toString() {
        return "API{" +
                  list +
                '}';
    }
}
