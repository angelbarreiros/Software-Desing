package e2;

import java.util.ArrayList;

public class Idealista {
    ArrayList<Vivienda> Lista=new ArrayList<>();
    public void add(Vivienda v){
        Lista.add(v);
    }

    @Override
    public String toString() {
        return " " +
                  Lista +
                ' ';
    }
}
