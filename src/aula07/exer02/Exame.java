package aula07.exer02;

abstract public class Exame {
    protected String nomePaciente;

    public Exame(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public abstract String realizarExame();
}
