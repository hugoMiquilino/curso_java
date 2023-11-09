package arrays;

import java.util.Scanner;

public class Desafio_For {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas notas serão adicionadas? ");
        int indice = sc.nextInt();
        double[] notas = new double[indice];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Insira a nota %d: ", i+1);
            notas[i] = sc.nextDouble();
        }

        double total = 0;
        for (double nota: notas) {
            total += nota;
        }

        System.out.printf("MÉDIA DO ALUNO: %.1f", total / notas.length);

        sc.close();
    }
}
