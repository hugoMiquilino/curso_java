package oo.composicao.Desafio_OO;

import java.util.ArrayList;

public class Compra {
    final ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade) {
        this.itens.add(new Item(p, quantidade));
    }

    void adicionarItem(String nome, double preco, int quantidade) {
        this.itens.add(new Item(new Produto(nome, preco), quantidade));
    }

    double obterValorTotal() {
        double total = 0.0;
        for(Item item: itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
