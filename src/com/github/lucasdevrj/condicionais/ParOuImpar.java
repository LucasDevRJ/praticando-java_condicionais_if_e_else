/**
 * Ana precisa identificar se um número é par ou ímpar para um jogo que está desenvolvendo.
 * Para isso, deseja criar um programa que analisa se o número que ela definiu previamente é par ou ímpar.
 *
 * Como você ajudaria Ana a escrever um programa que determine se um número é par ou ímpar e exiba
 * o resultado corretamente?
 */

package com.github.lucasdevrj.condicionais;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        int numero, restoDaDivisao;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numero = entrada.nextInt();
        entrada.close();

        restoDaDivisao = numero % 2;

        if (restoDaDivisao == 0) {
            System.out.printf("O número %d é par.", numero);
        } else {
            System.out.printf("O número %d é ímpar.", numero);
        }
    }
}
