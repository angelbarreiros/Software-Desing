package e1;
import java.util.ArrayList;
import java.util.List;

public class   API {
    private List<Ticket> list = new ArrayList<>();
    private final List<Ticket> renuve = new ArrayList<>();
    public void add(Ticket t) {
        list.add(t);
        renuve.add(t);
    }

    public void remove(Ticket t) {
        list.remove(t);
        renuve.remove(t);
    }

    public List<Ticket> getList() {
        return list;
    }

    public void reset() {
        list.clear();
        list.addAll(renuve);
    }

    private void setList(List<Ticket> list) {
        this.list = list;
    }

    public void filter(Operations O, Properties... P) {
        if(O==null){
            throw new IllegalArgumentException();
        }
        for (Properties properties : P) {
            if (properties == null) {
                throw new IllegalArgumentException();
            }
        }
        setList(O.logic(list, P));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Ticket ticket : list) {
            sb.append(ticket);

        }

        return sb.toString();
    }
}