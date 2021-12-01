package e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Properties_Destination implements Properties {
    private final String destination;



    public Properties_Destination(String destination) {
        this.destination = destination;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Properties_Destination that = (Properties_Destination) o;
        return Objects.equals(destination, that.destination);
    }

    @Override
    public String toString() {
        return destination;
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination);
    }

    @Override
    public List<Ticket> sort(List<Ticket> list, Properties P) {
        List<Ticket> lista1=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            if (list.get(i).getDestination().equals(P)){
                lista1.add(list.get(i));
            }
        }
        return  lista1;
    }
}
