package aula03.exer01.questao01;

import java.util.ArrayList;

public class Agenda {
    private  String nome;
    private  ArrayList<Contato> contatos;

    public Agenda() {
    }

    public Agenda(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public String listarTodos() {
        StringBuilder sb = new StringBuilder();
        for (Contato contato : contatos) {
            // Converte o contato atual para uma string e adiciona ao StringBuilder
            sb.append(contato.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }
}