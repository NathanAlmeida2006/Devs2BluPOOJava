package aula03.extra.questao03.interfaces;

import aula03.extra.questao03.model.Pedido;

import java.util.List;

/**
 * Interface que define os serviços relacionados à gestão de pedidos.
 * Implementações desta interface são responsáveis por criar, enviar,
 * gerar notas fiscais e listar pedidos.
 */
public interface PedidoService {
    /**
     * Cria um novo pedido.
     *
     * @param pedido O pedido a ser criado.
     * @return O pedido criado.
     */
    Pedido criarPedido(Pedido pedido);

    /**
     * Envia o pedido com o identificador especificado.
     *
     * @param id O identificador do pedido a ser enviado.
     */
    void enviarPedido(Long id);

    /**
     * Gera a nota fiscal para o pedido com o identificador especificado.
     *
     * @param id O identificador do pedido para o qual será gerada a nota fiscal.
     */
    void gerarNotaFiscal(Long id);

    /**
     * Lista todos os pedidos registrados.
     *
     * @return Uma lista de todos os pedidos.
     */
    List<Pedido> listarPedidos();
}
