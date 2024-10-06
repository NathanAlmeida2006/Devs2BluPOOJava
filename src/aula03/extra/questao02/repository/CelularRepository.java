package aula03.extra.questao02.repository;

import aula03.extra.questao02.interfaces.ICelularRepository;
import aula03.extra.questao02.model.Celular;
import java.util.*;

/**
 * Implementação do repositório de celulares usando um Map para armazenar dados.
 */
public class CelularRepository implements ICelularRepository {
    private final Map<String, Celular> celulares = new HashMap<>();

    @Override
    public void salvar(Celular celular) {
        celulares.put(celular.getId(), celular);
    }

    @Override
    public void atualizar(Celular celular) {
        celulares.put(celular.getId(), celular);
    }

    @Override
    public void deletar(String id) {
        celulares.remove(id);
    }

    @Override
    public Optional<Celular> buscarPorId(String id) {
        return Optional.ofNullable(celulares.get(id));
    }

    @Override
    public List<Celular> buscarTodos() {
        return new ArrayList<>(celulares.values());
    }
}
