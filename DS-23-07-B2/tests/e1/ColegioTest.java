package e1;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ColegioTest {

    @BeforeAll
    static void setUp() {
        Colegio.addPersonal(new Docente("Francisco", "Miñanco", 50, 16, Docente.asignatura.Defensa));
        Colegio.addPersonal(new Docente("Julio", "Suarez", 43, 26, Docente.asignatura.Pociones));
        Colegio.addPersonal(new Docente("Laureano", "Rosales", 61, 18, Docente.asignatura.Historia));
        Colegio.addPersonal(new Docente("Laura", "Mendez", 36, 30, Docente.asignatura.Transformaciones));
        Colegio.addPersonal(new Docente("Nuria", "Casado", 36, 30, Docente.asignatura.Herbologia));
        Colegio.addPersonal(new Guardabosques("Luis", "Casas", 80, 65, true));
        Colegio.addPersonal(new Guardabosques("Andres", "Lopez", 80, 65, false));
        Colegio.addPersonal(new Conserje("Roberto", "Loureiro", 30, 23, true));
        Colegio.addPersonal(new Conserje("Carlota", "Sueiro", 30, 23, false));
        Colegio.addResidentes(new Estudiantes("Armando", "Paredes", 21, 6, Residentes.casa.Slytherin));
        Colegio.addResidentes(new Estudiantes("Joseluis", "Rodriguez", 21, 6, Residentes.casa.Hufflepuff));
        Colegio.addResidentes(new Fantasmas("Josemanuel", "Dieguez", 200, 8, Residentes.casa.Slytherin));
        Colegio.addResidentes(new Fantasmas("Miguel", "Regueira", 200, 8, Residentes.casa.Gryffindor));
    }



    @Test
    void erroresTest() {
        assertThrows(IllegalArgumentException.class, () -> new Guardabosques("Maria", "Lopez", -50, 7, true));
        assertThrows(IllegalArgumentException.class, () -> new Estudiantes("Jesus", "Ortega", 31, -4, Residentes.casa.Ravneclaw));
    }

    @Test
    void addPersonalTest() {
        assertThrows(IllegalArgumentException.class, () -> Colegio.addPersonal(new Docente("Marcos", "Ruiz", 43, 4, Docente.asignatura.Defensa)));
    }

    @Test
    void imprimirRecompensaTest() {
        String strRecompensa = """
                Francisco Miñanco (Docente de Defensa, 16):  600.0
                Julio Suarez (Docente de Pociones, 26):  1300.0
                Laureano Rosales (Docente de Historia, 18):  900.0
                Laura Mendez (Docente de Transformaciones, 30):  1500.0
                Nuria Casado (Docente de Herbologia, 30):  1500.0
                Luis Casas (Guardabosques, 65):  4875.0
                Andres Lopez (Guardabosques, 65):  4875.0
                Roberto Loureiro (Conserje, 23):  1495.0
                Carlota Sueiro (Conserje, 23):  1495.0
                Armando Paredes (estudiante de Slytherin, 6):  1080.0 galeones
                Joseluis Rodriguez (estudiante de Hufflepuff, 6):  540.0 galeones
                Josemanuel Dieguez (fantasma de Slytherin, 8):  1280.0 galeones
                Miguel Regueira (fantasma de Gryffindor, 8):  640.0 galeones
                La recompensa total del Colegio Hogwarts es de 22080.0 galeones
                """;
        assertEquals(strRecompensa, Colegio.imprimirRecompensa());
    }

    @Test
    void imprimirSalariosTest() {
        String strSalario = """
                Francisco Miñanco (Docente de Defensa, 16):  500.0 galeones
                Julio Suarez (Docente de Pociones, 26):  350.0 galeones
                Laureano Rosales (Docente de Historia, 18):  200.0 galeones
                Laura Mendez (Docente de Transformaciones, 30):  400.0 galeones
                Nuria Casado (Docente de Herbologia, 30):  250.0 galeones
                Luis Casas (Guardabosques, 65):  180.0 galeones
                Andres Lopez (Guardabosques, 65):  170.0 galeones
                Roberto Loureiro (Conserje, 23):  160.0 galeones
                Carlota Sueiro (Conserje, 23):  150.0 galeones
                El gasto de Hogwarts en personal es de 2360.0 galeones
                """;
        assertEquals(strSalario, Colegio.imprimirSalarios());
    }
}