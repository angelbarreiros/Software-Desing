package e1;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

class IntegranteHowartsTest {
        private final float delta = 0.0001f;

        @Test
        @org.junit.jupiter.api.Test
        public void testBasic() {
                Docente teacher = new Docente("pedro", "kekw",13,  10, Personal.tipo.Docente, Docente.asignatura.Defensa);
                assertEquals(125f, teacher.Recompensa(),delta);
                assertEquals("pedro",teacher.getNombre());
                assertEquals(Personal.tipo.Docente,teacher.getTipo());
        }
}