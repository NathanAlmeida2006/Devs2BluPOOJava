package aula04.exer01;

public class CamaroteSuperior extends Ingresso {

    public CamaroteSuperior() {
    }

    public CamaroteSuperior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional, localizacao);
    }

    @Override
    void imprimeValor() {
        System.out.println("Valor Base Camarote Superior: " + getValor());
    }

    @Override
    public void imprimeTipo() {
        System.out.println("Ingresso Camarote Superior!");
    }

    @Override
    public void valorTotal() {
        System.out.println("Valor Total Camarote Superior: " + (getValor() + getValorAdicional()));
    }

    @Override
    public void mostrarDados() {
        System.out.println("Dados do Ingresso Camarote Superior: ");
        System.out.println("Valor: " + getValor());
        System.out.println("Valor Adicional: " + getValorAdicional());
        System.out.println("Localização: " + getLocalizacao());
    }
}
