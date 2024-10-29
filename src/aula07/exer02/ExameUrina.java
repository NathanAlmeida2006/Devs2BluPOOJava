package aula07.exer02;

public class ExameUrina extends Exame {

    public ExameUrina(String nomePaciente) {
        super(nomePaciente);
    }

    @Override
    public String realizarExame() {
        return "Exame de Urina realizado para " + nomePaciente + ". Resultado: Proteína ausente.";
    }
}
