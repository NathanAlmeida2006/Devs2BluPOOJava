package aula03.exer02.questao01;

public class Pagamento {
    private double valor;
    private String status;

    public Pagamento(double valor) {
        this.valor = valor;
        this.status = "Pendente";
    }

    public void efetuarPagamento() {
        this.status = "Pago";
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}