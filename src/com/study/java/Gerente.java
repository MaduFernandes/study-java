package com.study.java;

public class Gerente extends Pessoa{

    private String endereco;
    private final Double salario = 12000.00;

    public Gerente(String nome, Integer idade) {
        this.setIdade(idade);
        this.setNome(nome);
    }

    public Gerente(String nome, Integer idade, String endereco) {
        this.setIdade(idade);
        this.setNome(nome);
        this.setEndereco(endereco);
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return this.salario;
    }

}
