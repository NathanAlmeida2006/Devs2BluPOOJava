package aula08.questao01.impls;

import aula08.questao01.interfaces.ImpressoraImagem;
import aula08.questao01.interfaces.ImpressoraRelatorio;
import aula08.questao01.interfaces.ImpressoraTexto;

public class ImpressoraAvancada implements ImpressoraTexto, ImpressoraImagem, ImpressoraRelatorio {
    @Override
    public void imprimirTexto() {
        System.out.println("Imprimindo texto.");
    }

    @Override
    public void imprimirImagem() {
        System.out.println("Imprimindo imagem.");
    }

    @Override
    public void imprimirRelatorioFinanceiro() {
        System.out.println("Imprimindo relatório financeiro.");
    }
}
