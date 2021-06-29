package com.meli.aula03.TMAula2Exer2;

public class ContaCorrente {
    private double saldo;
    private String nome;
    private int numero;

    public void saque(double valor){
        if(valor<=saldo) {
            this.saldo -= valor;
        }
        else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public void deposito(double valor){
        this.saldo+=valor;
    }

    public void devolucao(double dev){
        this.saldo+=dev;
    }

    public void transferencia(double valor){
        if(valor<=saldo) {
            this.saldo -= valor;
        }
        else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public ContaCorrente(double saldo, String nome, int numero) {
        this.saldo = saldo;
        this.nome = nome;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
