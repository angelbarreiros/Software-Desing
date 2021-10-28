package e2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class AlquilerTest {
    @Test
    @org.junit.jupiter.api.Test
    @BeforeEach
    void setUp() {
       CompareSize size=new CompareSize();
       CompareTipo tipo = new CompareTipo();
       ComparatorLocation location= new ComparatorLocation();
       ComparePrize prize =new ComparePrize();
       ComparePostalCode postal = new ComparePostalCode();
       CompareGarageNumber number=new CompareGarageNumber();
       CompareGaragePrize garage= new CompareGaragePrize();
       Idealista Idealista =new Idealista();
    }
    void TestBasic() {
        ComparePrize prize = new ComparePrize();
       Idealista idealista=new Idealista();
        Vivienda casa= new Vivienda(Vivienda.TIPO.COMPRAR,1231321,4,200,300,15446,90,"A coruña");
        idealista.add(casa);
        assertEquals("[Vivienda{tipo=COMPRAR, ReferenceNumber=1231321, GarageNumber=4, GaragePrize=200, MonthPrize=300, PostalCode=15444, Size=90, location='A coruña'}]",idealista.toString());

    }
}