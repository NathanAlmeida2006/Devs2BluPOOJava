package aula02.questao02;

import java.util.List;

public class Teste {
    private List<Questao> listaQuestoes;
    private String dataGeracao;
    private Disciplina disciplina;

    public Teste() {
    }

    public Teste(List<Questao> listaQuestoes, String dataGeracao, Disciplina disciplina) {
        this.listaQuestoes = listaQuestoes;
        this.dataGeracao = dataGeracao;
        this.disciplina = disciplina;
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