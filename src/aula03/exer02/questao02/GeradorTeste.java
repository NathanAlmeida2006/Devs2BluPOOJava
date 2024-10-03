package aula03.exer02.questao02;

import java.util.Random;
import java.util.List;

public class GeradorTeste {
    private Teste teste;

    public GeradorTeste(Teste teste) {
        this.teste = teste;
    }

    public void gerar() {
        Random random = new Random();
        List<Questao> questoesDisciplina = teste.getDisciplina().getListaQuestoes();
        int numeroQuestoes = Math.min(10, questoesDisciplina.size());

        for (int i = 0; i < numeroQuestoes; i++) {
            int index = random.nextInt(questoesDisciplina.size());
            teste.getListaQuestoes().add(questoesDisciplina.get(index));
        }

        teste.setDataGeracao(java.time.LocalDate.now().toString());
    }
}