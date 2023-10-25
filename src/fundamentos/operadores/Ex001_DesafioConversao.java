package fundamentos.operadores;

import java.util.Scanner;

public class Ex001_DesafioConversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro salário: ");
        String num1 = sc.next().replace(",", ".");

        System.out.println("Informe o segundo salário: ");
        String num2 = sc.next().replace(",", ".");

        System.out.println("Informe o terceiro salário: ");
        String num3 = sc.next().replace(",", ".");

        double salario1 = Double.parseDouble(num1);
        double salario2 = Double.parseDouble(num2);
        double salario3 = Double.parseDouble(num3);

        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("A média dos salários é " + media);

        sc.close();
    }
}
