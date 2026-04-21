/**
 * Marcos está estudando geometria e precisa verificar se três lados podem formar um triângulo.
 * Para que três lados formem um triângulo, a soma de dois lados deve ser maior que o terceiro lado.
 * Ele quer um programa que receba três lados e exiba uma mensagem informando se os lados podem formar
 * um triângulo ou não.
 *
 * Com base nesse cenário, crie um programa que receba três lados e exiba uma mensagem informando se
 * os lados podem formar um triângulo ou não.
 */

package com.github.lucasdevrj.condicionais;

import java.util.Scanner;

public class VerificacaoDeTriangulos {
    public static void main(String[] args) {
        int tamanhoDoPrimeiroLado, tamanhoDoSegundoLado, tamanhoDoTerceiroLado;

        tamanhoDoPrimeiroLado = 0;
        tamanhoDoSegundoLado = 0;
        tamanhoDoTerceiroLado = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        tamanhoDoPrimeiroLado = entrada.nextInt();

        System.out.print("Digite o segundo lado: ");
        tamanhoDoSegundoLado = entrada.nextInt();

        System.out.print("Digite o terceiro lado: ");
        tamanhoDoTerceiroLado = entrada.nextInt();

        entrada.close();

        boolean formaUmTriangulo = tamanhoDoPrimeiroLado + tamanhoDoSegundoLado > tamanhoDoTerceiroLado
                && tamanhoDoTerceiroLado + tamanhoDoSegundoLado > tamanhoDoPrimeiroLado
                && tamanhoDoPrimeiroLado + tamanhoDoTerceiroLado > tamanhoDoSegundoLado;

        if (formaUmTriangulo) {
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }
    }
}
