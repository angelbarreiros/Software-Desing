package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ColegioTest {

    private final List<Personal> arrayPersonal =new ArrayList<>();
    private final  List<Residentes> arrayResidentes=new ArrayList<>();

    @BeforeEach
    void setUp() {
        arrayPersonal.add(new Docente("Paquito", "38", 50, 16, Docente.asignatura.Defensa));
        arrayPersonal.add(new Docente("Julio", "Suarez", 43, 26, Docente.asignatura.Pociones));
        arrayPersonal.add(new Docente("Laureano", "Rosales", 61, 18, Docente.asignatura.Historia));
        arrayPersonal.add(new Docente("Laura", "Mendez", 36, 30, Docente.asignatura.Transformaciones));
        arrayPersonal.add(new Docente("Nuria", "Casado", 36, 30, Docente.asignatura.Herbologia));
        arrayPersonal.add(new Guardabosques("Luis", "Casas", 80, 65, true));
        arrayPersonal.add(new Guardabosques("Andres", "Lopez", 80, 65, false));
        arrayPersonal.add(new Conserje("Roberto", "Loureiro", 30, 23, true));
        arrayPersonal.add(new Conserje("Carlota", "Sueiro", 30, 23, false));
        arrayResidentes.add(new Estudiantes("Joseluis", "Rodriguez Zapatero", 21, 6, Residentes.casa.Slytherin));
        arrayResidentes.add(new Estudiantes("Joseluis", "Rodriguez Zapatero", 21, 6, Residentes.casa.Hufflepuff));
        arrayResidentes.add(new Fantasmas("Josemanuel", "Dieguez", 200, 8, Residentes.casa.Slytherin));
        arrayResidentes.add(new Fantasmas("Josemanuel", "Dieguez", 200, 8, Residentes.casa.Gryffindor));
    }

    @Test
    void TestErrores() {
        assertThrows(IllegalArgumentException.class, () -> new Docente("Maria", "Lopez", -50, 7, Docente.asignatura.Herbologia));
        assertThrows(IllegalArgumentException.class, () -> new Estudiantes("Jesus", "Ortega", 31, -4, Residentes.casa.Ravneclaw));
    }

    @Test
    void imprimirRecompensa() {
        String strRecompensa = """
                Paquito 38 (Docente de Defensa, 16):  600.0
                Julio Suarez (Docente de Pociones, 26):  1300.0
                Laureano Rosales (Docente de Historia, 18):  900.0
                Laura Mendez (Docente de Transformaciones, 30):  1500.0
                Nuria Casado (Docente de Herbologia, 30):  1500.0
                Luis Casas (Guardabosques, 65):  4875.0
                Andres Lopez (Guardabosques, 65):  4875.0
                Roberto Loureiro (Conserje, 23):  1495.0
                Carlota Sueiro (Conserje, 23):  1495.0
                Joseluis Rodriguez Zapatero (estudiante de Slytherin, 6):  1080.0 galeones
                Joseluis Rodriguez Zapatero (estudiante de Hufflepuff, 6):  540.0 galeones
                Josemanuel Dieguez (fantasma de Slytherin, 8):  1280.0 galeones
                Josemanuel Dieguez (fantasma de Gryffindor, 8):  640.0 galeones
                La recompensa total del Colegio Hogwarts es de 22080.0 galeones
                """;
        assertEquals(strRecompensa, Colegio.imprimirRecompensa(arrayPersonal, arrayResidentes));
    }

    @Test
    void imprimirSalarios() {
        String strSalario = """
                Paquito 38 (Docente de Defensa, 16):  500.0 galeones
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
        assertEquals(strSalario, Colegio.imprimirSalarios(arrayPersonal));
    }
}