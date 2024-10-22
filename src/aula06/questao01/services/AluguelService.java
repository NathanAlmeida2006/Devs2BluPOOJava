package aula06.questao01.services;

import aula06.questao01.models.Livro;

public class AluguelService {

    public static void alugar(Livro livro) {
        if (!livro.isAlugado()) {
            livro.setAlugado(true);
            System.out.println("O livro " + livro.getTitulo() + " foi alugado.");
        } else {
            System.out.println("O livro " + livro.getTitulo() + " já está alugado.");
        }
    }
}
