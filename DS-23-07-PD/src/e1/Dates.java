package e1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Dates implements Properties {

    private Date fecha;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Dates(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dates dates = (Dates) o;
        return Objects.equals(fecha, dates.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha);
    }

    @Override
    public String toString() {
        return ""+fecha;
    }

    @Override
    public List<Ticket> sort(List<Ticket> list, Properties P) {
        List<Ticket> lista1=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            if (list.get(i).getDate()==P){
                lista1.add(list.get(i));
            }
        }
        return  lista1;
    }

}
