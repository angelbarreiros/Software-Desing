package e1;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class APITest {
    @Test
    public void ApiTest(){
        API api= new API();
        Date date = new Date(120, Calendar.JULY,12,14,30);
        Date date1 = new Date(121, Calendar.JULY,12,14,20);
        Date date2 = new Date(122, Calendar.JULY,12,14,10);
        Date date3 = new Date(123, Calendar.JULY,12,14,0);
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
        api.sort(or,origin,origin1);
        assertEquals(ticket,api.getList().get(0));
        assertEquals(ticket1,api.getList().get(1));
        api.sort(and,origin,destination);
        assertEquals(ticket,api.getList().get(0));
        api.sort(and,origin1,destination1);
        assertEquals(api.toString(),"");
        api.reset();
        assertEquals(ticket,api.getList().get(0));
        assertEquals(ticket1,api.getList().get(1));
        assertEquals(ticket2,api.getList().get(2));
        assertEquals(ticket3,api.getList().get(3));
        api.remove(ticket);
        api.sort(or,origin,origin1);
        assertNotEquals(ticket,api.getList().get(0));
        assertEquals(ticket1,api.getList().get(0));
        api.reset();
        api.sort(and,prize,origin1);
        assertEquals(ticket1,api.getList().get(0));
        api.sort(and,dates1,origin1);
        assertEquals(ticket1,api.getList().get(0));
        api.reset();
        api.remove(ticket1);
        assertEquals(api.getList().get(0),ticket2);
        api.sort(or,prize2,destination2);
        assertEquals(api.getList().get(0),ticket2);
        assertEquals(api.getList().get(1),ticket3);
        api.remove(ticket2);
        assertEquals(api.toString(),"\nTicket{date=Wed Jul 12 14:00:00 CEST 2023, destination=Coruña, origin=Coruña, prize=20}\n\n");


       

    }
}