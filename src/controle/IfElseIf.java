package controle;

import java.util.Locale;
import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.print("Nota ( 0 - 10 ): ");
        double nota = sc.nextDouble();
        System.out.println(nota);

        if (nota > 10 || nota < 0) {
            System.out.println("Nota Inválida!");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A");
        } else if (nota >= 6.1) {
            System.out.println("Conceito B");
        } else if (nota >= 4.1) {
            System.out.println("Conceito C");
        } else if (nota >= 2.1) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }


        sc.close();
    }
}
