package com.study.java.atividade03.vetor;

import java.util.Scanner;

public class Vetores {

    private Integer vet;
    private Integer vetPreenchido;

    public Integer[] initVetor() {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, informe um valor: ");
        vet = input.nextInt();

        if(vet == 0) {
            System.out.println("Por favor, informar um valor válido");
            vet = input.nextInt();
        }

        Integer vet1[] = new Integer[vet];

        for (int i = 0; i <= vet1.length; i++) {
            System.out.println(i + " Informe um valor");
            vetPreenchido = input.nextInt();
            vet1[i] = vetPreenchido;
        }
        return vet1;
    }
}

