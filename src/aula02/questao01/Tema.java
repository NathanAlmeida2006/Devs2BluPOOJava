package aula02.questao01;

import java.util.List;

public class Tema {
    private String nome;
    private List<String> listaItens;
    private double valorAluguel;
    private String corToalha;

    public Tema() {
    }

    public Tema(String nome, List<String> listaItens, double valorAluguel, String corToalha) {
        this.nome = nome;
        this.listaItens = listaItens;
        this.valorAluguel = valorAluguel;
        this.corToalha = corToalha;
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
}
