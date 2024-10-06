package aula03.extra.questao01.service;

import aula03.extra.questao01.interfaces.GerenciadorLivros;
import aula03.extra.questao01.interfaces.Pesquisavel;
import aula03.extra.questao01.model.Livro;
import aula03.extra.questao01.repository.LivroRepository;

import java.util.List;
import java.util.Objects;

/**
 * Classe responsável pelos serviços da biblioteca, implementando as interfaces
 * {@code GerenciadorLivros} e {@code Pesquisavel} para gerenciar e buscar livros.
 * Ela interage com o repositório {@code LivroRepository} para realizar as operações
 * de CRUD e pesquisas.
 */
public class BibliotecaService implements GerenciadorLivros, Pesquisavel {

    // Repositório que armazena os livros da biblioteca
    private final LivroRepository repository;

    /**
     * Construtor da classe {@code BibliotecaService}.
     * Inicializa o serviço da biblioteca com o repositório de livros.
     *
     * @param repository o repositório de livros a ser utilizado pelo serviço
     * @throws NullPointerException se o repositório for nulo
     */
    public BibliotecaService(LivroRepository repository) {
        this.repository = Objects.requireNonNull(repository);
    }

    /**
     * Adiciona um livro ao repositório de livros da biblioteca.
     *
     * @param livro o livro a ser adicionado
     * @throws NullPointerException se o livro for nulo
     */
    @Override
    public void adicionar(Livro livro) {
        repository.adicionar(livro);
    }

    /**
     * Remove um livro do repositório de livros da biblioteca.
     *
     * @param livro o livro a ser removido
     * @return {@code true} se o livro foi removido com sucesso,
     *         {@code false} caso contrário
     */
    @Override
    public boolean remover(Livro livro) {
        return repository.remover(livro);
    }

    /**
     * Busca livros no repositório que contenham o título especificado.
     *
     * @param titulo o título ou parte do título a ser buscado
     * @return uma lista de livros que correspondem ao título informado,
     *         ou uma lista vazia se nenhum livro for encontrado
     */
    @Override
    public List<Livro> buscarPorTitulo(String titulo) {
        return repository.buscarPorTitulo(titulo);
    }

    /**
     * Busca um livro no repositório pelo ISBN.
     *
     * @param isbn o ISBN do livro a ser buscado
     * @return o livro com o ISBN especificado, ou {@code null} se não for encontrado
     */
    @Override
    public Livro buscarPorIsbn(String isbn) {
        return repository.buscarPorIsbn(isbn);
    }

    /**
     * Retorna o número total de livros disponíveis no repositório.
     *
     * @return o número total de livros cadastrados na biblioteca
     */
    @Override
    public int getTotalLivros() {
        return repository.getTotalLivros();
    }
}
