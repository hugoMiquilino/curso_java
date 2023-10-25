package controle.exercicios;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        // Criar um programa que receba um número e diga se ele é um número primo.

        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0){
                contador++;
            }
        }

        if (contador == 0) {
            System.out.printf("\nO número %d é primo", numero);
        } else {
            System.out.printf("\nO número %d NÃO é primo", numero);
        }
        sc.close();
    }
}
