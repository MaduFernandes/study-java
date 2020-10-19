package com.study.java.atividade03.vetor;

import java.util.Scanner;

public class Vetores {

    public static int[] iniciaVetor(){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanhoVetor = input.nextInt();

        if (tamanhoVetor == 0 ) {
            System.out.println("Por favor informar um valor válido.");
        }
        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe um valor: ");
            vetor[i] = input.nextInt();
        }
        return vetor;
    }

    public static void inverteVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

}

