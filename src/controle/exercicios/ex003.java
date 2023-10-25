package controle.exercicios;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        // Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0
        // imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
        // caso contrário imprime no console "Reprovado".

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite as notas do aluno: ");
        String[] notas = sc.nextLine().split(" ");
        double nota1 = Double.parseDouble(notas[0]);
        double nota2 = Double.parseDouble(notas[1]);
        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.printf("nota: %.1f%nAPROVADO!", media);
        } else if (media >= 4) {
            System.out.printf("nota: %.1f%nRECUPERAÇÃO!", media);
        } else {
            System.out.printf("nota: %.1f%nREPROVADO!", media);
        }
        sc.close();
    }
}
