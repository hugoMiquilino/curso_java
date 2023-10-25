package controle;

public class Desafio_For {
    public static void main(String[] args) {
        String valor = "#";
        for (int i = 0; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }

        /*
        Versão do Desafio
            Não pode usar valor numérico para controlar o laço!

         */

        for(String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}
