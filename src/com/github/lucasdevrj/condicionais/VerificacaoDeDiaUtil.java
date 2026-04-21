/*
     Carlos trabalha em uma empresa de logística que opera apenas de segunda a sexta,
     sem atividades nos finais de semana. Para evitar confusões, ele precisa de um programa que,
     ao receber um dia da semana, informe se é um dia útil ou não.

    Crie um programa que receba um dia da semana (em letras minúsculas) e exiba uma mensagem
    indicando se é um dia útil ou não.
 */

package com.github.lucasdevrj.condicionais;

import java.util.Scanner;

public class VerificacaoDeDiaUtil {
    public static void main(String[] args) {
        String diaDaSemana = "";

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        diaDaSemana = entrada.next();

        entrada.close();

        diaDaSemana = diaDaSemana.toLowerCase();

        if (diaDaSemana.contains("segunda") || diaDaSemana.contains("terça") || diaDaSemana.contains("quarta")
                || diaDaSemana.contains("quinta") || diaDaSemana.contains("sexta")) {
            diaDaSemana = diaDaSemana.substring(0, 1).toUpperCase() + diaDaSemana.substring(1);
            System.out.printf("%s é um dia útil.", diaDaSemana);
        } else if (diaDaSemana.contains("sábado") || diaDaSemana.contains("domingo")) {
            diaDaSemana = diaDaSemana.substring(0, 1).toUpperCase() + diaDaSemana.substring(1);
            System.out.printf("%s não é um dia útil.", diaDaSemana);
        } else {
            System.out.println("Digite um dia da semana, exemplo: segunda-feira ou só segunda.");
        }
    }
}
