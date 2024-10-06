package aula03.extra.questao01.model;

import java.time.LocalDate;
import java.util.*;

/**
 * Representa um livro, incluindo título, ISBN, data de publicação, autores e categoria.
 */
public class Livro {

    private final String isbn;
    private String titulo;
    private LocalDate dataPublicacao;
    private Categoria categoria;
    private final Set<Autor> autores;

    /**
     * Constrói um Livro com os dados fornecidos.
     *
     * @param isbn o ISBN único do livro
     * @param titulo o título do livro
     * @param dataPublicacao a data de publicação do livro
     * @param categoria a categoria do livro
     */
    public Livro(String isbn, String titulo, LocalDate dataPublicacao, Categoria categoria) {
        this.isbn = Objects.requireNonNull(isbn, "ISBN não pode ser nulo");
        this.titulo = Objects.requireNonNull(titulo, "Título não pode ser nulo");
        this.dataPublicacao = Objects.requireNonNull(dataPublicacao, "Data de publicação não pode ser nula");
        this.categoria = Objects.requireNonNull(categoria, "Categoria não pode ser nula");
        this.autores = new HashSet<>();
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = Objects.requireNonNull(titulo, "Título não pode ser nulo");
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = Objects.requireNonNull(dataPublicacao);
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = Objects.requireNonNull(categoria);
    }

    public Set<Autor> getAutores() {
        return Collections.unmodifiableSet(autores);
    }

    public void adicionarAutor(Autor autor) {
        if (autor != null && autores.add(autor)) {
            autor.adicionarLivro(this);
        }
    }

    public void removerAutor(Autor autor) {
        if (autores.remove(autor)) {
            autor.removerLivro(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(isbn, livro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
