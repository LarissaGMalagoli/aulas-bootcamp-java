package com.meli.aula03.TMAula3;

public class Pessoa implements Precedente<Pessoa>{
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public int precedeA(Pessoa pessoa) {
        return 0;
    }
}
