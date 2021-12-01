package e1;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class   API {
    private  List<Ticket> list=new ArrayList<>();
    private final List<Ticket> renuve=new ArrayList<>();
    public void add (Ticket t){
        list.add(t);
        renuve.add(t);
    }
    public void remove (Ticket t){
        list.remove(t);
        renuve.remove(t);
    }
    public List<Ticket> getList() {
        return list;
    }
    public void reset (){
        setList(renuve);
    }
    private  void setList(List<Ticket> list) {
        this.list = list;
    }
    public void sort(Operations O, Properties... P){
            setList(O.logic(list,P));
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        for (Ticket ticket : list) {
            sb.append(ticket);
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        e1.API api= new e1.API();
        LocalDateTime date = LocalDateTime.of(2021, Month.DECEMBER,21,20,45);
        LocalDateTime date1 = LocalDateTime.of(2022, Month.DECEMBER,21,20,45);
        LocalDateTime date2 = LocalDateTime.of(2023, Month.DECEMBER,21,20,45);
        LocalDateTime date3 = LocalDateTime.of(2024, Month.DECEMBER,21,20,45);
        Properties_Dates dates=new Properties_Dates(date);
        Properties_Dates dates1=new Properties_Dates(date1);
        Properties_Dates dates2=new Properties_Dates(date2);
        Properties_Dates dates3=new Properties_Dates(date3);
        Properties_Prize prize=new Properties_Prize(100);
        Properties_Prize prize1=new Properties_Prize(80);
        Properties_Prize prize2=new Properties_Prize(50);
        Properties_Prize prize3=new Properties_Prize(20);
        Properties_Origin origin=new Properties_Origin("Lugo");
        Properties_Origin origin1=new Properties_Origin("Pontevedra");
        Properties_Origin origin2=new Properties_Origin("Vigo");
        Properties_Origin origin3=new Properties_Origin("Coruña");
        Properties_Destination destination= new Properties_Destination("Lugo");
        Properties_Destination destination1= new Properties_Destination("Pontevedra");
        Properties_Destination destination2= new Properties_Destination("Vigo");
        Properties_Destination destination3= new Properties_Destination("Coruña");
        Ticket ticket=new Ticket(dates,destination,origin,prize);
        Ticket ticket1=new Ticket(dates1,destination1,origin1,prize1);
        Ticket ticket2=new Ticket(dates2,destination2,origin2,prize2);
        Ticket ticket3=new Ticket(dates3,destination3,origin3,prize3);
        api.add(ticket);
        api.add(ticket1);
        api.add(ticket2);
        api.add(ticket3);
        Operations_And and=new Operations_And();
        Operations_Or or= new Operations_Or();
        api.sort(and,origin1,destination1,dates3);
        System.out.println("api = " + api);
    }

}
