package aula03.exer02.questao02;

public class Questao {
    private String enunciado;
    private int bimestre;
    private Materia materia;
    private String gabarito;
    private int pontuacao;

    public Questao() {
    }

    public Questao(String enunciado, int bimestre, Materia materia, String gabarito, int pontuacao) {
        this.enunciado = enunciado;
        this.bimestre = bimestre;
        this.materia = materia;
        this.gabarito = gabarito;
        this.pontuacao = pontuacao;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getBimestre() {
        return bimestre;
    }

    public void setBimestre(int bimestre) {
        this.bimestre = bimestre;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getGabarito() {
        return gabarito;
    }

    public void setGabarito(String gabarito) {
        this.gabarito = gabarito;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}