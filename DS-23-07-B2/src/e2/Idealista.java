package e2;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;


public class Idealista {
    private Comparator<Vivienda> comparator =null;
    ArrayList<Vivienda> list =new ArrayList<>();
    public void setComparator(Comparator<Vivienda> comparator) {
        this.comparator = comparator;
    }

    public void add(Vivienda v){
        list.add(v);
    }

    public Comparator<Vivienda> getComparator() {
        return comparator;
    }

    @Override
    public String toString() {
        return  list.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Idealista idealista = (Idealista) o;
        return Objects.equals(comparator, idealista.comparator) && Objects.equals(list, idealista.list);
    }

}
