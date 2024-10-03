package aula03.exer02.questao02;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Questao> listaQuestoes;
    private Professor professor;

    public Disciplina() {
        this.listaQuestoes = new ArrayList<>();
    }

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.listaQuestoes = new ArrayList<>();
    }

    public void adicionarQuestao(Questao questao) {
        listaQuestoes.add(questao);
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}