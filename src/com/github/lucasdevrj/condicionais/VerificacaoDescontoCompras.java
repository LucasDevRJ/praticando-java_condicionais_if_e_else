/*
    Marcos trabalha em uma loja e precisa verificar se um cliente tem direito a um desconto de 10%
    em sua compra. O desconto é aplicado apenas se o valor da compra for maior ou igual a R$ 100,00.
    Para isso, ele quer um programa que permita inserir o valor da compra e exiba se o desconto
    foi aplicado ou não, juntamente com o novo valor após o desconto, caso aplicável.

    Com base nesse cenário, crie um programa que receba o valor da compra e exiba uma mensagem informando
    se o desconto foi aplicado ou não.
 */

package com.github.lucasdevrj.condicionais;

import java.util.Scanner;

public class VerificacaoDescontoCompras {
    public static void main(String[] args) {
        double valorDaCompra = 0.0;
        double desconto = 0.0;
        double valorTotal = 0.0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$");
        valorDaCompra = entrada.nextDouble();

        entrada.close();

        if (valorDaCompra >= 100.00) {
            desconto = (double) 10 / 100;
        }

        valorTotal = valorDaCompra - (valorDaCompra * desconto);

        if (desconto > 0.0) {
            System.out.println("Desconto de 10% aplicado.");
            System.out.printf("Valor com o desconto: R$%.2f", valorTotal);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.printf("Valor total: R$%.2f", valorTotal);
        }
    }
}
