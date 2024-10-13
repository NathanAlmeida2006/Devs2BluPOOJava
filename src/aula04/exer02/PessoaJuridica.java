package aula04.exer02;

public class PessoaJuridica extends Contribuinte {

    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return getRendaBruta() * 0.1;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
