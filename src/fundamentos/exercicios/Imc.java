package fundamentos.exercicios;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura = Double.parseDouble(sc.nextLine());
        double peso = Double.parseDouble(sc.nextLine());

        double imc = peso / (Math.pow(altura, 2));

        System.out.printf("%.1f", imc);

        sc.close();
    }
}