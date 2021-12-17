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
        //Añadir a la lista
        api.add(ticket);
        api.add(ticket1);
        api.add(ticket2);
        api.add(ticket3);
        //Creacion de Operaciones
        Operations_And and=Operations_And.getOperations_and();
        Operations_Or or= Operations_Or.getOperations_or();
        //Busqueda de tickets
        api.filter(or,origin,origin1);
        //Existen solo 2 tickets con esos origenes
        assertEquals(ticket,api.getList().get(0));
        assertEquals(ticket1,api.getList().get(1));
        //SOlo existe 1 ticket
        api.filter(and,origin,destination);
        assertEquals(ticket,api.getList().get(0));
        //ya no existe ningun ticket
        api.filter(and,origin1,destination1);
        assertEquals(api.toString(),"");
        //reseteamos la lista, es decir seria como volver atrás en la página de renfe
        api.reset();
        //tras el reseteo la lista deberia quedar igual
        assertEquals(ticket,api.getList().get(0));
        assertEquals(ticket1,api.getList().get(1));
        assertEquals(ticket2,api.getList().get(2));
        assertEquals(ticket3,api.getList().get(3));
        //eliminamos un billete de la lista
        api.remove(ticket);
        //ya no existe el billete ticket asi que del or solo devolvera el ticket relacionado con el origin1
        api.filter(or,origin,origin1);
        assertNotEquals(ticket,api.getList().get(0));
        assertEquals(ticket1,api.getList().get(0));
        //reseteamos la lista
        api.reset();
        //buscamos todos los billetes con un precio menor que prize y que tengan un origen1, solo existe 1
        api.filter(and,prize,origin1);
        assertEquals(ticket1,api.getList().get(0));
        //buscamos una fecha en concreto , solo existe 1 billete, y lo comprobamos
        api.filter(and,dates1,origin1);
        assertEquals(ticket1,api.getList().get(0));
        //reseteamos la lista
        api.reset();
        //eliminamos otro ticket
        api.remove(ticket1);
        //como ya no existen ni el ticket1 ni el ticket entonces solo quedan ticket2 y ticket 3
        assertEquals(api.getList().get(0),ticket2);
        api.filter(or,prize2,destination2);
        assertEquals(api.getList().get(0),ticket2);
        assertEquals(api.getList().get(1),ticket3);
        //liminamos ticket 2
        api.remove(ticket2);
        //comprobamos el tostring de la lista de billetes y el de ticket3
        assertEquals(api.toString(),"\nTicket{date=2024-12-21T20:45, destination=Lugo, origin=A Coruña, prize=20}\n");
        api.reset();
        //comprobamos diferentes branches del algoritmo logic de cada implementacion
        api.filter(and,origin3);
        assertEquals(ticket3,api.getList().get(0));
        //reseteamos para seguir comprobando
        api.reset();
        api.filter(or,origin3);
        assertEquals(ticket3,api.getList().get(0));
        //errores
        assertThrows(IllegalArgumentException.class, () ->api.filter(null,prize,prize2));
        assertThrows(IllegalArgumentException.class, () ->api.filter(or, (Properties) null));
        assertThrows(IllegalArgumentException.class, () ->api.filter(or,null,prize,origin1));
        //hashcode
        Ticket ticket4= new Ticket(dates1,destination1,origin1,prize1);
        assertEquals(ticket1.hashCode(),ticket4.hashCode());
        //equals
        assertEquals(ticket1,ticket4);
        assertNotEquals(ticket1,ticket2);
        api.reset();

       

    }
}