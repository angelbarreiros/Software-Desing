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
        ArrayList<Vivienda> lista= new ArrayList<>();
        Vivienda casa = new Vivienda(Vivienda.TIPO.COMPRAR,1231312,4,200,400,15660,180,"A CORUÑA");
        Vivienda piso =new Vivienda(Vivienda.TIPO.COMPRAR,123123124,4,200,200,15660,80,"Oleiros");
        lista.add(piso);
        lista.add(casa);
        Collections.sort(lista,prize);

    }
}