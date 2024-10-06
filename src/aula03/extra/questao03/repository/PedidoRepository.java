package aula03.extra.questao03.repository;

import aula03.extra.questao03.model.Pedido;

import java.util.List;

/**
 * Interface que define os métodos de persistência para a entidade Pedido.
 * Implementações desta interface serão responsáveis por salvar, buscar e
 * deletar pedidos em um repositório de dados.
 */
public interface PedidoRepository {
    /**
     * Salva o pedido no repositório.
     *
     * @param pedido O pedido a ser salvo.
     * @return O pedido salvo.
     */
    Pedido salvar(Pedido pedido);

    /**
     * Busca um pedido pelo seu identificador único.
     *
     * @param id O identificador do pedido.
     * @return O pedido correspondente ao identificador, ou null se não for encontrado.
     */
    Pedido buscarPorId(Long id);

    /**
     * Busca todos os pedidos registrados no repositório.
     *
     * @return Uma lista de todos os pedidos.
     */
    List<Pedido> buscarTodos();

    /**
     * Deleta o pedido com o identificador especificado.
     *
     * @param id O identificador do pedido a ser deletado.
     */
    void deletar(Long id);
}
