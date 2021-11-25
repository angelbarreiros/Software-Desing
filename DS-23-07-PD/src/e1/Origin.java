package e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Origin extends Properties {
     private String origen;

    public Origin(String origen) {
        this.origen = origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Origin origin = (Origin) o;
        return Objects.equals(origen, origin.origen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origen);
    }

    @Override
    public String toString() {
        return origen;
    }

    @Override
    public List<Ticket> sort(List<Ticket> list, Properties P) {
        List<Ticket> lista1=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            if (list.get(i).getOrigin()==P){
                lista1.add(list.get(i));
            }
        }
        return  lista1;
    }
}

