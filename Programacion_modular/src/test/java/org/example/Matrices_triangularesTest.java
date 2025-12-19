package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Matrices_triangularesTest {

    @Test
    void revision() {
        int[][] matriz = { {1, 0, 0}, {0, 2, 0}, {0, 0, 3} };
        boolean resultado = Matrices_triangulares.revision(3, matriz);
        assertTrue(resultado);

        matriz = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        resultado = Matrices_triangulares.revision(3, matriz);
        assertFalse(resultado);
    }

    @Test
    void respuesta() {
        assertAll(() -> assertEquals("SI!", Matrices_triangulares.respuesta(true)),
                () -> assertEquals("NO!", Matrices_triangulares.respuesta(false)));
    }
}