package aula04.exer01;

abstract public class Ingresso {
    private double valor;
    private double valorAdicional;
    private String localizacao;

    public Ingresso() {
    }

    public Ingresso(double valor, double valorAdicional, String localizacao) {
        this.valor = valor;
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    }

    abstract void imprimeValor();

    abstract public void imprimeTipo();

    abstract public void valorTotal();

    abstract public void mostrarDados();


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
