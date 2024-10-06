package aula03.extra.questao01.view;

import aula03.extra.questao01.model.Autor;
import aula03.extra.questao01.model.Livro;
import aula03.extra.questao01.service.BibliotecaService;

import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * A classe {@code ConsoleView} é responsável pela exibição de informações sobre os livros
 * e estatísticas da biblioteca no console. Ela utiliza o {@code BibliotecaService} para
 * obter dados e formatá-los para a saída no console.
 */
public class ConsoleView {

    // Formato de data usado para exibir a data de publicação dos livros
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Serviço que fornece acesso aos dados da biblioteca
    private final BibliotecaService bibliotecaService;

    /**
     * Construtor da classe {@code ConsoleView}.
     * Inicializa a interface de exibição de dados com o serviço da biblioteca.
     *
     * @param bibliotecaService o serviço da biblioteca usado para obter informações
     */
    public ConsoleView(BibliotecaService bibliotecaService) {
        this.bibliotecaService = bibliotecaService;
    }

    /**
     * Exibe os detalhes de um livro no console.
     * Mostra informações como ISBN, título, data de publicação, categoria e autores.
     *
     * @param livro o livro cujos detalhes serão exibidos
     */
    public void mostrarLivro(Livro livro) {
        System.out.println("\n=== Detalhes do Livro ===");
        System.out.println("ISBN: " + livro.getIsbn());
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Data de Publicação: " + livro.getDataPublicacao().format(DATE_FORMATTER));
        System.out.println("Categoria: " + livro.getCategoria().getNome());
        System.out.println("Autores:");
        for (Autor autor : livro.getAutores()) {
            System.out.println("  - " + autor.getNome() + " (" + autor.getNacionalidade() + ")");
        }
        System.out.println("========================\n");
    }

    /**
     * Exibe uma lista de livros no console.
     * Formata a saída em forma de tabela com ISBN, título, data de publicação e categoria.
     *
     * @param livros a lista de livros a ser exibida
     */
    public void mostrarListaLivros(List<Livro> livros) {
        System.out.println("\n=== Lista de Livros ===");
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado.");
        } else {
            System.out.printf("%-15s %-30s %-15s %-20s%n", "ISBN", "Título", "Data Pub.", "Categoria");
            System.out.println("-".repeat(80));

            for (Livro livro : livros) {
                System.out.printf("%-15s %-30s %-15s %-20s%n",
                        livro.getIsbn(),
                        limitarTexto(livro.getTitulo()),
                        livro.getDataPublicacao().format(DATE_FORMATTER),
                        livro.getCategoria().getNome());
            }
        }
        System.out.println("======================\n");
    }

    /**
     * Exibe os resultados de uma busca de livros no console.
     * Mostra o termo de busca e os livros correspondentes encontrados.
     *
     * @param termoBusca o termo usado para buscar livros
     * @param resultados a lista de livros que correspondem ao termo de busca
     */
    public void mostrarResultadoBusca(String termoBusca, List<Livro> resultados) {
        System.out.println("\n=== Resultado da Busca ===");
        System.out.println("Termo buscado: " + termoBusca);
        System.out.println("Livros encontrados: " + resultados.size());
        mostrarListaLivros(resultados);
    }

    /**
     * Exibe as estatísticas da biblioteca no console.
     * Mostra o total de livros cadastrados no sistema.
     */
    public void mostrarEstatisticas() {
        System.out.println("\n=== Estatísticas da Biblioteca ===");
        System.out.println("Total de livros: " + bibliotecaService.getTotalLivros());
        System.out.println("==============================\n");
    }

    /**
     * Exibe uma mensagem informativa no console.
     *
     * @param mensagem a mensagem a ser exibida
     */
    public void mostrarMensagem(String mensagem) {
        System.out.println("\n>>> " + mensagem);
    }

    /**
     * Exibe uma mensagem de erro no console.
     *
     * @param mensagem a mensagem de erro a ser exibida
     */
    public void mostrarErro(String mensagem) {
        System.err.println("\n!!! Erro: " + mensagem);
    }

    /**
     * Limita o tamanho de um texto, cortando-o e adicionando reticências ("...") se exceder o comprimento máximo.
     *
     * @param texto o texto a ser limitado
     * @return o texto original, se for menor ou igual ao tamanho máximo, ou o texto cortado com "..." se exceder o limite
     */
    private String limitarTexto(String texto) {
        if (texto.length() <= 28) return texto;
        return texto.substring(0, 28 - 3) + "...";
    }
}
