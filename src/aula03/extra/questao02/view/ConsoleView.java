package aula03.extra.questao02.view;

import aula03.extra.questao02.model.Celular;

import java.util.List;

/**
 * A classe {@code ConsoleView} é responsável por exibir as informações dos celulares e mensagens
 * no console. Ela utiliza o serviço {@code CelularService} para gerenciar as operações relacionadas
 * aos celulares.
 */
public class ConsoleView {

    /**
     * Construtor da classe {@code ConsoleView}.
     *
     */
    public ConsoleView() {
    }

    /**
     * Exibe as informações detalhadas de um celular no console.
     *
     * @param celular O objeto {@code Celular} cujas informações serão exibidas.
     */
    public void mostrarCelular(Celular celular) {
        System.out.println("\n=== Status do Celular ===");
        System.out.println("ID: " + celular.getId());
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Status: " + (celular.isLigado() ? "Ligado" : "Desligado"));
        System.out.println("Nível da Bateria: " + celular.getNivelBateria() + "%");
        System.out.println("Carregando: " + (celular.isCarregando() ? "Sim" : "Não"));
        System.out.println("=====================\n");
    }

    /**
     * Exibe uma lista de celulares cadastrados no console.
     *
     * @param celulares A lista de objetos {@code Celular} a serem exibidos.
     */
    public void mostrarListaCelulares(List<Celular> celulares) {
        System.out.println("\n=== Lista de Celulares ===");
        if (celulares.isEmpty()) {
            System.out.println("Nenhum celular cadastrado.");
        } else {
            System.out.printf("%-36s %-10s %-15s %-8s %-5s%n",
                    "ID", "Marca", "Modelo", "Status", "Bateria");
            System.out.println("-".repeat(80));

            for (Celular celular : celulares) {
                System.out.printf("%-36s %-10s %-15s %-8s %-5d%%%n",
                        celular.getId(),
                        celular.getMarca(),
                        celular.getModelo(),
                        celular.isLigado() ? "Ligado" : "Desligado",
                        celular.getNivelBateria());
            }
        }
        System.out.println("========================\n");
    }

    /**
     * Exibe uma mensagem informativa no console.
     *
     * @param mensagem A mensagem a ser exibida.
     */
    public void mostrarMensagem(String mensagem) {
        System.out.println("\n>>> " + mensagem);
    }

    /**
     * Exibe uma mensagem de erro no console.
     *
     * @param mensagem A mensagem de erro a ser exibida.
     */
    public void mostrarErro(String mensagem) {
        System.err.println("\n!!! Erro: " + mensagem);
    }
}
