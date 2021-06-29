package com.meli.aula03.TMAula2Exer2;

public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fracao adicionar(Fracao f1, Fracao f2){
        return new Fracao(f1.getNumerador()*f2.getDenominador()+f2.getNumerador()*f1.getDenominador(),f1.getDenominador()*f2.getDenominador());
    }

    public Fracao subtrair(Fracao f1, Fracao f2){
        return new Fracao(f1.getNumerador()*f2.getDenominador()-f2.getNumerador()*f1.getDenominador(),f1.getDenominador()*f2.getDenominador());
    }

    public Fracao multiplicar(Fracao f1, Fracao f2){
        return new Fracao(f1.getNumerador()*f2.getNumerador(),f1.getDenominador()*f2.getDenominador());
    }

    public Fracao dividir(Fracao f1, Fracao f2){
        return new Fracao(f1.getNumerador()*f2.getDenominador(),f1.getDenominador()*f2.getNumerador());
    }

    public Fracao adicionar(Fracao f1, int numero){
        return new Fracao(f1.getNumerador()+numero*f1.getDenominador(),f1.getDenominador());
    }

    public Fracao subtrair(Fracao f1, int numero){
        return new Fracao(f1.getNumerador()-numero*f1.getDenominador(),f1.getDenominador());
    }

    public Fracao multiplicar(Fracao f1, int numero){
        return new Fracao(f1.getNumerador()*numero,f1.getDenominador());
    }

    public Fracao dividir(Fracao f1, int numero){
        return new Fracao(f1.getNumerador(),f1.getDenominador()*numero);
    }

    public String toString() {
        return "Fracao{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
}
