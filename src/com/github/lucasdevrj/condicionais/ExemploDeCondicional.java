package com.github.lucasdevrj.condicionais;

public class ExemploDeCondicional {
    public static void main(String[] args) {
        double salario = 2890.0;
        boolean isento = false;

        if (salario > 2259.20 && !isento) {
            double irrf = salario / 100 * 7.5;
            System.out.println("Valor IRRF = R$" + irrf);
        } else if (isento){
            System.out.println("Contribuinte isento de IRRF.");
        } else {
            System.out.println("Não há valores de IRRF.");
        }
    }
}
