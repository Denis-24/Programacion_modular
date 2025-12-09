package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CubosTest {

    @Test
    void cubo() {
//        assertAll(
//                () -> assertEquals(8,Cubos.cubo(2)),
//                () -> assertEquals(30,Cubos.cubo(3)),
//                () -> assertFalse(Cubos.par(3))
//        );

        String entradasimulada  = "2";
        System.setIn(new ByteArrayInputStream(entradasimulada.getBytes()));

        ByteArrayOutputStream salida= new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));

        assertEquals(8,Cubos.cubo());

        String salidaesperada = "Inroduce un numero...";

        assertTrue(salida.toString().contains(salidaesperada));


//        assertEquals(30,Cubos.cubo());

    }
}