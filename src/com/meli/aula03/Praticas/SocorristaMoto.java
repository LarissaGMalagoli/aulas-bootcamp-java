package com.meli.aula03.Praticas;

public class SocorristaMoto extends Veiculo{

    public SocorristaMoto(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, 300, 2);
    }

    public void socorrer(Moto moto){
        System.out.println("Socorrendo moto " + moto.getPlaca());
    }
}
