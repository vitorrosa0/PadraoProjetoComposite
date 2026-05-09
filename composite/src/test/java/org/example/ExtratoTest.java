package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtratoTest {

    @Test
    void deveRetornarExibicaoConsolidadaDoExtrato() {
        Categoria investimentos = new Categoria("Investimentos");

        Categoria lazer = new Categoria("Lazer");
        Transacao cinema = new Transacao("Cinema", 50.0f);
        lazer.addItem(cinema);

        Categoria alimentacao = new Categoria("Alimentação");
        Transacao mercado = new Transacao("Mercado", 200.0f);
        Transacao padaria = new Transacao("Padaria", 15.0f);
        alimentacao.addItem(mercado);
        alimentacao.addItem(padaria);

        Categoria mesMaio = new Categoria("Maio/2026");
        mesMaio.addItem(investimentos);
        mesMaio.addItem(lazer);
        mesMaio.addItem(alimentacao);

        Extrato extrato = new Extrato();
        extrato.setConteudo(mesMaio);

        assertEquals("Categoria: Maio/2026\n" +
                "Categoria: Investimentos\n" +
                "Categoria: Lazer\n" +
                "Transação: Cinema - Valor: R$50.0\n" +
                "Categoria: Alimentação\n" +
                "Transação: Mercado - Valor: R$200.0\n" +
                "Transação: Padaria - Valor: R$15.0\n", extrato.getExtratoCompleto());
    }

    @Test
    void deveRetornarExcecaoExtratoSemConteudo() {
        try {
            Extrato extrato = new Extrato();
            extrato.getExtratoCompleto();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Extrato sem movimentação", e.getMessage());
        }
    }
}