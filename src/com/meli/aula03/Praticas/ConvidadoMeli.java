package com.meli.aula03.Praticas;

public class ConvidadoMeli extends Convidado{
    private String grito = "Viva la Chiqui !!";

    public ConvidadoMeli(String nome, int idade) {
        super(nome, idade);
    }

    public String getGrito() {
        return grito;
    }
}
