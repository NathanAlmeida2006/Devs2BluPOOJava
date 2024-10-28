package aula07.questao01;

import aula07.questao01.model.Produto;
import aula07.questao01.service.CalculadoraDesconto;
import aula07.questao01.tipodesconto.DescontoAlimento;
import aula07.questao01.tipodesconto.DescontoMaterialEscolar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto caderno = new Produto("Caderno", 20.0);
        Produto arroz = new Produto("Arroz", 10.0);

        CalculadoraDesconto calculadoraMaterial = new CalculadoraDesconto(new DescontoMaterialEscolar());
        CalculadoraDesconto calculadoraAlimento = new CalculadoraDesconto(new DescontoAlimento());

        System.out.println("Desconto para " + caderno.getTipoProduto() + ": R$ " + calculadoraMaterial.calcularDesconto(caderno));
        System.out.println("Desconto para " + arroz.getTipoProduto() + ": R$ " + calculadoraAlimento.calcularDesconto(arroz));

        List<Produto> materiaisEscolares = new ArrayList<>();
        materiaisEscolares.add(new Produto("Lápis", 2.0));
        materiaisEscolares.add(new Produto("Borracha", 1.5));
        materiaisEscolares.add(new Produto("Caneta", 3.0));

        List<Produto> alimentos = new ArrayList<>();
        alimentos.add(new Produto("Feijão", 8.0));
        alimentos.add(new Produto("Macarrão", 5.0));
        alimentos.add(new Produto("Óleo", 12.0));

        double descontoTotalMaterial = calculadoraMaterial.calcularDescontoTotal(materiaisEscolares);
        double descontoTotalAlimentos = calculadoraAlimento.calcularDescontoTotal(alimentos);

        System.out.println("\nDesconto total para materiais escolares: R$ " + descontoTotalMaterial);
        System.out.println("Desconto total para alimentos: R$ " + descontoTotalAlimentos);
    }
}