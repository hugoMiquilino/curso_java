package classe.Desafio_Pessoa;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Lasanha", 3.34);
        Comida c2 = new Comida("Suco", 1.5);

        Pessoa p = new Pessoa("Hugo", 100.0);

        System.out.println(p.apresentar());

        p.Comer(c1);
        p.Comer(c2);

        System.out.println(p.apresentar());
    }
}
