package aula04.exer01;

public class VIP extends Ingresso {

    public VIP() {
    }

    public VIP(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional, localizacao);
    }

    @Override
    void imprimeValor() {
        System.out.println("Valor Base VIP: " + getValor());
    }

    @Override
    public void imprimeTipo() {
        System.out.println("Ingresso VIP!");
    }

    @Override
    public void valorTotal() {
        System.out.println("Valor Total VIP: " + (getValor() + getValorAdicional()));
    }

    @Override
    public void mostrarDados() {
        System.out.println("Dados do Ingresso VIP: ");
        System.out.println("Valor: " + getValor());
        System.out.println("Valor Adicional: " + getValorAdicional());
        System.out.println("Localização: " + getLocalizacao());
    }
}
