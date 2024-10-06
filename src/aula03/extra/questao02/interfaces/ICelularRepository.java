package aula03.extra.questao02.interfaces;

import aula03.extra.questao02.model.Celular;
import java.util.List;
import java.util.Optional;

/**
 * Interface que define operações de repositório para celulares.
 */
public interface ICelularRepository {
    /**
     * Salva um novo celular no repositório.
     *
     * @param celular Celular a ser salvo.
     */
    void salvar(Celular celular);

    /**
     * Atualiza um celular existente no repositório.
     *
     * @param celular Celular a ser atualizado.
     */
    void atualizar(Celular celular);

    /**
     * Deleta um celular do repositório baseado no ID.
     *
     * @param id ID do celular a ser deletado.
     */
    void deletar(String id);

    /**
     * Busca um celular pelo seu ID.
     *
     * @param id ID do celular.
     * @return Optional com o celular, se encontrado.
     */
    Optional<Celular> buscarPorId(String id);

    /**
     * Retorna uma lista com todos os celulares do repositório.
     *
     * @return Lista de celulares.
     */
    List<Celular> buscarTodos();
}
