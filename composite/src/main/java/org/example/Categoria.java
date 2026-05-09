package org.example;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends ItemFinanceiro {

    private List<ItemFinanceiro> itens;

    public Categoria(String descricao) {
        super(descricao);
        this.itens = new ArrayList<>();
    }

    public void addItem(ItemFinanceiro item) {
        this.itens.add(item);
    }

    public String getExibicao() {
        String saida = "";
        saida = "Categoria: " + this.getDescricao() + "\n";
        for (ItemFinanceiro item : itens) {
            saida += item.getExibicao();
        }
        return saida;
    }
}