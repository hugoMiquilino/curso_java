package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        // Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável.
        // O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
        // e imprima se o número inserido é maior ou menor do que o número armazenado.

        Scanner sc = new Scanner(System.in);
        int continuar;
        int numeroSorteado;
        int tentativas;
        int numero;

        do {
            System.out.println("Sorteando número entre 0 e 100...\n");
            Random numeroAleatorio = new Random();
            numeroSorteado = numeroAleatorio.nextInt(101);

            System.out.println("COMEÇOU! ");
            tentativas = 10;

            do {
                System.out.printf("%d tentativas.\n", tentativas);
                numero = sc.nextInt();
                tentativas--;

                if (numero > numeroSorteado) {
                    System.out.printf("MENOS!\n");
                } else if (numero < numeroSorteado) {
                    System.out.printf("MAIS!\n");
                } else {
                    System.out.printf("PARABÉNS! Você acertou o número com %d tentativas sobrando!\n", tentativas);
                    break;
                }
            } while (tentativas != 0);

            System.out.printf("Digite -1 para sair... ");
            continuar = sc.nextInt();
        } while (continuar != -1);
        sc.close();
    }
}
