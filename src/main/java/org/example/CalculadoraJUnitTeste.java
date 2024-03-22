package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraJUnitTeste {
    @Test
    public void testarSoma() {
        Soma calcSoma = new Soma();

        // Cenário 1: Soma de dois valores
        assertEquals(3, calcSoma.somar(1, 2));

        // Cenário 2: Soma de dois valores sendo um zero
        assertEquals(4, calcSoma.somar(4, 0));

        // Cenário 3: Soma de dois valores sendo que ambos são zero
        assertEquals(0, calcSoma.somar(0, 0));

        // Cenário 4: Soma de dois valores sendo um negativo
        assertEquals(2, calcSoma.somar(3, -1));
    }

    @Test
    public void testarSubtracao() {
        Subtracao calcSub = new Subtracao();

        // Cenário 1: Subtração de dois valores
        assertEquals(1, calcSub.subtrair(2, 1));

        // Cenário 2: Subtração de dois valores sendo um zero
        assertEquals(2, calcSub.subtrair(2, 0));

        // Cenário 3: Subtração de dois valores sendo que ambos são zero
        assertEquals(0, calcSub.subtrair(0, 0));

        // Cenário 4: Subtração de dois valores sendo um negativo
        assertEquals(2, calcSub.subtrair(1, -1));
    }

    @Test
    public void testarDivisao() {
        Divisao calcDiv = new Divisao();

        // Cenário 1: Divisão de dois valores
        assertEquals(2, calcDiv.dividir(10, 5));

        // Cenário 2: Divisão por zero
        assertEquals(Double.POSITIVE_INFINITY,calcDiv.dividir(10, 0));

        // Cenário 3: Divisão de zero por zero
        assertTrue(Double.isNaN(calcDiv.dividir(0, 0)));

        // Cenário 4: Divisão de um valor negativo
        assertEquals(-2, calcDiv.dividir(-10, 5));
    }

    @Test
    public void testarMultiplicacao() {
        Multiplicacao calcMult = new Multiplicacao();

        // Cenário 1: Multiplicação de dois valores
        assertEquals(4, calcMult.multiplicar(2, 2));

        // Cenário 2: Multiplicação por zero
        assertEquals(0, calcMult.multiplicar(2, 0));

        // Cenário 3: Multiplicar zero por zero
        assertEquals(0, calcMult.multiplicar(0, 0));

        // Cenário 4: Multiplicar um valor negativo
        assertEquals(-10, calcMult.multiplicar(10, -1));
    }
}
