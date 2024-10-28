package aula06.questao02.services;

import aula06.questao02.models.Conta;
import aula06.questao02.models.Transacao;

import java.util.List;

public class RelatorioContaService {

    public static void gerarRelatorioSaldo(Conta conta) {
        System.out.println("Relatório de Saldo");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo atual: " + conta.getSaldo());
    }

    public static void gerarRelatorioTransacoes(List<Transacao> transacoes) {
        System.out.println("Relatório de Transações");
        for (Transacao transacao : transacoes) {
            System.out.println(transacao.getDescricao());
        }
    }
}
