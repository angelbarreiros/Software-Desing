package e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Properties_Prize implements Properties{
    private final  int prize;

    public Properties_Prize(int prize) {
        this.prize = prize;
    }

    public int getPrize() {
        return prize;
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
    public List<Ticket> sort(List<Ticket> list) {

        List<Ticket> lista1=new ArrayList<>();
        for (int i=0;i<list.size();i++){
           if (list.get(i).getPrize().getPrize()<= this.getPrize()){
               lista1.add(list.get(i));
           }
       }
        return  lista1;
    }
}

