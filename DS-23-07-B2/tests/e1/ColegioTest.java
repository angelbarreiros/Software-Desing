package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ColegioTest {

    private ArrayList<Personal> arrayPersonal =new ArrayList<>();
    private ArrayList<Residentes> arrayResidentes=new ArrayList<>();
    private String strRecompensa = "paquito 38 (Docente de Defensa, 16):  600.0\n" +
            "Luis Cacas (Guardabosques, 65):  4875.0\n" +
            "Roberto Loureiro (Conserje, 23):  1495.0\n" +
            "Joseluis Rodriguez Zapatero (Estudiantes de Hufflepuff, 6):  540.0 galeones\n" +
            "Josemanuel Dieguez (Fantasmas de Slytherin, 8):  1280.0 galeones\n" +
            "La recompensa total del Colegio Hogwarts es de 8790.0 galeones\n";

    private String strSalario = "paquito 38 (Docente de Defensa, 16):  500.0 galeones\n" +
            "Luis Cacas (Guardabosques, 65):  180.0 galeones\n" +
            "Roberto Loureiro (Conserje, 23):  150.0 galeones\n" +
            "El gasto de Hogwarts en personal es de 830.0 galeones\n";

    @BeforeEach
    void setUp() {
        arrayPersonal.add(new Docente("paquito", "38", 50, 16, Docente.asignatura.Defensa));
        arrayPersonal.add(new Guardabosques("Luis", "Cacas", 80, 65, true));
        arrayPersonal.add(new Conserje("Roberto", "Loureiro", 30, 23, false));
        arrayResidentes.add(new Residentes("Joseluis", "Rodriguez Zapatero", 21, 6, Residentes.tipo.Estudiantes, Residentes.casa.Hufflepuff));
        arrayResidentes.add(new Residentes("Josemanuel", "Dieguez", 200, 8, Residentes.tipo.Fantasmas, Residentes.casa.Slytherin));
 }

    @Test
    void imprimirRecompensa() {
        assertEquals(strRecompensa, Colegio.imprimirRecompensa(arrayPersonal, arrayResidentes));
    }

    @Test
    void imprimirSalarios() {
        assertEquals(strSalario, Colegio.imprimirSalarios(arrayPersonal));
    }

    @Test
    void main() {

    }

}