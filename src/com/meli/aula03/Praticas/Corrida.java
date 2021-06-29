package com.meli.aula03.Praticas;

import java.util.List;

public class Corrida {
    private int distancia;
    private double premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;
    SocorristaMoto sosm = new SocorristaMoto(70, 100, 50, "socorrista moto");
    SocorristaCarro sosc = new SocorristaCarro(70, 100, 50, "socorrista carro");

    public Corrida(int distancia, double premioEmDolares, String nome, int quantidadeVeiculosPermitidos, List<Veiculo> listaVeiculos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.listaVeiculos = listaVeiculos;
    }

    public void registrarCarro(double velocidade, double aceleracao, double anguloDeGiro, String patente){
        if(this.listaVeiculos.size() <= this.quantidadeVeiculosPermitidos){
            Carro c1 = new Carro(velocidade, aceleracao, anguloDeGiro, patente);
            listaVeiculos.add(c1);
        }
    }

    public void registrarMoto(double velocidade, double aceleracao, double anguloDeGiro, String patente){
        if(this.listaVeiculos.size() <= this.quantidadeVeiculosPermitidos){
            Moto m1 = new Moto(velocidade, aceleracao, anguloDeGiro, patente);
            listaVeiculos.add(m1);
        }
    }

    public void removerVeiculo(Veiculo veiculo){
        System.out.println("Veiculo de Placa: " + veiculo.getPlaca() + " removido!");
        listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa){

        for(Veiculo v : listaVeiculos) {

            if(v.getPlaca().equals(placa)){
                System.out.println("Veiculo de Placa: " + placa + " removido!");
                listaVeiculos.remove(v);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "distancia=" + distancia +
                ", premioEmDolares=" + premioEmDolares +
                ", nome='" + nome + '\'' +
                ", quantidadeVeiculosPermitidos=" + quantidadeVeiculosPermitidos +
                ", listaVeiculos=" + listaVeiculos +
                '}';
    }

    public Veiculo defineVencedor(){
        Veiculo vencedor = listaVeiculos.get(0);
        for(Veiculo v : listaVeiculos) {
            if(v.valorMaximo()>vencedor.valorMaximo()) {
                vencedor = v;
            }
        }
        return vencedor;
    }

    public void socorrerCarro(String documento){
        for(Veiculo v : listaVeiculos) {

            if(v.getPlaca().equals(documento)){
                if(v instanceof Carro){
                   sosc.socorrer((Carro)v);
                }
                else{
                    System.out.println("Erro! O veículo não é um carro");
                }
                break;
            }
        }
    }

    public void socorrerMoto(String documento){
        boolean naoAchou=true;
        for(Veiculo v : listaVeiculos) {

            if(v.getPlaca().equals(documento)){
                if(v instanceof Moto){
                    sosm.socorrer((Moto)v);

                }
                else{
                    System.out.println("Erro! O veículo não é uma moto");

                }
                naoAchou=false;
                break;
            }
        }
        if (naoAchou==true){
            System.out.println("Erro! Veículo não cadastrado!");
        }
    }
}
