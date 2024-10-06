package aula03.extra.questao01.repository;

import aula03.extra.questao01.model.Livro;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Classe responsável por gerenciar o repositório de livros. Armazena, busca,
 * remove e lista os livros através de um {@code Map} de ISBN para {@code Livro}.
 */
public class LivroRepository {

    // Mapa que armazena os livros com o ISBN como chave
    private final Map<String, Livro> livros = new HashMap<>();

    /**
     * Adiciona um livro ao repositório.
     *
     * @param livro o livro a ser adicionado, não pode ser nulo
     * @throws NullPointerException se o livro for nulo
     */
    public void adicionar(Livro livro) {
        Objects.requireNonNull(livro, "Livro não pode ser nulo");
        livros.put(livro.getIsbn(), livro);
    }

    /**
     * Remove um livro do repositório.
     *
     * @param livro o livro a ser removido, não pode ser nulo
     * @return {@code true} se o livro foi removido com sucesso,
     *         {@code false} se o livro não estiver presente
     */
    public boolean remover(Livro livro) {
        if (livro == null) return false;
        return livros.remove(livro.getIsbn()) != null;
    }

    /**
     * Busca uma lista de livros que possuem o título informado.
     * A busca não diferencia maiúsculas de minúsculas.
     *
     * @param titulo o título ou parte do título a ser buscado
     * @return uma lista de livros cujo título contém o termo informado,
     *         ou uma lista vazia se nenhum livro for encontrado
     */
    public List<Livro> buscarPorTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            return Collections.emptyList();
        }

        return livros.values().stream()
                .filter(l -> l.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                .collect(Collectors.toList());
    }

    /**
     * Busca um livro pelo ISBN.
     *
     * @param isbn o ISBN do livro a ser buscado
     * @return o livro com o ISBN informado, ou {@code null} se não for encontrado
     */
    public Livro buscarPorIsbn(String isbn) {
        if (isbn == null || isbn.trim().isEmpty()) {
            return null;
        }
        return livros.get(isbn);
    }

    /**
     * Retorna uma lista de todos os livros no repositório.
     *
     * @return uma lista de todos os livros cadastrados
     */
    public List<Livro> listarTodos() {
        return new ArrayList<>(livros.values());
    }

    /**
     * Retorna o total de livros cadastrados no repositório.
     *
     * @return o número total de livros no repositório
     */
    public int getTotalLivros() {
        return livros.size();
    }
}
