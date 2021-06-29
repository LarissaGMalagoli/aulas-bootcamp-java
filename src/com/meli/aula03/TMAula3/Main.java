package com.meli.aula03.TMAula3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("ariana", "123456-00");
        Pessoa p2 = new Pessoa("taylor", "7891011-12");
        Pessoa p3 = new Pessoa("demetria", "9876543-32");

        Pessoa[] pessoas = {p1, p2, p3};


        System.out.println(Arrays.toString(pessoas));

        SortUtil.sort(pessoas);

        System.out.println(Arrays.toString(pessoas));

        Celular c2 = new Celular("67891011", "maria");
        Celular c1 = new Celular("12345", "joao");
        Celular c3 = new Celular("987654323", "ana");

        Celular[] celulares = {c2, c1, c3};


        System.out.println(Arrays.toString(celulares));

        SortUtil.sort(celulares);

        System.out.println(Arrays.toString(celulares));

    }
}
