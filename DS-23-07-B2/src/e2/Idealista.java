package e2;


import java.util.ArrayList;
import java.util.Comparator;


public class Idealista {
    Comparator<Vivienda> comparador=null;
    ArrayList<Vivienda> Lista=new ArrayList<>();
    public void setComparador(Comparator<Vivienda> comparador) {
        this.comparador = comparador;
    }

    public void add(Vivienda v){
        Lista.add(v);
    }

    @Override
    public String toString() {
        return  Lista.toString();
    }
}
