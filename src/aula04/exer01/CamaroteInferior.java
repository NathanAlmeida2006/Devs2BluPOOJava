package aula04.exer01;

public class CamaroteInferior extends Ingresso {

    public CamaroteInferior() {
    }

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional, localizacao);
    }

    @Override
    void imprimeValor() {
        System.out.println("Valor Base Camarote Inferior: " + getValor());
    }

    @Override
    public void imprimeTipo() {
        System.out.println("Ingresso Camarote Inferior!");
    }

    @Override
    public void valorTotal() {
        System.out.println("Valor Total Camarote Inferior: " + (getValor() + getValorAdicional()));
    }

    @Override
    public void mostrarDados() {
        System.out.println("Dados do Ingresso Camarote Inferior: ");
        System.out.println("Valor: " + getValor());
        System.out.println("Valor Adicional: " + getValorAdicional());
        System.out.println("Localização: " + getLocalizacao());
    }
}
