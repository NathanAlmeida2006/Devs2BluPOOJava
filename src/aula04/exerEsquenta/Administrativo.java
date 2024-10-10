package aula04.exerEsquenta;

public class Administrativo extends Assistente {
    private int cracha;

    public Administrativo(int cracha) {
        this.cracha = cracha;
    }

    public Administrativo(String nome, double salario, int numeroMatricula, int cracha) {
        super(nome, salario, numeroMatricula);
        this.cracha = cracha;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("N° do crachá: " + this.cracha);
    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }
}
