package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos: ");
        int qtdAlunos = entrada.nextInt();

        System.out.println("Informe a quantidade de notas por aluno: ");
        int qtdNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for(int a = 0; a < notasDaTurma.length; a++){
            for(int n = 0; n < notasDaTurma[a].length; n++){

                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = entrada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        for(double[] notasDoAluno: notasDaTurma){
            System.out.printf("\n" + Arrays.toString(notasDoAluno));
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("\n\nA média da turma é: " + media);

        entrada.close();
    }
}
