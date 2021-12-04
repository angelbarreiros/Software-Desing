package e1;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class API1Test {
    @Test
    public void ApiTest(){
        //Creacion de Api
        API api= new API();
        //Creacion de atributos de los tickets
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
        Properties_Origin origin1=new Properties_Origin("A coruña");
        Properties_Origin origin2=new Properties_Origin("Vigo");
        Properties_Origin origin3=new Properties_Origin("A Coruña");
        Properties_Destination destination= new Properties_Destination("A Coruña");
        Properties_Destination destination1= new Properties_Destination("Pontevedra");
        Properties_Destination destination2= new Properties_Destination("A Coruña");
        Properties_Destination destination3= new Properties_Destination("Lugo");
        //Creacion de tickets
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
        //Busqueda de tickets
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
        assertEquals(api.toString(),"\nTicket{date=2024-12-21T20:45, destination=Lugo, origin=A Coruña, prize=20}\n\n");




       

    }
}