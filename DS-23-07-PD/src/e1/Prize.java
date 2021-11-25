package e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Prize extends Properties{
    private  int prize;

    public Prize(int prize) {
        this.prize = prize;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prize prize1 = (Prize) o;
        return prize == prize1.prize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(prize);
    }

    @Override
    public String toString() {
        return ""+prize ;
    }

    @Override
    public List<Ticket> sort(List<Ticket> list ,Properties p) {
        List<Ticket> lista1=new ArrayList<>();
        for (int i=0;i<list.size();i++){
           if (list.get(i).getPrize()==p){
               lista1.add(list.get(i));
           }
       }
        return  lista1;
    }
}

