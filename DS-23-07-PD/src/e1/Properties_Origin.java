package e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Properties_Origin implements Properties {
     private final String origen;

    public Properties_Origin(String origen) {
        this.origen = origen;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Properties_Origin origin = (Properties_Origin) o;
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
    public List<Ticket> sort(List<Ticket> list) {
        List<Ticket> lista1=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            if (list.get(i).getOrigin().equals(this)){
                lista1.add(list.get(i));
            }
        }
        return  lista1;
    }
}

