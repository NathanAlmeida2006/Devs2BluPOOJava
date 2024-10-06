package aula03.extra.questao01.interfaces;

import java.util.List;
import aula03.extra.questao01.model.Livro;

/**
 * Interface para pesquisa de livros.
 */
public interface Pesquisavel {

    /**
     * Busca livros com base no título fornecido.
     *
     * @param titulo o título do livro a ser pesquisado
     * @return uma lista de livros que correspondem ao título
     */
    List<Livro> buscarPorTitulo(String titulo);

    /**
     * Busca um livro com base no ISBN fornecido.
     *
     * @param isbn o ISBN do livro a ser pesquisado
     * @return o livro que corresponde ao ISBN, ou null se não for encontrado
     */
    Livro buscarPorIsbn(String isbn);
}