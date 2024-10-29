package aula07.exer02;

public class Main {
    public static void main(String[] args) {
        Exame exameSangue = new ExameSangue("Carlos");
        Exame exameUrina = new ExameUrina("Ana");
        Exame exameCovid = new ExameCovid("João");

        processarExame(exameSangue);
        processarExame(exameUrina);
        processarExame(exameCovid);
    }

    public static void processarExame(Exame exame) {
        System.out.println(exame.realizarExame());
    }
}
