package e2;
import e2.Vivienda;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlquilerTest {
    @Test
    @org.junit.jupiter.api.Test
    void TestBasic(){
        Vivienda casa=new Vivienda(Vivienda.TIPO.COMPARTIR,1213123412,1000000000,4,20000,15662,500,"A Coruña");
        casa.PrecioTotal(3,10);
        casa.PrecioAjustadoANecesidad(1,2,2);
    }
}