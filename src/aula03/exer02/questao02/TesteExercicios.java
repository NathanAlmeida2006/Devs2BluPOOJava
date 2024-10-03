package aula03.exer02.questao02;

public class TesteExercicios {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. Silva");
        Disciplina matematica = new Disciplina("Matemática", professor);
        professor.adicionarDisciplina(matematica);

        Materia adicao = new Materia("Adição", "1ª série");
        Questao questao1 = new Questao("Quanto é 2 + 2?", 1, adicao, "4", 5);
        Questao questao2 = new Questao("Quanto é 3 + 5?", 1, adicao, "8", 5);

        matematica.adicionarQuestao(questao1);
        matematica.adicionarQuestao(questao2);

        Teste teste = new Teste(matematica);
        teste.gerarTeste();

        System.out.println("Teste gerado para " + teste.getDisciplina().getNome());
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Data de Geração: " + teste.getDataGeracao());
        System.out.println("Questões do Teste:");
        for (Questao questao : teste.getListaQuestoes()) {
            System.out.println("- " + questao.getEnunciado() + " (Pontuação: " + questao.getPontuacao() + ")");
        }
    }
}