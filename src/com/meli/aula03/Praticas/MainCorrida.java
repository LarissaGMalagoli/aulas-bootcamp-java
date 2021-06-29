package com.meli.aula03.Praticas;

import java.util.ArrayList;
import java.util.List;

public class MainCorrida {
    public static void main(String[] args) {

        Carro c1 = new Carro(60, 120, 10, "carro1");
        Carro c2 = new Carro(70, 100, 50, "carro2");
        Moto m1 = new Moto(80, 80, 20, "moto1");
        Moto m2 = new Moto(100, 70, 30, "moto2");



        List<Veiculo> corridaTeste = new ArrayList<>();
        corridaTeste.add(c1);
        corridaTeste.add(c2);
        Corrida corrida = new Corrida(10000, 1200, "corrida teste", 3, corridaTeste);

        System.out.println(corrida.toString());

        corrida.removerVeiculoPorPlaca("carro1");
        //corrida.removerVeiculo(c1);
        corrida.registrarCarro(70, 100, 50, "carro2");
        corrida.registrarMoto(80, 80, 20, "moto1");
        corrida.registrarMoto(100, 70, 30, "moto2");
        System.out.println(corrida.toString());
        corrida.socorrerCarro("moto1");
        corrida.socorrerCarro("carro2");
        corrida.socorrerMoto("moto1");
        System.out.println("Vencedor da corrida: " + corrida.defineVencedor());
    }


}
