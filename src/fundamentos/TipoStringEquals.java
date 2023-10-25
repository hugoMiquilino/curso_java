package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s = new String("2");
        System.out.println("2" == s);
        System.out.println("2".equals(s));

        Scanner sc = new Scanner(System.in);

        String i = sc.nextLine();
        System.out.println("2" == i.trim());
        System.out.println("2".equals(i));
        System.out.println("2".equals(i.trim()));

        sc.close();
    }
}
