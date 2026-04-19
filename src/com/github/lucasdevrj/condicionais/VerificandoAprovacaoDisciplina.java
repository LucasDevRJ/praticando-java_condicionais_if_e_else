/**
 * Julia é professora e precisa de um programa que ajude a determinar se um aluno
 * foi aprovado na disciplina.A regra da escola é:
 *
 * O estudante é aprovado se média final é maior ou igual a 7.0.
 *
 * Se a média for entre 5.0 e 6.9, está de recuperação.
 *
 * Se for abaixo de 5.0, está reprovado.
 *
 * Crie um programa que, a partir de uma variável media, exiba a situação do estudante conforme
 * as regras da escola.
 */

package com.github.lucasdevrj.condicionais;

import java.util.Scanner;

public class VerificandoAprovacaoDisciplina {
    public static void main(String[] args) {
        double notaDoTeste, notaDaProva, mediaTotal;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Atenção!\nAs notas do teste e da prova valem de 0,0 até 10,0.");

        System.out.print("Digite a nota do teste: ");
        notaDoTeste = entrada.nextDouble();

        if (notaDoTeste < 0.0 || notaDoTeste > 10.0) {
            System.out.println("Nota inválida!");
            System.out.println("Digite um valor entre 0,0 e 10,0.");

            System.out.print("Digite a nota do teste: ");
            notaDoTeste = entrada.nextDouble();
        }

        System.out.print("Digite a nota da prova: ");
        notaDaProva = entrada.nextDouble();

        if (notaDaProva < 0.0 || notaDaProva > 10.0) {
            System.out.println("Nota inválida!");
            System.out.println("Digite um valor entre 0,0 e 10,0.");

            System.out.print("Digite a nota da prova: ");
            notaDaProva = entrada.nextDouble();
        }

        entrada.close();

        mediaTotal = (notaDoTeste + notaDaProva) / 2;

        if (mediaTotal >= 7.0) {
            System.out.printf("O estudante teve média %.1f e foi aprovado.", mediaTotal);
        } else if (mediaTotal >= 5.0) {
            System.out.printf("O estudante teve média %.1f e está de recuperação.", mediaTotal);
        } else {
            System.out.printf("O estudante teve média %.1f e foi reprovado.", mediaTotal);
        }
    }
}
