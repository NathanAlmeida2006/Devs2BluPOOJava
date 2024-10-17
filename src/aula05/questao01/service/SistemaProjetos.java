package aula05.questao01.service;

import aula05.questao01.models.Aluno;
import aula05.questao01.models.Professor;
import aula05.questao01.models.ProjetoPesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaProjetos {
    private final List<ProjetoPesquisa> projetos;
    private final List<Professor> professoresCadastrados;
    private final Scanner scanner;

    public SistemaProjetos() {
        this.projetos = new ArrayList<>();
        this.professoresCadastrados = new ArrayList<>();
        this.scanner = new Scanner(System.in);

        Professor professorInicial = new Professor("HELOISA Carioca <3", 30);
        professoresCadastrados.add(professorInicial);
    }

    public void menu() {
        int opcao;
        do {
            System.out.println("\n=== SISTEMA DE PROJETOS DE PESQUISA ===");
            System.out.println("1 - Cadastrar projeto com um integrante");
            System.out.println("2 - Cadastrar projeto com vários integrantes");
            System.out.println("3 - Cadastrar vários projetos com vários integrantes");
            System.out.println("4 - Buscar projeto por código");
            System.out.println("5 - Listar professores cadastrados");
            System.out.println("6 - Cadastrar novo professor");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProjetoUmIntegrante();
                    break;
                case 2:
                    cadastrarProjetoVariosIntegrantes();
                    break;
                case 3:
                    cadastrarVariosProjetosVariosIntegrantes();
                    break;
                case 4:
                    buscarProjeto();
                    break;
                case 5:
                    listarProfessores();
                    break;
                case 6:
                    cadastrarNovoProfessor();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void cadastrarNovoProfessor() {
        System.out.println("\n=== CADASTRO DE PROFESSOR ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        Professor novoProfessor = new Professor(nome, idade);
        professoresCadastrados.add(novoProfessor);
        System.out.println("Professor cadastrado com sucesso!");
    }

    private void adicionarIntegrante(ProjetoPesquisa projeto) {
        System.out.println("\nTipo de integrante:");
        System.out.println("1 - Professor");
        System.out.println("2 - Aluno");
        System.out.print("Escolha: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        if (tipo == 1) {
            System.out.println("\nProfessores disponíveis:");
            listarProfessores();

            System.out.println("\nDeseja:");
            System.out.println("1 - Selecionar professor existente");
            System.out.println("2 - Cadastrar novo professor");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                System.out.print("Nome do professor: ");
                String nome = scanner.nextLine();

                Professor professorExistente = professoresCadastrados.stream()
                        .filter(p -> p.getNome().equalsIgnoreCase(nome))
                        .findFirst()
                        .orElse(null);

                if (professorExistente != null) {
                    projeto.adicionarPesquisador(professorExistente);
                    System.out.println("Professor adicionado com sucesso!");
                } else {
                    System.out.println("Professor não encontrado! Operação cancelada.");
                }
            } else {
                System.out.print("Nome do novo professor: ");
                String nome = scanner.nextLine();
                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();

                Professor novoProfessor = new Professor(nome, idade);
                professoresCadastrados.add(novoProfessor);
                projeto.adicionarPesquisador(novoProfessor);
                System.out.println("Novo professor cadastrado e adicionado ao projeto com sucesso!");
            }
        } else {
            System.out.print("Nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();
            projeto.adicionarPesquisador(new Aluno(nome, matricula));
            System.out.println("Aluno adicionado com sucesso!");
        }
    }

    private void listarProfessores() {
        System.out.println("\n=== PROFESSORES CADASTRADOS ===");
        for (Professor prof : professoresCadastrados) {
            System.out.println("Nome: " + prof.getNome());
        }
    }

    private ProjetoPesquisa criarProjeto() {
        System.out.println("\n=== CADASTRO DE PROJETO ===");
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Data de Início: ");
        String dataInicio = scanner.nextLine();
        System.out.print("Data de Fim: ");
        String dataFim = scanner.nextLine();

        System.out.println("\nProfessores disponíveis:");
        listarProfessores();

        Professor professorResponsavel;
        while (true) {
            System.out.println("\nDeseja:");
            System.out.println("1 - Selecionar professor existente");
            System.out.println("2 - Cadastrar novo professor");
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                System.out.print("Nome do professor responsável: ");
                String nomeProfessor = scanner.nextLine();

                professorResponsavel = professoresCadastrados.stream()
                        .filter(p -> p.getNome().equalsIgnoreCase(nomeProfessor))
                        .findFirst()
                        .orElse(null);

                if (professorResponsavel != null) {
                    break;
                } else {
                    System.out.println("Professor não encontrado! Por favor, escolha um professor da lista ou cadastre um novo.");
                }
            } else {
                System.out.print("Nome do novo professor: ");
                String nome = scanner.nextLine();
                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();

                professorResponsavel = new Professor(nome, idade);
                professoresCadastrados.add(professorResponsavel);
                System.out.println("Novo professor cadastrado com sucesso!");
                break;
            }
        }

        return new ProjetoPesquisa(codigo, titulo, dataInicio, dataFim, professorResponsavel);
    }

    private void cadastrarProjetoUmIntegrante() {
        ProjetoPesquisa projeto = criarProjeto();
        adicionarIntegrante(projeto);
        projetos.add(projeto);
        System.out.println("Projeto cadastrado com sucesso!");
    }

    private void cadastrarProjetoVariosIntegrantes() {
        ProjetoPesquisa projeto = criarProjeto();
        char continuar;
        do {
            adicionarIntegrante(projeto);
            System.out.print("Deseja adicionar mais um integrante? (S/N): ");
            continuar = scanner.nextLine().toUpperCase().charAt(0);
        } while (continuar == 'S');
        projetos.add(projeto);
        System.out.println("Projeto cadastrado com sucesso!");
    }

    private void cadastrarVariosProjetosVariosIntegrantes() {
        char continuarProjeto;
        do {
            cadastrarProjetoVariosIntegrantes();
            System.out.print("Deseja cadastrar mais um projeto? (S/N): ");
            continuarProjeto = scanner.nextLine().toUpperCase().charAt(0);
        } while (continuarProjeto == 'S');
    }

    private void buscarProjeto() {
        System.out.print("\nDigite o código do projeto: ");
        String codigo = scanner.nextLine();

        for (ProjetoPesquisa projeto : projetos) {
            if (projeto.getCodigo().equals(codigo)) {
                projeto.exibirDados();
                return;
            }
        }
        System.out.println("Projeto não encontrado!");
    }
}
