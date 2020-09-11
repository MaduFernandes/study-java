package com.study.java.atividade01;

public class Estagiario extends Pessoa {

    private String instituicao;
    private final Double salario = 800.00;

    public Estagiario(String nome, Integer idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    public Estagiario(String nome, Integer idade, String instituicao) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setInstituicao(instituicao);
    }

    public double getSalario() {
        return this.salario;
    }

    public String getInstituicao() {
        return this.instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
}
