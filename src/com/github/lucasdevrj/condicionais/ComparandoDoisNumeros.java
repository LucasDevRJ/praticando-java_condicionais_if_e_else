/**
 * Pedro está aprendendo Java e se deparou com um problema: ele precisa criar um programa que compare
 * dois números inteiros fornecidos pelo usuário e informe qual é o maior ou se são iguais.
 * Mas, ele está com dificuldades para implementar a lógica de comparação e exibir o resultado corretamente.
 *
 * Ajude Pedro a resolver esse problema! Crie um programa que solicite ao usuário dois números inteiros,
 * compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais.
 */

package com.github.lucasdevrj.condicionais;

import java.util.Scanner;

public class ComparandoDoisNumeros {
    public static void main(String[] args) {
        int primeiroNumero, segundoNumero;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        primeiroNumero = entrada.nextInt();

        System.out.print("Digite outro número inteiro: ");
        segundoNumero = entrada.nextInt();

        entrada.close();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O maior número é " + primeiroNumero);
        } else if (primeiroNumero == segundoNumero) {
            System.out.println("Os dois números são iguais.");
        } else {
            System.out.println("O maior número é " + segundoNumero);
        }
    }
}
