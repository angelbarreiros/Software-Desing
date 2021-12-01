package e1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Properties_Dates implements Properties {

    private final LocalDateTime fecha;


    public Properties_Dates(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Properties_Dates dates = (Properties_Dates) o;
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
                if (list.get(i).getDate().equals(P)){
                    lista1.add(list.get(i));
                }
            }
            return  lista1;
        }
    }

