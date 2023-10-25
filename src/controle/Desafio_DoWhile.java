package controle;

import java.util.Scanner;

public class Desafio_DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota = 0;
        double total = 0;
        int contador = 0;

        while (nota != -1) {
            System.out.print("Digite uma nota: ");
            nota = sc.nextInt();
            if (nota <= 10 && nota >= 0) {
                total += nota;
                contador++;
                System.out.println("Soma das notas: " + total + "\nContador: " + contador);
            } else if (nota != -1) {
                System.out.println("Nota inválida!!!\n");
            }
        }
        double media = total / contador;
        System.out.println("\nMédia das notas: " + media);
        sc.close();
    }
}