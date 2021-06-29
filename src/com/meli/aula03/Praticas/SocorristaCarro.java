package com.meli.aula03.Praticas;

public class SocorristaCarro extends Veiculo{

    public SocorristaCarro(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, 1000, 4);
    }

    public void socorrer(Carro carro){
        System.out.println("Socorrendo carro " + carro.getPlaca());
    }
}
