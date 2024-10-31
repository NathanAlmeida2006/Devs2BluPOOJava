package aula08.questao01;

import aula08.questao01.impls.ImpressoraAvancada;
import aula08.questao01.impls.ImpressoraBasica;

public class Main {
    public static void main(String[] args) {
        System.out.println("Impressora Básica:");
        ImpressoraBasica imp = new ImpressoraBasica();
        imp.imprimirTexto();

        System.out.println("\nImpressora Avançada:");
        ImpressoraAvancada imp2 = new ImpressoraAvancada();
        imp2.imprimirTexto();
        imp2.imprimirImagem();
        imp2.imprimirRelatorioFinanceiro();
    }
}
