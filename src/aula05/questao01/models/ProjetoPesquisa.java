package aula05.questao01.models;

import aula05.questao01.interfaces.Pesquisador;

import java.util.ArrayList;
import java.util.List;

public class ProjetoPesquisa {
    private final String codigo;
    private final String titulo;
    private final String dataDeInicio;
    private final String dataDeFim;
    private final Professor professorResponsavel;
    private final List<Pesquisador> equipe;

    public ProjetoPesquisa(String codigo, String titulo, String dataDeInicio, String dataDeFim, Professor professorResponsavel) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.dataDeInicio = dataDeInicio;
        this.dataDeFim = dataDeFim;
        this.professorResponsavel = professorResponsavel;
        this.equipe = new ArrayList<>();
    }

    public void adicionarPesquisador(Pesquisador pesquisador) {
        equipe.add(pesquisador);
    }

    public String getCodigo() {
        return codigo;
    }

    public void exibirDados() {
        System.out.println("\nDados do Projeto:");
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Data de Início: " + dataDeInicio);
        System.out.println("Data de Fim: " + dataDeFim);
        System.out.println("Professor Responsável: " + professorResponsavel.getNome());
        System.out.println("\nEquipe do Projeto:");
        for (Pesquisador p : equipe) {
            System.out.println("Nome: " + p.getNome() + " - Tipo: " + p.getTipo());
        }
    }
}