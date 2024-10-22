package aula06.questao01.services;

import aula06.questao01.models.Conta;
import aula06.questao01.models.Transacao;

import java.util.ArrayList;
import java.util.List;

public class ContaService {
    private final List<Transacao> transacoes = new ArrayList<>();

    public void depositar(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        transacoes.add(new Transacao("Depósito de: " + valor));
    }

    public void sacar(Conta conta, double valor) {
        if (valor <= conta.getSaldo()) {
            conta.setSaldo(conta.getSaldo() - valor);
            transacoes.add(new Transacao("Saque de: " + valor));
        } else {
            transacoes.add(new Transacao("Tentativa de saque sem saldo suficiente: " + valor));
        }
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
