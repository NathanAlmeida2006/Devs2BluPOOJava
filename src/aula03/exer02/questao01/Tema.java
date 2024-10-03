package aula03.exer02.questao01;

import java.util.ArrayList;
import java.util.List;

public class Tema {
    private String nome;
    private List<String> listaItens;
    private double valorAluguel;
    private String corToalha;
    private List<ItemDecoracao> itensDecoracao;

    public Tema() {
        this.itensDecoracao = new ArrayList<>();
    }

    public Tema(String nome, List<String> listaItens, double valorAluguel, String corToalha) {
        this.nome = nome;
        this.listaItens = listaItens;
        this.valorAluguel = valorAluguel;
        this.corToalha = corToalha;
        this.itensDecoracao = new ArrayList<>();
    }

    public void adicionarItemDecoracao(ItemDecoracao item) {
        itensDecoracao.add(item);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<String> listaItens) {
        this.listaItens = listaItens;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getCorToalha() {
        return corToalha;
    }

    public void setCorToalha(String corToalha) {
        this.corToalha = corToalha;
    }

    public List<ItemDecoracao> getItensDecoracao() {
        return itensDecoracao;
    }

    public void setItensDecoracao(List<ItemDecoracao> itensDecoracao) {
        this.itensDecoracao = itensDecoracao;
    }

    // Getters e setters
}