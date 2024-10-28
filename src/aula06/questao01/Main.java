package aula06.questao01;

import aula06.questao01.models.Autor;
import aula06.questao01.models.Livro;
import aula06.questao01.services.AluguelService;
import aula06.questao01.services.BibliotecaService;

public class Main {
    public static void main(String[] args) {
        BibliotecaService biblioteca = new BibliotecaService();

        Autor autor1 = new Autor("George Orwell");
        Livro livro1 = new Livro("1984", autor1);

        Autor autor2 = new Autor("Miguel de Cervantes");
        Livro livro2 = new Livro("Dom Quixote", autor2);

        Autor autor3 = new Autor("John Lock");
        Livro livro3 = new Livro("Star Wars", autor3);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        AluguelService.alugar(livro1);
        AluguelService.alugar(livro2);

        biblioteca.gerarRelatorioLivros();
        biblioteca.mostrarLivros();
    }
}
