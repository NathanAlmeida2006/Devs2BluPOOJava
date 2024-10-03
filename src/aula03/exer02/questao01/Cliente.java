package aula03.exer02.questao01;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String telefone;
    private List<Aluguel> historicoAlugueis;

    public Cliente() {
        this.historicoAlugueis = new ArrayList<>();
    }

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.historicoAlugueis = new ArrayList<>();
    }

    public void adicionarAluguel(Aluguel aluguel) {
        historicoAlugueis.add(aluguel);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Aluguel> getHistoricoAlugueis() {
        return historicoAlugueis;
    }
}