package com.meli.aula03.TMAula1;
import java.util.Arrays;
import java.util.Collections;

// Exercicio 02 - Exercicio 01

public class Exercicio06 {
    public static void main(String[] args) {
        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        Arrays.sort(array);

        // Letra a
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Letra b
        Arrays.sort(array, Collections.reverseOrder());

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
