package aula04.exerEsquenta;

public class Tecnico extends Assistente {
    private String cargo;

    public Tecnico(String cargo) {
        this.cargo = cargo;
    }

    public Tecnico(String nome, double salario, int numeroMatricula, String cargo) {
        super(nome, salario, numeroMatricula);
        this.cargo = cargo;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: " + this.cargo);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
