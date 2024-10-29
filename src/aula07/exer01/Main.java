package aula07.exer01;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoCartao = new PagamentoCartao(150);
        Pagamento pagamentoPix = new PagamentoPix(900);

        processar(pagamentoCartao);
        processar(pagamentoPix);
    }

    public static void processar(Pagamento pagamento) {
        pagamento.processarPagamento();
    }
}

