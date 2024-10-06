package aula03.extra.questao02;

import aula03.extra.questao02.interfaces.IBateria;
import aula03.extra.questao02.model.Bateria;
import aula03.extra.questao02.model.Celular;
import aula03.extra.questao02.repository.CelularRepository;
import aula03.extra.questao02.service.CelularService;
import aula03.extra.questao02.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        CelularRepository repository = new CelularRepository();
        CelularService service = new CelularService(repository);
        ConsoleView view = new ConsoleView();

        try {
            IBateria bateria1 = new Bateria();
            IBateria bateria2 = new Bateria();

            Celular celular1 = new Celular("Samsung", "Galaxy S21", bateria1);
            Celular celular2 = new Celular("Apple", "iPhone 13", bateria2);

            service.cadastrarCelular(celular1);
            service.cadastrarCelular(celular2);

            view.mostrarListaCelulares(service.listarTodos());

            String id1 = celular1.getId();
            service.ligarCelular(id1);
            view.mostrarMensagem("Celular Samsung ligado!");

            service.buscarCelular(id1).ifPresent(view::mostrarCelular);

            String id2 = celular2.getId();
            service.carregarCelular(id2);
            view.mostrarMensagem("iPhone está carregando!");

            service.buscarCelular(id2).ifPresent(view::mostrarCelular);

            view.mostrarListaCelulares(service.listarTodos());

        } catch (Exception e) {
            view.mostrarErro("Ocorreu um erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
