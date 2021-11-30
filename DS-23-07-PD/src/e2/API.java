package e2;


import java.util.ArrayList;
import java.util.List;

public class API {
    private List<Projects> list=new ArrayList<>();
    private Orders orders=null;

    public API(List<Projects> list, Orders orders) {
        this.list = list;
        this.orders = orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
    public List<Projects> exec(){
        return orders.work();
    }
}
