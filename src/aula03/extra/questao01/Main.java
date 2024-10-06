package aula03.extra.questao01;

import aula03.extra.questao01.model.Autor;
import aula03.extra.questao01.model.Categoria;
import aula03.extra.questao01.model.Livro;
import aula03.extra.questao01.repository.LivroRepository;
import aula03.extra.questao01.service.BibliotecaService;
import aula03.extra.questao01.view.ConsoleView;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LivroRepository repository = new LivroRepository();
        BibliotecaService bibliotecaService = new BibliotecaService(repository);
        ConsoleView consoleView = new ConsoleView(bibliotecaService);

        try {
            Categoria ficcao = new Categoria("1", "Ficção Científica", "Livros de ficção científica");
            Categoria romance = new Categoria("2", "Romance", "Livros de romance");

            Autor autor1 = new Autor("1", "Isaac Asimov", "Americano");
            Autor autor2 = new Autor("2", "Arthur C. Clarke", "Britânico");
            Autor autor3 = new Autor("3", "Jane Austen", "Britânica");

            Livro livro1 = new Livro("9780553293357", "Fundação",
                    LocalDate.of(1951, 5, 1), ficcao);
            livro1.adicionarAutor(autor1);

            Livro livro2 = new Livro("9780553288117", "2001: Uma Odisseia no Espaço",
                    LocalDate.of(1968, 6, 1), ficcao);
            livro2.adicionarAutor(autor2);

            Livro livro3 = new Livro("9780141439518", "Orgulho e Preconceito",
                    LocalDate.of(1813, 1, 28), romance);
            livro3.adicionarAutor(autor3);

            bibliotecaService.adicionar(livro1);
            bibliotecaService.adicionar(livro2);
            bibliotecaService.adicionar(livro3);

            consoleView.mostrarMensagem("Bem-vindo ao Sistema de Biblioteca!");

            consoleView.mostrarEstatisticas();

            List<Livro> todosLivros = repository.listarTodos();
            consoleView.mostrarListaLivros(todosLivros);

            String termoBusca = "fundação";
            List<Livro> resultadosBusca = bibliotecaService.buscarPorTitulo(termoBusca);
            consoleView.mostrarResultadoBusca(termoBusca, resultadosBusca);

            Livro livroEncontrado = bibliotecaService.buscarPorIsbn("9780553293357");
            if (livroEncontrado != null) {
                consoleView.mostrarLivro(livroEncontrado);
            }

            bibliotecaService.remover(livro2);
            consoleView.mostrarMensagem("Livro '2001: Uma Odisseia no Espaço' removido.");
            consoleView.mostrarEstatisticas();

        } catch (Exception e) {
            consoleView.mostrarErro("Ocorreu um erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
