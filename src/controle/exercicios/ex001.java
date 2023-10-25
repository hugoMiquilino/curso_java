package controle.exercicios;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        // Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int num = sc.nextInt();

        if (num >= 0 && num <= 10) {
            if(num % 2 == 0) {
                System.out.printf("Número par!\n");
            } else {
                System.out.printf("Número ímpar!\n");
            }
        } else {
            System.out.println("Número inválido");
        }
        sc.close();
    }
}
