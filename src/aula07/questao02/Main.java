package aula07.questao02;

import aula07.questao02.model.CartaoDeCredito;
import aula07.questao02.model.PayPal;
import aula07.questao02.model.Bitcoin;

import aula07.questao02.service.*;

public class Main {
    public static void main(String[] args) {
        double valorCompra = 100.0;

        ProcessadorPagamento processadorCC = new ProcessadorPagamento(new CartaoDeCredito());
        ProcessadorPagamento processadorPayPal = new ProcessadorPagamento(new PayPal());
        ProcessadorPagamento processadorBitcoin = new ProcessadorPagamento(new Bitcoin());

        System.out.println("Valor original compra: R$" + valorCompra);
        System.out.println("Pagamento com Cartão de Crédito: R$" + processadorCC.processar(valorCompra));
        System.out.println("Pagamento com PayPal: R$" + processadorPayPal.processar(valorCompra));
        System.out.println("Pagamento com Bitcoin: R$" + processadorBitcoin.processar(valorCompra));
    }
}