package e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ColegioTest {

    @BeforeEach
    void setUp() {
        ArrayList<Personal> arrayPersonal =new ArrayList<>();
        ArrayList<Residentes> arrayResidentes=new ArrayList<>();
        arrayPersonal.add(new Docente("paquito", "38", 50, 16, Docente.asignatura.Defensa));
    }

    @Test
    void imprimirRecompensa() {

    }

    @Test
    void main() {

    }
}