package aula01.exer02.questao02;

import java.util.Arrays;

public class TesteExercicios {
    public static void main(String[] args) {
        // Criando uma matéria
        Materia materiaMatematica = new Materia();
        materiaMatematica.nome = "Adição";
        materiaMatematica.serie = "1ª série";

        // Criando questões
        Questao questao1 = new Questao();
        questao1.enunciado = "Quanto é 2 + 2?";
        questao1.bimestre = 1;
        questao1.materia = materiaMatematica;
        questao1.gabarito = "4";

        Questao questao2 = new Questao();
        questao2.enunciado = "Quanto é 3 + 5?";
        questao2.bimestre = 1;
        questao2.materia = materiaMatematica;
        questao2.gabarito = "8";

        // Criando uma disciplina
        Disciplina disciplinaMatematica = new Disciplina();
        disciplinaMatematica.nome = "Matemática";
        disciplinaMatematica.listaQuestoes = Arrays.asList(questao1, questao2);

        // Criando um teste
        Teste teste = new Teste();
        teste.listaQuestoes = Arrays.asList(questao1, questao2);
        teste.dataGeracao = "27/09/2024";
        teste.disciplina = disciplinaMatematica;

        // Exibindo os detalhes do teste
        System.out.println("Disciplina: " + teste.disciplina.nome);
        System.out.println("Data de Geração: " + teste.dataGeracao);
        System.out.println("Questões do Teste:");
        for (Questao questao : teste.listaQuestoes) {
            System.out.println("Enunciado: " + questao.enunciado);
            System.out.println("Bimestre: " + questao.bimestre);
            System.out.println("Matéria: " + questao.materia.nome);
            System.out.println("Gabarito: " + questao.gabarito);
            System.out.println();
        }
    }
}

