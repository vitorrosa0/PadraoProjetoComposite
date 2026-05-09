package org.example;

public class Transacao extends ItemFinanceiro {

    private float valor;

    public Transacao(String descricao, float valor) {
        super(descricao);
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getExibicao() {
        return "Transação: " + this.getDescricao() + " - Valor: R$" + this.valor + "\n";
    }
}
