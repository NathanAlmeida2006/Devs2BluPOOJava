package aula03.exer01.questao01;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome da Agenda: ");
        String nomeAgenda = scanner.nextLine();
        Agenda agenda = new Agenda(nomeAgenda);

        for (int i = 0; i < 3; i++) {
            System.out.println("\nContato " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            Contato contato = new Contato(nome, telefone, email);
            agenda.adicionarContato(contato);
        }

        System.out.println("\nAgenda: " + agenda.getNome());
        System.out.println(agenda.listarTodos());

        scanner.close();
    }
}
