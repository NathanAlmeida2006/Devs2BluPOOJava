package aula04.exerEsquenta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 1000);
        Assistente assistente = new Assistente("Maria", 2000, 12345);
        Administrativo administrativo = new Administrativo("Carlos", 2000, 84572, 1536);
        Tecnico tecnico = new Tecnico("Ana", 2200, 54321, "Menor infeliz maior de idade (suporte)");

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario);
        funcionarios.add(assistente);
        funcionarios.add(administrativo);
        funcionarios.add(tecnico);

        System.out.println("Dados antes do aumento:");
        for (Funcionario f : funcionarios) {
            f.exibirDados();
            System.out.println();
        }

        funcionario.addAumento(500);
        assistente.addAumento(600);
        administrativo.addAumento(700);
        tecnico.addAumento(800);

        System.out.println("Dados após o aumento:");
        for (Funcionario f : funcionarios) {
            f.exibirDados();
            System.out.println();
        }
    }
}
