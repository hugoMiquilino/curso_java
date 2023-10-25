package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dan...");
                break;
            case "marrom":
                System.out.println("Sei o Tekki Shodan...");
                break;
            case "roxa":
                System.out.println("Sei o Heian Godan...");
                break;
            case "verde":
                System.out.println("Sei o Heian Yodan...");
                break;
            case "laranja":
                System.out.println("Sei o Heian Sandan...");
                break;
            case "vermelha":
                System.out.println("Sei o Heian Nidan...");
                break;
            case "amarela":
                System.out.println("Sei o Heian Shodan...");
                break;
            default:
                System.out.println("Não sei nada");
        }

        System.out.println("Fim!\n");

        int idade = 3;

        switch (idade) {
            case 3:
                System.out.println("Sabe programar");
            case 2:
                System.out.println("Sabe falar");
            case 1:
                System.out.println("Sabe andar");
            case 0:
                System.out.println("Sabe respirar");
        }
    }
}
