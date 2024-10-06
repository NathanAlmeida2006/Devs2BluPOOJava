package aula03.extra.questao02.service;

import aula03.extra.questao02.interfaces.ICelularRepository;
import aula03.extra.questao02.model.Celular;
import java.util.List;
import java.util.Optional;

/**
 * Classe de serviço que contém a lógica de negócio para celulares.
 */
public class CelularService {
    private final ICelularRepository repository;

    /**
     * Construtor que inicializa o serviço com um repositório.
     *
     * @param repository Repositório a ser utilizado pelo serviço.
     */
    public CelularService(ICelularRepository repository) {
        this.repository = repository;
    }

    public void cadastrarCelular(Celular celular) {
        repository.salvar(celular);
    }

    public void atualizarCelular(Celular celular) {
        repository.atualizar(celular);
    }

    public void removerCelular(String id) {
        repository.deletar(id);
    }

    public Optional<Celular> buscarCelular(String id) {
        return repository.buscarPorId(id);
    }

    public List<Celular> listarTodos() {
        return repository.buscarTodos();
    }

    public void ligarCelular(String id) {
        repository.buscarPorId(id).ifPresent(celular -> {
            celular.ligar();
            repository.atualizar(celular);
        });
    }

    public void desligarCelular(String id) {
        repository.buscarPorId(id).ifPresent(celular -> {
            celular.desligar();
            repository.atualizar(celular);
        });
    }

    public void carregarCelular(String id) {
        repository.buscarPorId(id).ifPresent(celular -> {
            celular.carregar();
            repository.atualizar(celular);
        });
    }
}
