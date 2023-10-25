package fundamentos.operadores;

public class Ex003_DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça ( V ou F )
        // Trabalho na quinta ( V ou F )

        boolean trabalho1 = false;
        boolean trabalho2 = false;
        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean sorvete = trabalho1 || trabalho2;
        boolean maisSaudavel = !sorvete; // Operador Unário

        System.out.println("Comprou TV 50\"? " + comprouTv50);
        System.out.println("Comprou TV 32\"? " + comprouTv32);
        System.out.println("Comprou TV 32\" e sorvete? " + sorvete);

        System.out.println("Mais saudável? " + maisSaudavel);
    }
}
