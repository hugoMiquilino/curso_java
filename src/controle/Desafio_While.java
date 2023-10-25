package controle;

import java.util.Scanner;

public class Desafio_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";

        while(!s.equalsIgnoreCase("sair")) {
            System.out.print("Digite: ");
            s = sc.nextLine();
        }
        sc.close();
    }
}
