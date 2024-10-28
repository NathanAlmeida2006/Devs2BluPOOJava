package aula07.questao02.service;

import aula07.questao02.interfaces.Pagamento;

public class ProcessadorPagamento {
    private Pagamento metodoPagamento;

    public ProcessadorPagamento(Pagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public double processar(double valor) {
        return metodoPagamento.processarPagamento(valor);
    }
}