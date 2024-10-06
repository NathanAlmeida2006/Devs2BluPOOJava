package aula03.extra.questao01.model;

import java.util.Objects;

/**
 * Representa uma categoria de livros, como Ficção ou Romance.
 */
public class Categoria {

    private final String id;
    private String nome;
    private String descricao;

    /**
     * Constrói uma Categoria com os dados fornecidos.
     *
     * @param id o ID único da categoria
     * @param nome o nome da categoria
     * @param descricao a descrição da categoria
     */
    public Categoria(String id, String nome, String descricao) {
        this.id = Objects.requireNonNull(id, "ID não pode ser nulo");
        this.nome = Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.descricao = descricao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}