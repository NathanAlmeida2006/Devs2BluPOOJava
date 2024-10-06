package aula03.extra.questao01.interfaces;

import aula03.extra.questao01.model.Livro;

/**
 * Interface para gerenciar a coleção de livros.
 */
public interface GerenciadorLivros {

    /**
     * Adiciona um livro à coleção.
     *
     * @param livro o livro a ser adicionado
     */
    void adicionar(Livro livro);

    /**
     * Remove um livro da coleção.
     *
     * @param livro o livro a ser removido
     * @return true se o livro foi removido com sucesso, false caso contrário
     */
    boolean remover(Livro livro);

    /**
     * Retorna o total de livros na coleção.
     *
     * @return o número total de livros
     */
    int getTotalLivros();
}
