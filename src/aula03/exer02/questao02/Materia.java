package aula03.exer02.questao02;

public class Materia {
    private String nome;
    private String serie;

    public Materia() {
    }

    public Materia(String nome, String serie) {
        this.nome = nome;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}