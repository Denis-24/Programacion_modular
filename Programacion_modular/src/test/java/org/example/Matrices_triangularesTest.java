package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Matrices_triangularesTest {

    @Test
    void revision() {
        //cre una matriz la cual vamos a usar para hacer las distintas pruebas.
        int[][] matriz = { {1, 0, 0}, {0, 2, 0}, {0, 0, 3} };
        //llamo a revcision y le inserto un 3 al tamayo, depues inserto la matriz creada anteriormente y el resultado de true o false lo guardo en un boolean, el cual despues compruebo si es la salida que yo me estaba esperando.
        boolean resultado = Matrices_triangulares.revision(3, matriz);
        assertTrue(resultado);

        matriz = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        resultado = Matrices_triangulares.revision(3, matriz);
        assertFalse(resultado);
    }

    @Test
    void respuesta() {
        //llamo a respuesta y le inserto un booleano igual a true, el cual miro si al meter el booleano true me devuelve el mensaje que debe.
        assertAll(() -> assertEquals("SI!", Matrices_triangulares.respuesta(true)),
                //llamo a respuesta y le inserto un booleano igual a true, el cual miro si al meter el booleano false me devuelve el mensaje que debe.
                () -> assertEquals("NO!", Matrices_triangulares.respuesta(false)));
    }
}