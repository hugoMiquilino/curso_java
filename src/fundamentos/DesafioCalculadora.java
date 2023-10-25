package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    /*
    Ler num1
    Ler num2
    + - * / %
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        double num2 = sc.nextInt();
        System.out.println("Digite um operador ( + - * / % ): ");
        String operador = sc.next();

        double resultado = operador.equals("+") ? num1 + num2 :
                operador.equals("-") ? num1 - num2 :
                        operador.equals("*") ? num1 * num2 :
                                operador.equals("/") ? num1 / num2 :
                                        operador.equals("%") ? num1 % num2 : 0;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);

        sc.close();
    }
}