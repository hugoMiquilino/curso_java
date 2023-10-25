package controle.exercicios;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        // Criar um programa informa se o ano atual é um ano bissexto;

        Scanner sc = new Scanner(System.in);

        int ano = sc.nextInt();

        boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0);

        if (bissexto ) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
        sc.close();
    }
}
