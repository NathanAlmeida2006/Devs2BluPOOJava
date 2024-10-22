package aula06.questao01.services;

import aula06.questao01.models.Livro;

public class RelatorioBibliotecaService {

    public static void gerarRelatorioLivro(Livro livro) {
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Status: " + (livro.isAlugado() ? "Alugado" : "Disponível"));
    }
}
