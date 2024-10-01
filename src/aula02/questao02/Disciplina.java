package aula02.questao02;

import java.util.List;

public class Disciplina {
    private String nome;
    private List<Questao> listaQuestoes;

    public Disciplina() {
    }

    public Disciplina(String nome, List<Questao> listaQuestoes) {
        this.nome = nome;
        this.listaQuestoes = listaQuestoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Questao> getListaQuestoes() {
        return listaQuestoes;
    }

    public void setListaQuestoes(List<Questao> listaQuestoes) {
        this.listaQuestoes = listaQuestoes;
    }
}
