package aula02.questao02;

import java.util.Arrays;

public class TesteExercicios {
    public static void main(String[] args) {
        // Criando uma matéria
        Materia materiaMatematica = new Materia();
        materiaMatematica.setNome("Adição");
        materiaMatematica.setSerie("1ª série");

        // Criando questões
        Questao questao1 = new Questao();
        questao1.setEnunciado("Quanto é 2 + 2?");
        questao1.setBimestre(1);
        questao1.setMateria(materiaMatematica);
        questao1.setGabarito("4");

        Questao questao2 = new Questao();
        questao2.setEnunciado("Quanto é 3 + 5?");
        questao2.setBimestre(1);
        questao2.setMateria(materiaMatematica);
        questao2.setGabarito("8");

        // Criando uma disciplina
        Disciplina disciplinaMatematica = new Disciplina();
        disciplinaMatematica.setNome("Matemática");
        disciplinaMatematica.setListaQuestoes(Arrays.asList(questao1, questao2));

        // Criando um teste
        Teste teste = new Teste();
        teste.setListaQuestoes(Arrays.asList(questao1, questao2));
        teste.setDataGeracao("30/09/2024");
        teste.setDisciplina(disciplinaMatematica);

        // Exibindo os detalhes do teste
        System.out.println("Disciplina: " + teste.getDisciplina().getNome());
        System.out.println("Data de Geração: " + teste.getDataGeracao());
        System.out.println("Questões do Teste:");
        for (Questao questao : teste.getListaQuestoes()) {
            System.out.println("Enunciado: " + questao.getEnunciado());
            System.out.println("Bimestre: " + questao.getBimestre());
            System.out.println("Matéria: " + questao.getMateria().getNome());
            System.out.println("Gabarito: " + questao.getGabarito());
            System.out.println();
        }
    }
}
