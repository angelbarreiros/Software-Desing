package e2;


import java.util.ArrayList;
import java.util.List;

public class API {
    private List<Projects> list=new ArrayList<>();
    private Orders orders=null;

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
    public void work(Orders order){

    }

    public static void main(String[] args) {
        API api=new API();
        Orders_Strong OS=new Orders_Strong();
        api.setOrders(OS);
    }
}
