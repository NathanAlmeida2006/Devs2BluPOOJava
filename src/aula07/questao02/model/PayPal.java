package aula07.questao02.model;

import aula07.questao02.interfaces.Pagamento;

public class PayPal implements Pagamento {
    @Override
    public double processarPagamento(double valor) {
        return valor * 1.05;
    }
}