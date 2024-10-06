package aula03.extra.questao01.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Representa um autor, incluindo seus dados pessoais e livros escritos.
 */
public class Autor {

    private final String id;
    private String nome;
    private String nacionalidade;
    private final List<Livro> livrosEscritos;

    /**
     * Constrói um Autor com os dados fornecidos.
     *
     * @param id o ID único do autor
     * @param nome o nome do autor
     * @param nacionalidade a nacionalidade do autor
     */
    public Autor(String id, String nome, String nacionalidade) {
        this.id = Objects.requireNonNull(id, "ID não pode ser nulo");
        this.nome = Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.nacionalidade = nacionalidade;
        this.livrosEscritos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = Objects.requireNonNull(nome, "Nome não pode ser nulo");
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public List<Livro> getLivrosEscritos() {
        return Collections.unmodifiableList(livrosEscritos);
    }

    void adicionarLivro(Livro livro) {
        if (livro != null && !livrosEscritos.contains(livro)) {
            livrosEscritos.add(livro);
        }
    }

    void removerLivro(Livro livro) {
        livrosEscritos.remove(livro);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(id, autor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}