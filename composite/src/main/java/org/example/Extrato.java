package org.example;

public class Extrato {

    private ItemFinanceiro conteudo;

    public void setConteudo(ItemFinanceiro conteudo) {
        this.conteudo = conteudo;
    }

    public String getExtratoCompleto() {
        if (this.conteudo == null) {
            throw new NullPointerException("Extrato sem movimentação");
        }
        return this.conteudo.getExibicao();
    }
}
