package controle.exercicios;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        // Refatorar o exercício 04, utilizando a estrutura switch.

        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }

        switch (contador) {
            case 0:
                System.out.printf("\nO número %d é primo.", numero);
                break;
            default:
                System.out.printf("\nO número %d NÃO é primo.", numero);
        }
        sc.close();
    }
}
