package com.study.java.atividade01;

public class Pessoa {

    private String nome;
    private Integer idade;

    private final Double valorFerias = 1.33;

    public void dadosPessoais() {

        Estagiario estagiario = new Estagiario("Maria Eduarda", 19);

        System.out.println("Nome: " + estagiario.getNome());
        System.out.println("Idade: " + estagiario.getIdade());
        System.out.println("Instituição: " + estagiario.getInstituicao());
        System.out.println(estagiario.getSalarioFerias(estagiario.getSalario()));

        Gerente gerente = new Gerente("Odilon", 24);

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Idade: " + gerente.getIdade());
        System.out.println("Endereço: " + gerente.getEndereco());
        System.out.println(gerente.getSalarioFerias(gerente.getSalario()));
    }

    public double getSalarioFerias(Double salario) {
        return (salario * valorFerias);
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
