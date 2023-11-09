package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qntAlunos = sc.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qntNotas = sc.nextInt();

        double[][] notasDaTurma = new double[qntAlunos][qntNotas];

        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("Informe a %d° nota do aluno %d: ", j+1, i+1);
                notasDaTurma[i][j] = sc.nextDouble();
                total += notasDaTurma[i][j];
            }
        }

        double media = total / (qntAlunos * qntNotas);
        System.out.printf("MÉDIA DA TURMA: %.1f", media);

        sc.close();
    }
}
