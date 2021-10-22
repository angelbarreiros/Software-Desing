package e1;
import e1.Residentes;
import e1.Personal;
import  e1.Docente;
import org.junit.Assert;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

class IntegranteHowartsTest {
        private final float delta = 0.0001f;

        @Test
        @org.junit.jupiter.api.Test
        void testBasic() {
                Docente teacher = new Docente("pedro", 13, "kekw", 10, Personal.tipo.Docente, Docente.asignatura.Defensa);
                assertEquals(125f, teacher.Recompensa(),delta);
                assertEquals("pedro",teacher.getNombre());
                assertEquals(Personal.tipo.Docente,teacher.getTipo());
        }
}