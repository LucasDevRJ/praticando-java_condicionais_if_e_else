/**
 * João está desenvolvendo um sistema de segurança para uma empresa. Para acessar o sistema,
 * o usuário precisa fornecer:
 *
 * Um código de acesso numérico (o código correto é 2023).
 *
 * Um nível de permissão numérico (os níveis válidos são 1, 2 ou 3).
 *
 * O sistema só permitirá o acesso se:
 *
 * O código de acesso estiver correto.
 *
 * O nível de permissão for válido (1, 2 ou 3).
 *
 * Caso contrário, o acesso será negado, e o programa deve informar o motivo (código incorreto,
 * nível de permissão inválido ou ambos).
 *
 * Crie um programa que receba o código de acesso e o nível de permissão e exiba uma mensagem indicando
 * se o acesso foi permitido ou negado, além do motivo, se for o caso.
 */

package com.github.lucasdevrj.condicionais;

import java.util.Scanner;

public class VerificacaoCódigoAcessoNivelPermissao {
    public static void main(String[] args) {
        int codigoDeAcesso = 2023;
        int[] nivelDePermissao = {1, 2, 3};

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o código de acesso: ");
        int codigoDeAcessoDigitado = entrada.nextInt();

        System.out.print("Digite o nível de permissão: ");
        int nivelDePermissaoDigitado = entrada.nextInt();

        entrada.close();

        boolean codigoDeAcessoValido = codigoDeAcesso == codigoDeAcessoDigitado;
        if (codigoDeAcessoValido) {
            boolean nivelDePermissaoValido = nivelDePermissaoDigitado == nivelDePermissao[0]
                    || nivelDePermissaoDigitado == nivelDePermissao[1]
                    || nivelDePermissaoDigitado == nivelDePermissao[2];
            if (nivelDePermissaoValido) {
                System.out.println("Acesso permitido.");
                System.out.println("Bem-vindo ao sistema!");
            } else {
                System.out.println("Acesso negado.");
                System.out.println("Nível de Permissão inválido.");
            }
        } else {
            System.out.println("Acesso negado.");
            System.out.println("Código de acesso inválido.");
        }
    }
}
