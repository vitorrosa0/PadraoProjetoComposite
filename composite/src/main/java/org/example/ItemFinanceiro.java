package org.example;

public abstract class ItemFinanceiro {

    private String descricao;

    public ItemFinanceiro(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getExibicao();
}