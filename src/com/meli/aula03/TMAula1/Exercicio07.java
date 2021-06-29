package com.meli.aula03.TMAula1;

// Exercicio 02 - Exercicio 02
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercicio07 {
    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("1.13");
        BigDecimal y = new BigDecimal("18.4");
        int data = 2021;
        while (x.compareTo(y) < 0) {
            System.out.println("Empresa X - 01/01/" + data + " - Valor da Empresa "
                    + x.setScale(2, RoundingMode.HALF_UP) + "M");
            System.out.println("Empresa Y - 01/01/" + data + " - Valor da Empresa "
                    + y.setScale(2, RoundingMode.HALF_UP) + "M");
            x = x.multiply(BigDecimal.valueOf(2.48));
            y = y.multiply(BigDecimal.valueOf(1.32));
            data++;
        }
    }
}
