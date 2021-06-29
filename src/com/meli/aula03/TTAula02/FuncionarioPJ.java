package com.meli.aula03.TTAula02;

public class FuncionarioPJ extends Funcionario{

    public FuncionarioPJ(String nome, double salario) {
        super(nome, salario);
    }

    public void pagarSalario(int horas, int valor){
        setSalario(horas*valor);
    }
}
