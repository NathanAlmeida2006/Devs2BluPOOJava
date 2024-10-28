package aula07.questao02.model;

import aula07.questao02.interfaces.Pagamento;

public class CartaoDeCredito implements Pagamento {
    @Override
    public double processarPagamento(double valor) {
         return valor * 1.02;
    }
}