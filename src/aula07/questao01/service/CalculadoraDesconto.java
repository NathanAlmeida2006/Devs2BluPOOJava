package aula07.questao01.service;

import aula07.questao01.model.Produto;
import aula07.questao01.interfaces.Desconto;

import java.util.List;

public class CalculadoraDesconto {
    private Desconto estrategia;

    public CalculadoraDesconto(Desconto estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(Desconto estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularDesconto(Produto produto) {
        return estrategia.calcularDesconto(produto);
    }

    public double calcularDescontoTotal(List<Produto> produtos) {
        double total = 0;
        for (Produto produto : produtos) {
            total += calcularDesconto(produto);
        }
        return total;
    }
}
