package aula07.exer02;

public class ExameCovid extends Exame {

    public ExameCovid(String nomePaciente) {
        super(nomePaciente);
    }

    @Override
    public String realizarExame() {
        return "Exame de Covid realizado para " + nomePaciente + ". Resultado: Positivo.";
    }
}
