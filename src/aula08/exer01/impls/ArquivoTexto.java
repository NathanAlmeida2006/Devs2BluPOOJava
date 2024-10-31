package aula08.exer01.impls;

import aula08.exer01.interfaces.MecanismoArmazenamento;

public class ArquivoTexto implements MecanismoArmazenamento {
    @Override
    public void salvarDados(String dados) {
        System.out.println("Dados salvos em Arquivo de Texto: " + dados);
    }
}
