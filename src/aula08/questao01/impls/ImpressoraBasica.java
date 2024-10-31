package aula08.questao01.impls;

import aula08.questao01.interfaces.ImpressoraTexto;

public class ImpressoraBasica implements ImpressoraTexto {
    @Override
    public void imprimirTexto() {
        System.out.println("Imprimindo texto.");
    }
}
