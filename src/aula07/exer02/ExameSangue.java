package aula07.exer02;

public class ExameSangue extends Exame {

    public ExameSangue(String nomePaciente) {
        super(nomePaciente);
    }

    @Override
    public String realizarExame() {
        return "Exame de Sangue realizado para " + nomePaciente + ". Resultado: Hemoglobina normal.";
    }
}
