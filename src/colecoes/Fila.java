package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        // .add e .offer -> Adicionam elementos na fila
        // Diferença ocorre quando a fila está cheia!
        fila.add("Ana"); // se fila estiver cheia, retorna uma exception.
        fila.offer("Bia"); // se fila estiver cheia, retorna false.
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        // .peek e .element -> Obtem o próximo elemento da fila sem remover.
        // Diferença de comportamento ocorre quando a fila está vazia!
        System.out.println(fila.peek()); // Retorna null, se fila vazia
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança exceção
        System.out.println(fila.element());

        /*
        fila.size() // lê tamanho da fila
        fila.clear() // limpa a fila
        fila.isEmpty() // verifica se fila está vazia
        fila.contains(...) // verifica se parâmetro existe na fila
         */

        // .pool e .remove -> Obtem próximo elemento da fila e remove!
        System.out.println(fila.poll()); // retorna false
        System.out.println(fila.remove()); // Lança uma exceção quando fila está vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
//        System.out.println(fila.remove());

    }
}
