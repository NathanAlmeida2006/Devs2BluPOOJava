package aula08.exer01.impls;

import aula08.exer01.interfaces.MecanismoArmazenamento;

public class BancoDados implements MecanismoArmazenamento {
    @Override
    public void salvarDados(String dados) {
        System.out.println("Dados salvos no Banco de Dados: " + dados);
    }
}
