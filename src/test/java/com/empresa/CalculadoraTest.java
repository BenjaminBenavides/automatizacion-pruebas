package com.empresa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    void testDeSumarDosNumeros() {
        // Nueva instancia de la clase Calsculadora
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.sumar(5, 3);

        // El primer paramtro es el esperado, el segunda es una variable con el resultado real(assertEquals deben ser iguales)
        assertEquals(8, resultado);
    }

    @Test
    void testDeRestarDosNumeros() {
        // Nueva instancia de la clase Calsculadora
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.restar(10, 4);

        // El primer paramtro es el esperado, el segunda es una variable con el resultado real(assertEquals deben ser iguales)
        assertEquals(6, resultado);
    }
}