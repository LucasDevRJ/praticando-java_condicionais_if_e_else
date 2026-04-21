/*
    Emerson trabalha em um banco e precisa verificar se um número digitado pelo cliente está dentro
    da faixa permitida de valores para um empréstimo, que vai de 1000 a 5000 reais.
    Crie um programa que receba um valor e exiba se ele está dentro do intervalo permitido ou não.
 */

package com.github.lucasdevrj.condicionais;

import java.util.Scanner;

public class VerificaNumeroIntervalo {
    public static void main(String[] args) {
        double valorMinimoEmprestimo = 1000.00;
        double valorMaximoEmprestimo = 5000.00;
        double valorEmprestimo = 0.00;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do empréstimo: R$");
        valorEmprestimo = entrada.nextDouble();

        entrada.close();

        boolean valorEmprestimoPermitido = valorEmprestimo >= valorMinimoEmprestimo
                && valorEmprestimo <= valorMaximoEmprestimo;

        if (valorEmprestimoPermitido) {
            System.out.printf("O valor R$%.2f está dentro do intervalo permitido para empréstimo.",
                    valorEmprestimo);
        } else {
            System.out.printf("O valor R$%.2f não está dentro do intervalo permitido para empréstimo.",
                    valorEmprestimo);
        }
    }
}
