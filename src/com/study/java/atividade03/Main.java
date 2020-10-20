package com.study.java.atividade03;

import com.study.java.atividade03.vetor.Vetores;

public class Main {

    public static void main(String[] args) {
        Vetores meuVetor = new Vetores();

        int[] vetor = meuVetor.iniciaVetor();
        meuVetor.inverteVetor(vetor);
    }

}
