package aula02.questao02;

public class Questao {
    private String enunciado;
    private int bimestre;
    private Materia materia;
    private String gabarito;

    public Questao() {
    }

    public Questao(String enunciado, int bimestre, Materia materia, String gabarito) {
        this.enunciado = enunciado;
        this.bimestre = bimestre;
        this.materia = materia;
        this.gabarito = gabarito;
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
}
