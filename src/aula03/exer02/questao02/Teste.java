package aula03.exer02.questao02;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    private List<Questao> listaQuestoes;
    private String dataGeracao;
    private Disciplina disciplina;
    private GeradorTeste geradorTeste;

    public Teste(Disciplina disciplina) {
        this.disciplina = disciplina;
        this.listaQuestoes = new ArrayList<>();
        this.geradorTeste = new GeradorTeste(this);
    }

    public void gerarTeste() {
        this.geradorTeste.gerar();
    }

    public List<Questao> getListaQuestoes() {
        return listaQuestoes;
    }

    public void setListaQuestoes(List<Questao> listaQuestoes) {
        this.listaQuestoes = listaQuestoes;
    }

    public String getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(String dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}