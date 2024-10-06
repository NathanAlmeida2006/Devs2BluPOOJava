package aula03.extra.questao03.repository;

import aula03.extra.questao03.model.Pedido;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementação da interface PedidoRepository que utiliza uma lista
 * em memória para armazenar pedidos.
 */
public class PedidoRepositoryImpl implements PedidoRepository {
    private final List<Pedido> pedidos = new ArrayList<>();

    /**
     * Salva o pedido na lista de pedidos.
     *
     * @param pedido O pedido a ser salvo.
     * @return O pedido salvo.
     */
    @Override
    public Pedido salvar(Pedido pedido) {
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getId().equals(pedido.getId())) {
                pedidos.set(i, pedido);
                return pedido;
            }
        }
        pedidos.add(pedido);
        return pedido;
    }


    /**
     * Busca um pedido pelo seu identificador único.
     *
     * @param id O identificador do pedido.
     * @return O pedido correspondente ao identificador, ou null se não for encontrado.
     */
    @Override
    public Pedido buscarPorId(Long id) {
        return pedidos.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    /**
     * Retorna todos os pedidos registrados.
     *
     * @return Uma lista de todos os pedidos.
     */
    @Override
    public List<Pedido> buscarTodos() {
        return new ArrayList<>(pedidos);
    }

    /**
     * Remove o pedido com o identificador especificado da lista de pedidos.
     *
     * @param id O identificador do pedido a ser deletado.
     */
    @Override
    public void deletar(Long id) {
        pedidos.removeIf(p -> p.getId().equals(id));
    }
}
