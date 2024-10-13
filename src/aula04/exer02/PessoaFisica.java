package aula04.exer02;

public class PessoaFisica extends Contribuinte {

    private String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, double rendaBruta, String cpf) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }

    @Override
    public double calcularImposto() {
        if (getRendaBruta() <= 1400) {
            return 0;
        } else if (getRendaBruta() <= 2100) {
            return (getRendaBruta() * 0.1) - 100;
        } else if (getRendaBruta() <= 2800) {
            return (getRendaBruta() * 0.15) - 270;
        } else if (getRendaBruta() <= 3600) {
            return (getRendaBruta() * 0.25) - 500;
        } else {
            return (getRendaBruta() * 0.3) - 700;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
