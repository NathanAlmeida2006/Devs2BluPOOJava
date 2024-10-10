package aula04.exer01;

public class Normal extends Ingresso {

    public Normal() {
    }

    public Normal(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional, localizacao);
    }

    @Override
    void imprimeValor() {
        System.out.println("Valor Base: " + getValor());
    }

    @Override
    public void imprimeTipo() {
        System.out.println("Ingresso Normal!");
    }

    @Override
    public void valorTotal() {
        System.out.println("Valor Total: " + (getValor() + getValorAdicional()));
    }

    @Override
    public void mostrarDados() {
        System.out.println("Dados do Ingresso: ");
        System.out.println("Valor: " + getValor());
        System.out.println("Valor Adicional: " + getValorAdicional());
        System.out.println("Localização: " + getLocalizacao());
    }
}
