package com.meli.aula03.Praticas;

import java.util.*;

public class MainVestuario {
    public static void main(String[] args) {
        GuardaRoupa armario = new GuardaRoupa();
        Vestuario v1 = new Vestuario("renner", "blusa");
        Vestuario v2 = new Vestuario("cea", "meia");
        Vestuario v3 = new Vestuario("hollister", "moletom");
        Vestuario v4 = new Vestuario("riachuelo", "sapato");
        Vestuario v5 = new Vestuario("abercrombie", "calca");
        Vestuario v6 = new Vestuario("renner", "vestido");

        List<Vestuario> teste1 = new ArrayList<>();
        teste1.add(v1);
        teste1.add(v2);
        Integer codigo = armario.guardarVestuarios(teste1);

        System.out.println("Código: " + codigo);

        armario.mostrarVestuarios();

        List<Vestuario> teste2 = new ArrayList<>();
        teste2 = armario.devolverVestuarios(codigo);

        for(Vestuario l : teste2) {
            System.out.println(l.getModelo() + " " + l.getMarca());
        }
    }
}
