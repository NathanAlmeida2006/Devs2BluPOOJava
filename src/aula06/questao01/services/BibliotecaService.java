package aula06.questao01.services;

import aula06.questao01.models.Livro;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaService {
    private final List<Livro> livros;

    public BibliotecaService() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void gerarRelatorioLivros() {
        for (Livro livro : livros) {
            RelatorioBibliotecaService.gerarRelatorioLivro(livro);
        }
    }

    public void mostrarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
    }
}
