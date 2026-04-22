/*
    Maria trabalha em um banco de sangue e precisa verificar se um doador é compatível para doar sangue.
     Para ser compatível, o doador deve atender aos seguintes critérios:

    Ter entre 18 e 65 anos.

    Pesar mais de 50 kg.

    Ela deseja um programa que receba a idade e o peso do doador e informe se ele é compatível para doar
    sangue. Se não for, o programa deve indicar qual critério não foi atendido.

    Como você criaria um programa que receba a idade e o peso do doador e exiba uma mensagem indicando se
    ele é compatível ou não, além de informar o critério não atendido, se for o caso?
 */

package com.github.lucasdevrj.condicionais;

import java.util.Scanner;

public class VerificacaoCompatibilidadeDoacaoSangue {
    public static void main(String[] args) {
        int idadeMinimaDoador = 18;
        int idadeMaximaDoador = 65;
        double pesoMinimoDoador = 50.00;
        int idadeDoador = 0;
        double pesoDoador = 0.0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade do doador: ");
        idadeDoador = entrada.nextInt();

        System.out.print("Digite o peso do doador (em kg): ");
        pesoDoador = entrada.nextDouble();

        entrada.close();

        boolean idadeValidaDoacao = idadeDoador >= idadeMinimaDoador && idadeDoador <= idadeMaximaDoador;
        boolean pesoValidoDoacao = pesoDoador > pesoMinimoDoador;

        if (!idadeValidaDoacao || !pesoValidoDoacao) {
            System.out.println("O doador não é compatível.");
            String motivo = idadeValidaDoacao ? "Motivo: Deve pesar mais de 50 kg."
                    :  "Motivo: Deve ter entre 18 e 65 anos.";
            System.out.println(motivo);
        } else {
            System.out.println("O doador é compatível.");
        }
    }
}
