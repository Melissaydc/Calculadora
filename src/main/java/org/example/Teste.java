package org.example;

import java.lang.*;

public class Teste {
    public static void main(String[] args) {
        // Cenário de teste: Soma
        Soma calcSoma = new Soma();
        // Cenário 1: Soma de dois valores
        int soma = calcSoma.somar(1,2);
        System.out.println(soma);
        // Cenário 2: Soma de dois valores sendo um zero
        soma = calcSoma.somar(4,0);
        System.out.println(soma);
        // Cenário 3: Soma de dois valores sendo que ambos são zero
        soma = calcSoma.somar(0,0);
        System.out.println(soma);
        // Cenário 4: Soma de dois valores sendo um negativo
        soma = calcSoma.somar(3,-1);
        System.out.println(soma);

        // Cenário de teste: Subtração
        Subtracao calcSub = new Subtracao();
        // Cenário 1: Subtração de dois valores
        int sub = calcSub.subtrair(2,1);
        System.out.println(sub);
        // Cenário 2: Subtração de dois valores sendo um zero
        sub = calcSub.subtrair(2,0);
        System.out.println(sub);
        // Cenário 3: Subtração de dois valores sendo que ambos são zero
        sub = calcSub.subtrair(0,0);
        System.out.println(sub);
        // Cenário 4: Subtração de dois valores sendo um negativo
        sub = calcSub.subtrair(1,-1);
        System.out.println(sub);

        // Cenário de teste: Divisão
        Divisao calcDiv = new Divisao();
        // Cenário 1: Divisão de dois valores
        double div = calcDiv.dividir(10,5);
        System.out.println(div);
        // Cenário 2: Divisão por zero
        div = calcDiv.dividir(10,0);
        System.out.println(div);
        // Cenário 3: Divisão de zero por zero
        div = calcDiv.dividir(0,0);
        System.out.println(div);
        // Cenário 4: Divisão de um valor negativo
        div = calcDiv.dividir(-10,5);
        System.out.println(div);

        // Cenário de teste: Multiplicação
        Multiplicacao calcMult = new Multiplicacao();
        // Cenário 1: Multiplicação de dois valores
        double mult = calcMult.multiplicar(2,2);
        System.out.println(mult);
        // Cenário 2: Multiplicação por zero
        mult = calcMult.multiplicar(2,0);
        System.out.println(mult);
        // Cenário 3: Multiplicar zero por zero
        mult = calcMult.multiplicar(0,0);
        System.out.println(mult);
        // Cenário 4: Multiplicar um valor negativo
        mult = calcMult.multiplicar(10,-1);
        System.out.println(mult);
    }
}