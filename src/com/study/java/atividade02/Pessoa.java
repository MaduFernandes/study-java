package com.study.java.atividade02;

import java.util.Calendar;

public class Pessoa {

    private String nome;
    private Integer anoNascimento;
    private Double altura;

    public Pessoa(Integer anoNascimento, Double altura, String nome) {
        this.setAnoNascimento(anoNascimento);
        this.setAltura(altura);
        this.setNome(nome);
    }

    public int calculaIdade() {
        int idade = pegaAnoAtual() - getAnoNascimento();
        return idade;
    }

    public int pegaAnoAtual() {
        Calendar hoje = Calendar.getInstance();
        return hoje.get(Calendar.YEAR);
    }

    public void dadosPessoais() {
        Pessoa pessoa = new Pessoa(2001, 1.69, "Maria Eduarda");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Idade: " + pessoa.calculaIdade());
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoNascimento() {
        return this.anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Double getAltura() {
        return this.altura;
    }

    private void setAltura(Double altura) {
        this.altura = altura;
    }
}
