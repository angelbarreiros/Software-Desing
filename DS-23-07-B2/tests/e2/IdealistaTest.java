package e2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IdealistaTest {
    List<Vivienda>lista=new ArrayList<>();
   @Test
    void testBasic() {
        Vivienda casa=new Vivienda(Vivienda.TIPO.COMPRAR,1,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        assertEquals(Vivienda.TIPO.COMPRAR,casa.getType());
        assertEquals(1,casa.getReferenceNumber());
        assertEquals(3,casa.getGarageNumber());
        assertEquals(3,casa.getBathNumbers());
        assertEquals(5,casa.getRoomsNumber());
        assertEquals(false,casa.getReadyToTakeUp());
        assertEquals(false,casa.getElevator());
        assertEquals(200,casa.getGaragePrize());
        assertEquals(2000,casa.getPrize());
        assertEquals(15172,casa.getPostalCode());
        assertEquals(2000f,casa.getSize());
        assertEquals("Oleiros",casa.getLocation());
    }

    @Test
    void testEquals(){ // REFERENCE NUMBER IS NOT TAKE INTO CONSIDERATION
        Vivienda casa1=new Vivienda(Vivienda.TIPO.COMPRAR,1,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda casa2=new Vivienda(Vivienda.TIPO.COMPRAR,1,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        assertEquals(casa1,casa2);
    }
    @Test
    void testNotEquals(){ // REFERENCE NUMBER IS NOT TAKE INTO CONSIDERATION
        Vivienda casa1=new Vivienda(Vivienda.TIPO.COMPRAR,1,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda casa2=new Vivienda(Vivienda.TIPO.COMPRAR,1,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiro");
        assertNotEquals(casa1,casa2);
    }
    @Test
    void testHashcode(){
        Vivienda casa1=new Vivienda(Vivienda.TIPO.COMPRAR,1,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda casa2=new Vivienda(Vivienda.TIPO.COMPRAR,1,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda casa3=new Vivienda(Vivienda.TIPO.COMPRAR,1,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiro");
        assertEquals(casa1.hashCode(),casa2.hashCode());
        assertNotEquals(casa3.hashCode(),casa2.hashCode());
        assertNotEquals(casa1.hashCode(),casa3.hashCode());

    }
    @Test
    void testContain(){

       Idealista idealista=new Idealista();
        Vivienda casa1=new Vivienda(Vivienda.TIPO.COMPRAR,1,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        idealista.add(casa1);
       lista=idealista.getList();
        assertTrue(lista.contains(casa1));

    }
    @Test
    void testToString(){
        Vivienda casa1=new Vivienda(Vivienda.TIPO.COMPRAR,1,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda piso=new Vivienda(Vivienda.TIPO.COMPARTIR,2,1,1,3,Boolean.TRUE,Boolean.TRUE,150,800,15660,90f,"Cambre");
        Idealista idealista=new Idealista();
        idealista.add(casa1);
        idealista.add(piso);
        assertEquals("[Vivienda{tipo=COMPRAR, ReferenceNumber=1, GarageNumber=3, BathNumbers=3, RoomsNumber=5, ReadyToTakeUp=false, Elevator=false, GaragePrize=200, MonthPrize=2000, PostalCode=15172, Size=2000.0, location='Oleiros'}, Vivienda{tipo=COMPARTIR, ReferenceNumber=2, GarageNumber=1, BathNumbers=1, RoomsNumber=3, ReadyToTakeUp=true, Elevator=true, GaragePrize=150, MonthPrize=800, PostalCode=15660, Size=90.0, location='Cambre'}]",idealista.toString());
        assertEquals("Vivienda{tipo=COMPRAR, ReferenceNumber=1, GarageNumber=3, BathNumbers=3, RoomsNumber=5, ReadyToTakeUp=false, Elevator=false, GaragePrize=200, MonthPrize=2000, PostalCode=15172, Size=2000.0, location='Oleiros'}",casa1.toString());
    }
    @Test
    void testAddOrder(){
        Idealista idealista =new Idealista();
        Vivienda casa=new Vivienda(Vivienda.TIPO.COMPRAR,3,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda piso=new Vivienda(Vivienda.TIPO.COMPARTIR,2,1,1,3,Boolean.TRUE,Boolean.TRUE,150,800,15660,90f,"Cambre");
        Vivienda chalet=new Vivienda(Vivienda.TIPO.ALQUILAR,1,4,5,8,Boolean.TRUE,Boolean.TRUE,400,5000,15008,5000f,"A Zapateira");
        idealista.add(casa);
        idealista.add(piso);
        idealista.add(chalet);
        lista=idealista.getList();
        assertEquals(casa,lista.get(0));
        assertEquals(piso,lista.get(1));
        assertEquals(chalet,lista.get(2));

    }
    @Test
    void testNaturalOrder(){
        Idealista idealista =new Idealista();
        Vivienda casa=new Vivienda(Vivienda.TIPO.COMPRAR,3,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda piso=new Vivienda(Vivienda.TIPO.COMPARTIR,2,1,1,3,Boolean.TRUE,Boolean.TRUE,150,800,15660,90f,"Cambre");
        Vivienda chalet=new Vivienda(Vivienda.TIPO.ALQUILAR,1,4,5,8,Boolean.TRUE,Boolean.TRUE,400,5000,15008,5000f,"A Zapateira");
        idealista.add(chalet);
        idealista.add(piso);
        idealista.add(casa);
        lista=idealista.getList();
        idealista.sort();
        assertEquals(chalet,lista.get(0));
        assertEquals(piso,lista.get(1));
        assertEquals(casa,lista.get(2));

    }
    @Test
    void testCompareTotalPrize(){
        Idealista idealista =new Idealista();
        CompareTotalPrize total = new CompareTotalPrize();
        Vivienda casa=new Vivienda(Vivienda.TIPO.COMPRAR,3,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda piso=new Vivienda(Vivienda.TIPO.COMPARTIR,2,1,1,3,Boolean.TRUE,Boolean.TRUE,150,800,15660,90f,"Cambre");
        Vivienda chalet=new Vivienda(Vivienda.TIPO.ALQUILAR,1,4,5,8,Boolean.TRUE,Boolean.TRUE,400,5000,15008,5000f,"A Zapateira");
        idealista.add(casa);
        idealista.add(piso);
        idealista.add(chalet);
        idealista.setComparator(total);
        lista=idealista.getList();
        idealista.sort();
        assertEquals(piso,lista.get(0));
        assertEquals(casa,lista.get(1));
        assertEquals(chalet,lista.get(2));

    }
    @Test
    void testCompareBathNumber(){
        Idealista idealista =new Idealista();
        CompareBathNumber bath=new CompareBathNumber();
        Vivienda casa=new Vivienda(Vivienda.TIPO.COMPRAR,3,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda piso=new Vivienda(Vivienda.TIPO.COMPARTIR,2,1,1,3,Boolean.TRUE,Boolean.TRUE,150,800,15660,90f,"Cambre");
        Vivienda chalet=new Vivienda(Vivienda.TIPO.ALQUILAR,1,4,5,8,Boolean.TRUE,Boolean.TRUE,400,5000,15008,5000f,"A Zapateira");
        idealista.add(casa);
        idealista.add(piso);
        idealista.add(chalet);
        idealista.setComparator(bath);
        lista=idealista.getList();
        idealista.sort();
        assertEquals(piso,lista.get(0));
        assertEquals(casa,lista.get(1));
        assertEquals(chalet,lista.get(2));

    }
    @Test
    void testCompareGarageNumber(){
        Idealista idealista =new Idealista();
        CompareGarageNumber nGrage=new CompareGarageNumber();
        Vivienda casa=new Vivienda(Vivienda.TIPO.COMPRAR,3,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda piso=new Vivienda(Vivienda.TIPO.COMPARTIR,2,1,1,3,Boolean.TRUE,Boolean.TRUE,150,800,15660,90f,"Cambre");
        Vivienda chalet=new Vivienda(Vivienda.TIPO.ALQUILAR,1,4,5,8,Boolean.TRUE,Boolean.TRUE,400,5000,15008,5000f,"A Zapateira");
        idealista.add(casa);
        idealista.add(piso);
        idealista.add(chalet);
        idealista.setComparator(nGrage);
        lista=idealista.getList();
        idealista.sort();
        assertEquals(piso,lista.get(0));
        assertEquals(casa,lista.get(1));
        assertEquals(chalet,lista.get(2));

    }
    @Test
    void testRoomsNumber(){
        Idealista idealista =new Idealista();
        CompareRoomsNumber room=new CompareRoomsNumber();
        Vivienda casa=new Vivienda(Vivienda.TIPO.COMPRAR,3,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda piso=new Vivienda(Vivienda.TIPO.COMPARTIR,2,1,1,3,Boolean.TRUE,Boolean.TRUE,150,800,15660,90f,"Cambre");
        Vivienda chalet=new Vivienda(Vivienda.TIPO.ALQUILAR,1,4,5,8,Boolean.TRUE,Boolean.TRUE,400,5000,15008,5000f,"A Zapateira");
        idealista.add(casa);
        idealista.add(piso);
        idealista.add(chalet);
        idealista.setComparator(room);
        lista=idealista.getList();
        idealista.sort();
        assertEquals(piso,lista.get(0));
        assertEquals(casa,lista.get(1));
        assertEquals(chalet,lista.get(2));

    }
    @Test
    void testReadyToTakeUp(){
        Idealista idealista =new Idealista();
        CompareReadyToTakeUp ready=new CompareReadyToTakeUp();
        Vivienda casa=new Vivienda(Vivienda.TIPO.COMPRAR,3,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda piso=new Vivienda(Vivienda.TIPO.COMPARTIR,2,1,1,3,Boolean.TRUE,Boolean.TRUE,150,800,15660,90f,"Cambre");
        Vivienda chalet=new Vivienda(Vivienda.TIPO.ALQUILAR,1,4,5,8,Boolean.TRUE,Boolean.TRUE,400,5000,15008,5000f,"A Zapateira");
        idealista.add(casa);
        idealista.add(piso);
        idealista.add(chalet);
        idealista.setComparator(ready);
        lista=idealista.getList();
        idealista.sort();
        assertEquals(casa,lista.get(0));
        assertEquals(piso,lista.get(1));
        assertEquals(chalet,lista.get(2));

    }
    @Test
    void testElevator(){
        Idealista idealista =new Idealista();
        CompareElevator elevator=new CompareElevator();
        Vivienda casa=new Vivienda(Vivienda.TIPO.COMPRAR,3,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda piso=new Vivienda(Vivienda.TIPO.COMPARTIR,2,1,1,3,Boolean.TRUE,Boolean.TRUE,150,800,15660,90f,"Cambre");
        Vivienda chalet=new Vivienda(Vivienda.TIPO.ALQUILAR,1,4,5,8,Boolean.TRUE,Boolean.TRUE,400,5000,15008,5000f,"A Zapateira");
        idealista.add(casa);
        idealista.add(piso);
        idealista.add(chalet);
        idealista.setComparator(elevator);
        lista=idealista.getList();
        idealista.sort();
        assertEquals(casa,lista.get(0));
        assertEquals(piso,lista.get(1));
        assertEquals(chalet,lista.get(2));

    }
    @Test
    void testGaragePrice(){
        Idealista idealista =new Idealista();
        CompareGaragePrize garage= new CompareGaragePrize();
        Vivienda casa=new Vivienda(Vivienda.TIPO.COMPRAR,3,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda piso=new Vivienda(Vivienda.TIPO.COMPARTIR,2,1,1,3,Boolean.TRUE,Boolean.TRUE,150,800,15660,90f,"Cambre");
        Vivienda chalet=new Vivienda(Vivienda.TIPO.ALQUILAR,1,4,5,8,Boolean.TRUE,Boolean.TRUE,400,5000,15008,5000f,"A Zapateira");
        idealista.add(casa);
        idealista.add(piso);
        idealista.add(chalet);
        idealista.setComparator(garage);
        lista=idealista.getList();
        idealista.sort();
        assertEquals(piso,lista.get(0));
        assertEquals(casa,lista.get(1));
        assertEquals(chalet,lista.get(2));

    }
    @Test
    void testPrize(){
        Idealista idealista =new Idealista();
        ComparePrize prize=new ComparePrize();
        Vivienda casa=new Vivienda(Vivienda.TIPO.COMPRAR,3,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda piso=new Vivienda(Vivienda.TIPO.COMPARTIR,2,1,1,3,Boolean.TRUE,Boolean.TRUE,150,800,15660,90f,"Cambre");
        Vivienda chalet=new Vivienda(Vivienda.TIPO.ALQUILAR,1,4,5,8,Boolean.TRUE,Boolean.TRUE,400,5000,15008,5000f,"A Zapateira");
        idealista.add(chalet);
        idealista.add(piso);
        idealista.add(casa);
        idealista.setComparator(prize);
        lista=idealista.getList();
        idealista.sort();
        assertEquals(piso,lista.get(0));
        assertEquals(casa,lista.get(1));
        assertEquals(chalet,lista.get(2));

    }
    @Test
    void testPostalCode(){
        Idealista idealista =new Idealista();
        ComparePostalCode postal = new ComparePostalCode();
        Vivienda casa=new Vivienda(Vivienda.TIPO.COMPRAR,3,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda piso=new Vivienda(Vivienda.TIPO.COMPARTIR,2,1,1,3,Boolean.TRUE,Boolean.TRUE,150,800,15660,90f,"Cambre");
        Vivienda chalet=new Vivienda(Vivienda.TIPO.ALQUILAR,1,4,5,8,Boolean.TRUE,Boolean.TRUE,400,5000,15008,5000f,"A Zapateira");
        idealista.add(chalet);
        idealista.add(piso);
        idealista.add(casa);
        idealista.setComparator(postal);
        lista=idealista.getList();
        idealista.sort();
        assertEquals(chalet,lista.get(0));
        assertEquals(casa,lista.get(1));
        assertEquals(piso,lista.get(2));

    }
    @Test
    void testLocation(){
        Idealista idealista =new Idealista();
        CompareLocation location= new CompareLocation();
        Vivienda casa=new Vivienda(Vivienda.TIPO.COMPRAR,3,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda piso=new Vivienda(Vivienda.TIPO.COMPARTIR,2,1,1,3,Boolean.TRUE,Boolean.TRUE,150,800,15660,90f,"Cambre");
        Vivienda chalet=new Vivienda(Vivienda.TIPO.ALQUILAR,1,4,5,8,Boolean.TRUE,Boolean.TRUE,400,5000,15008,5000f,"A Zapateira");
        idealista.add(chalet);
        idealista.add(piso);
        idealista.add(casa);
        idealista.setComparator(location);
        lista=idealista.getList();
        idealista.sort();
        assertEquals(chalet,lista.get(0));
        assertEquals(piso,lista.get(1));
        assertEquals(casa,lista.get(2));

    }
    @Test
    void testType(){
       Idealista idealista =new Idealista();
        CompareType type = new CompareType();
        Vivienda casa=new Vivienda(Vivienda.TIPO.COMPRAR,3,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda piso=new Vivienda(Vivienda.TIPO.COMPARTIR,2,1,1,3,Boolean.TRUE,Boolean.TRUE,150,800,15660,90f,"Cambre");
        Vivienda chalet=new Vivienda(Vivienda.TIPO.ALQUILAR,1,4,5,8,Boolean.TRUE,Boolean.TRUE,400,5000,15008,5000f,"Zapateira");
        idealista.add(chalet);
        idealista.add(piso);
        idealista.add(casa);
        idealista.setComparator(type);
        lista=idealista.getList();
        idealista.sort();
        assertEquals(chalet,lista.get(0));
        assertEquals(piso,lista.get(1));
        assertEquals(casa,lista.get(2));

    }
    @Test
    void testSize(){
        Idealista idealista =new Idealista();
        CompareSize size=new CompareSize();
        Vivienda casa=new Vivienda(Vivienda.TIPO.COMPRAR,3,3,3,5,Boolean.FALSE,Boolean.FALSE,200,2000,15172,2000f,"Oleiros");
        Vivienda piso=new Vivienda(Vivienda.TIPO.COMPARTIR,2,1,1,3,Boolean.TRUE,Boolean.TRUE,150,800,15660,90f,"Cambre");
        Vivienda chalet=new Vivienda(Vivienda.TIPO.ALQUILAR,1,4,5,8,Boolean.TRUE,Boolean.TRUE,400,5000,15008,5000f,"Zapateira");
        idealista.add(chalet);
        idealista.add(piso);
        idealista.add(casa);
        idealista.setComparator(size);
        lista=idealista.getList();
        idealista.sort();
        assertEquals(piso,lista.get(0));
        assertEquals(casa,lista.get(1));
        assertEquals(chalet,lista.get(2));


    }






}
