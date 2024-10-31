package aula08.exer01.services;

import aula08.exer01.interfaces.MecanismoArmazenamento;

public class Armazenamento {
    private final MecanismoArmazenamento mecanismo;

    public Armazenamento(MecanismoArmazenamento mecanismo) {
        this.mecanismo = mecanismo;
    }

    public void salvar(String dados) {
        mecanismo.salvarDados(dados);
    }
}
