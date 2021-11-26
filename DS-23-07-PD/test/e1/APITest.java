package e1;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class APITest {
    @Test
    public void ApiTest(){
        API api= new API();
        Date date = new Date(120, Calendar.JULY,12,14,30);
        Date date1 = new Date(121, Calendar.JULY,12,14,20);
        Date date2 = new Date(122, Calendar.JULY,12,14,10);
        Date date3 = new Date(123, Calendar.JULY,12,14,0);
        Dates dates=new Dates(date);
        Dates dates1=new Dates(date1);
        Dates dates2=new Dates(date2);
        Dates dates3=new Dates(date3);
        Prize prize=new Prize(100);
        Prize prize1=new Prize(80);
        Prize prize2=new Prize(50);
        Prize prize3=new Prize(20);
        Origin origin=new Origin("Lugo");
        Origin origin1=new Origin("Pontevedra");
        Origin origin2=new Origin("Vigo");
        Origin origin3=new Origin("Coruña");
        Destination destination= new Destination("Lugo");
        Destination destination1= new Destination("Pontevedra");
        Destination destination2= new Destination("Vigo");
        Destination destination3= new Destination("Coruña");
        Ticket ticket=new Ticket(dates,destination,origin,prize);
        Ticket ticket1=new Ticket(dates1,destination1,origin1,prize1);
        Ticket ticket2=new Ticket(dates2,destination2,origin2,prize2);
        Ticket ticket3=new Ticket(dates3,destination3,origin3,prize3);
        api.add(ticket);
        api.add(ticket1);
        api.add(ticket2);
        api.add(ticket3);
        And and=new And();
        Or or= new Or();
        api.sort(or,origin,origin1);
        api.sort(and,prize);
        api.reset();
        api.remove(ticket);
        System.out.println("api.toString() = " + api.toString());
    }
}