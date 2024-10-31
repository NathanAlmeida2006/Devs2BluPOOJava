package aula08.exer01;

import aula08.exer01.impls.ArquivoTexto;
import aula08.exer01.impls.BancoDados;
import aula08.exer01.impls.Nuvem;

public class Main {
    public static void main(String[] args) {
        BancoDados bancoDados = new BancoDados();
        bancoDados.salvarDados("CPF salvo!");

        ArquivoTexto arquivoTexto = new ArquivoTexto();
        arquivoTexto.salvarDados("Nome salvo!");

        Nuvem nuvem = new Nuvem();
        nuvem.salvarDados("Idade salvo!");
    }
}
