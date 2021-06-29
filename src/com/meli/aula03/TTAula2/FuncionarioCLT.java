package com.meli.aula03.TTAula2;

public class FuncionarioCLT extends Funcionario{
    private String cargo;

    public FuncionarioCLT(String nome, double salario) {
        super(nome, salario);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void pagarSalario(int metaBatida, double lucros){
        switch (getCargo()){
            case "Técnico":
                setSalario(3200+(0.05)*metaBatida);
            case "Analista":
                setSalario(4000+(0.08)*metaBatida);
            case "Diretor":
                setSalario(15000+(0.03)*lucros);
            case "Gerente":
                setSalario(6000+(0.125)*metaBatida);

        }
    };

}
