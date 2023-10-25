package fundamentos.operadores;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double media = Double.parseDouble(sc.nextLine());

        var resultadoFinal = (media >= 7.0) ? "APROVADO" : "EM RECUPERAÇÃO";

        System.out.println("O aluno está " + resultadoFinal);

        sc.close();
    }
}
