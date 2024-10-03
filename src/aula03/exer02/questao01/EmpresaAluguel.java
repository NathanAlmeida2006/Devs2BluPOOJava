package aula03.exer02.questao01;

import java.util.ArrayList;
import java.util.List;

public class EmpresaAluguel {
    private String nome;
    private List<Aluguel> alugueis;

    public EmpresaAluguel(String nome) {
        this.nome = nome;
        this.alugueis = new ArrayList<>();
    }

    public void adicionarAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }
}