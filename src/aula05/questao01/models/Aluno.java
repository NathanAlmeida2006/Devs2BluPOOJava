package aula05.questao01.models;

import aula05.questao01.interfaces.Pesquisador;

public class Aluno implements Pesquisador {
    private final String nome;
    private final String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return "Aluno";
    }
}
